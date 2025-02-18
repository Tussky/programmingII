import java.util.Scanner;

public class TicTacToe {
    Player player1;
    Player player2;
    Player currentPlayer;
    Board board;

    
    public TicTacToe(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = player1;
    }

    public void switchPlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
        }
        else {
            currentPlayer = player1;
        }
    }

    public void makeMove(int row, int col){
        board.makeMove(row, col, this.currentPlayer.getSymbol());
    }

    public void startGame(){
        Scanner input = new Scanner(System.in);
        while (board.isFull() == false || board.checkWinner(currentPlayer.getSymbol())){
            switchPlayer();
            System.out.println("Next player...");
            System.out.println();
            System.out.println("Current board...");
            board.display();
            System.out.println("Select the row: ");
            int chosenRow = input.nextInt();
            System.out.println("Select the column: ");
            int chosenColumn = input.nextInt();
            
            makeMove(chosenRow, chosenColumn);
            System.out.println("New Board");
            board.display();
        }
        if (board.checkWinner(currentPlayer.getSymbol())) {
            System.out.println("Player "+ currentPlayer.getName()+" has won!");
        }
        else {
            System.out.println("The Board is full and the game is a tie...");
        }
    }
}
