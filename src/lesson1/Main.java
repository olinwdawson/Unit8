package lesson1;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] myGrid = new int[2][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                myGrid[row][col] = rand.nextInt(0, 100);
            }
        }
        //row-major traversal; all elements in a row accessed before next one
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.print(myGrid[row][col] + " ");
            }
            System.out.println();
        }


        String[][] attendance = {
                {"Tristan", "Absent"},
                {"Henry", "Present"},
                {"Sydney", "Present"},
                {"Mr. Smith", "Absent"}
        };

        //print with enhanced for loop
        for (String[] row : attendance) {
            for (String col : row) {
                System.out.println(col);
            }
        }

        //column-major traversal; all elements in a column accessed before next
        int[][] testArray = {{28,64},
                             {60,61}};

        /*
        Output should be
        Column 1: 28 60
        Column 2: 64 61

        Hints: testArray.length gives you number of rows
               testArray[0].length give you the number of columns
         */
        for(int col = 0; col < testArray[0].length;col++){
            System.out.print("Column "+(col+1)+": ");
            for(int row = 0; row<testArray.length;row++){
                System.out.print(testArray[row][col]+" ");
            }
            System.out.println();
        }
    }
}
