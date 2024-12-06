package triangle;
import java.util.Scanner;
/*
 * Written By Grant Capers
 */

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Triangle Maker! Enter the size of the triangle."); //need to create object of scanner to take the input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//this is to take input
		//remember to print the first n lines of the pattern
		for(int i = 1; i < n+1; i++) {
			for(int j = 0; j < i; j ++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		
		//need to print the last n lines of the pattern
		for(int i = n-1; i >= 1; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}

	}

}
