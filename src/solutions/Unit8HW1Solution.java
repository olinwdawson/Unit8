package solutions;
import java.util.Scanner;

public class Unit8HW1Solution {
        public static void main(String[] args) {
            //make your own 2D test array of integers (or whatever)
            int[][] testArr = {{2,5,4},
                                {3,4,3}};
            //ask user for column number
            Scanner scan = new Scanner(System.in);
            int colNum;

            //make sure it is a valid option
            while(true){
                System.out.print("What column do you want to print? Enter 1 or greater. ");
                colNum = scan.nextInt();
                if(colNum > testArr[0].length || colNum < 1){
                    System.out.println("Invalid number");
                }
                else{
                    break;
                }
            }

            //print the column number they asked for with each element on a new line
            columnPrinter(colNum,testArr);


        }
        public static void columnPrinter(int columnNumber,int[][]arr){
            columnNumber = columnNumber - 1;
            for (int[] row : arr) {
                System.out.println(row[columnNumber]);
            }
        }
    }
