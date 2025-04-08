import java.util.Arrays;
public class Board {
    String grid[][];
    int size;

    

    public Board(int s) {
        this.size = s;
        this.grid = new String[size][size];
    }

    public void display(){
        System.out.println(Arrays.toString(grid[0]));
        System.out.println(Arrays.toString(grid[1]));
        System.out.println(Arrays.toString(grid[2]));
    }


    public boolean makeMove(int row, int col, String symbol){
        if (grid[row][col] == null){
            grid[row][col] =symbol;
            return true;
        } else {
            System.out.println("Can't place an "+symbol+" there!");
            return false;
        }
    }



    public boolean checkWinner(String symbol){
        for (int i = 0; i < this.size; i++){
            if (grid[i][0] == symbol || grid[0][i] == symbol){
                if (grid[i][0] == grid[i][1] && grid[i][0] == grid[i][2]){
                    return true;
                }
                if (grid[0][i] == grid[1][i] && grid[0][i] == grid[2][i]){
                    return true;
                }
            }
        }
        if (grid[1][1] == symbol && ((grid[0][0] == symbol && grid[2][2] == symbol) ||
                                     (grid[0][2] == symbol && grid[2][0] == symbol))){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        int counter = 0;
        for (String[] row : grid) {
            for (String cell : row) {
                if (cell != null){
                    counter++;
                }
            }
        }
        return (counter == size*size);
    }
}
