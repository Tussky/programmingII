public class tester {
    public static void main(String[] args) {
        Player player1 = new Player("player1", "X");
        Player player2 = new Player("player2", "0");
        Board gameBoard = new Board(3);

        TicTacToe newGame = new TicTacToe(player1, player2, gameBoard);
        newGame.startGame();
    }
}
