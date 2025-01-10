package HW1;
import java.util.Scanner;
public class Unit8HW1{
	public static void main(String[] args) {
		//make your own 2D test array of integers (or whatever)
		Scanner sc = new Scanner(System.in);
		int [][] coolestArray = {
				{1,2,3,4},
				{1,4,9,16},
				{1,8,27,64},
				{1,16,54,256}
		};
		//ask user for column number
		//make sure it is a valid option
		System.out.println("What column? (Enter number from 1 to "+coolestArray.length+")");
		while(true){
			int col = sc.nextInt();
			if(col>coolestArray.length||col<1){
				System.out.println("Try again.");
			} else {
				columnPrinter(col, coolestArray);
			}
		}
		//print the column number they asked for with each element on a new line
	}
	public static void columnPrinter(int columnNumber,int[][] arr){
		columnNumber = columnNumber - 1;
		//for(int i =0; i<arr[columnNumber].length;i++){
		//	int num = arr[columnNumber][i];
		//	System.out.println(arr[columnNumber][i]);
		for (int [] num : arr) {
			System.out.println(num[columnNumber]);
		}
	}
}
