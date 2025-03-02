package question3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Tournament {
    private ArrayList<String> teams = new ArrayList<>(Arrays.asList(
        "Uruguay", "Portugal", "France", "Argentina", "Brazil", 
        "Mexico", "Belgium", "Japan", "Spain", "Russia", 
        "Croatia", "Denmark", "Sweden", "Switzerland", "Colombia", "England"
    ));
    private String favoriteTeam;
    private Random randomiser = new Random();
    
    // Store goals per match in one tournament
    private ArrayList<Integer> goalStats = new ArrayList<>();
    // Store goals for each tournament separately
    private ArrayList<ArrayList<Integer>> allTournamentsStats = new ArrayList<>();
    
    private ArrayList<String> ROUNDNAMES = new ArrayList<>(Arrays.asList("ROUND OF 16", "QUARTER-FINALS", "SEMI-FINALS", "FINAL"));
    private String winner;
    private int attempts = 0;
    private int max_tournament_count = 5;

    public Tournament(String favTeam){
        favTeam = favTeam.strip();
        favTeam = favTeam.substring(0, 1).toUpperCase() + favTeam.substring(1).toLowerCase();

        if (!teams.contains(favTeam)){
            System.out.println("The team '"+favTeam+"' is not in the round of 16.");
            System.out.println("Here are the teams again...");
            System.out.println(teams);
        } else {
            this.favoriteTeam = favTeam;
        }
    }

    public String match(String team1, String team2){
        int score1 = randomiser.nextInt(5);
        int score2 = randomiser.nextInt(5);

        if (score1 == score2){
            if (randomiser.nextInt(2) == 0) score1++;
            else score2++;
        }

        // Store total goals for the match
        int totalGoals = score1 + score2;
        goalStats.add(totalGoals);

        if (score1 < score2) {
            teams.remove(team1);
        } else {
            teams.remove(team2);
        }

        return (team1 + " " + score1 + " : " + team2 + " " + score2);
    }

    public ArrayList<String> hold_round(){
        ArrayList<String> results = new ArrayList<>();
        ArrayList<String> bracket1 = new ArrayList<>(teams.subList(0, teams.size() / 2));
        ArrayList<String> bracket2 = new ArrayList<>(teams.subList(teams.size() / 2, teams.size()));

        for (int i = 0; i < bracket1.size(); i++){
            results.add(this.match(bracket1.get(i), bracket2.get(i)));
        } 
    
        return results;
    }

    public void hold_tournament(){
        goalStats.clear(); // Clear previous goal stats before each tournament

        for (int i = 0; i < 4; i++) {
            System.out.println(ROUNDNAMES.get(i) + " " + hold_round());
        }
        
        this.winner = teams.get(0);
        attempts++;
        System.out.println("Winner: " + winner);

        // Save this tournament's goal stats
        allTournamentsStats.add(new ArrayList<>(goalStats));

        // Reset teams for next tournament
        teams = new ArrayList<>(Arrays.asList(
            "Uruguay", "Portugal", "France", "Argentina", "Brazil", 
            "Mexico", "Belgium", "Japan", "Spain", "Russia", 
            "Croatia", "Denmark", "Sweden", "Switzerland", "Colombia", "England"
        ));
    }

    public void fav_is_winner(){
        for (int i = 0; i < max_tournament_count; i++) {
            hold_tournament();
            if (this.winner.equals(favoriteTeam)){
                System.out.println("Your team won!");
                break;
            }
        }
        System.out.println("Your team did not win!");
    }

    // Display stats for all tournaments
    public void displayGoalStats() {
        int totalTournaments = allTournamentsStats.size();
        if (totalTournaments == 0) {
            System.out.println("No tournaments have been played yet.");
            return;
        }

        double totalGoalsAll = 0;
        int totalMatchesAll = 0;

        System.out.println("\nGOAL STATS FOR ALL TOURNAMENTS:");
        for (int i = 0; i < totalTournaments; i++) {
            ArrayList<Integer> tournamentGoals = allTournamentsStats.get(i);
            double totalGoals = 0;

            for (int goals : tournamentGoals) {
                totalGoals += goals;
            }

            totalGoalsAll += totalGoals;
            totalMatchesAll += tournamentGoals.size();

            double avgGoals = totalGoals / tournamentGoals.size();
            System.out.println("Tournament " + (i + 1) + ": " + tournamentGoals);
            System.out.println("  - Total goals: " + (int)totalGoals);
            System.out.println("  - Avg goals per match: " + String.format("%.1f", avgGoals));
        }

        double overallAvg = totalGoalsAll / totalMatchesAll;
        System.out.println("\nTOTAL GOALS ACROSS ALL TOURNAMENTS: " + (int)totalGoalsAll);
        System.out.println("OVERALL AVG GOALS PER MATCH: " + String.format("%.1f", overallAvg));
    }
}
