/*
 * Written by Grant Capers
 */
package homework;
import java.util.Scanner;

public class BinaryAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Need to create and print where user enters first binary number
		System.out.println("Enter a 4-bit binary number: ");
		String binary1= scanner.nextLine();
		
		//Now for second number
		System.out.println("Enter another 4-bit binary number");
		String binary2 = scanner.nextLine();
		
		//Have to convert the numbers into decimals
		int decimal1 = binaryToDecimal(binary1);
		int decimal2 = binaryToDecimal(binary2);
		
		//Adding the decimals
		int sum = decimal1 + decimal2;
		
		//I need to print the decimals and the sum
		System.out.println("The first decimal number is: " + decimal1);
		System.out.println("The second decimal number is: " + decimal2);
		System.out.println("The sum of the decimal numbers is: " + sum);
		
	}
	//Need to create method to convert the binary numbers into decimals
	public static int binaryToDecimal(String binary) {
		int decimal = 0;
		int length = binary.length();
		
		for (int i = 0; i < length; i++) {
			if (binary.charAt(i) == '1') {
				decimal += Math.pow(2, length - 1 - i);
			}
		}
		return decimal;
	}

}
