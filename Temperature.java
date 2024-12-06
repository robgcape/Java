package temp;
/*
 * Written By Grant Capers
 */
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//need to declare array to store the temps
		double[] temperatures = new double [10];
		
		//need to have scanner object for the input
		Scanner input = new Scanner(System.in);
		
		double average, sum = 0.0;
		int count = 0;
				
				//Take the user input and store it in a array and I need to add the user input of temp to sum
		for(int i=0; i<10; i++)
		{
			System.out.print("Welcome to the below average temperature tester program! ");
			
			System.out.print("Enter the temperature for the day "+(i+1)+" : ");
			temperatures[i] = input.nextDouble();
			sum += temperatures[i];
		}
		//finding the avg
		average = sum /10; 
		
		//I now need to find the number of days that are below the avg
		for(int i=0; i<10; i++)
		{
			if(temperatures[i] < average)
				count++;
		}
			//Need to print the avg
		System.out.println("\nThe average Temperature is : "+average +"\n");
	
	
	if(count>0)
	{
		System.out.println("There are " + count + "days that were below the average temperature\n");
		for (int i = 0; i < 10; i++)
		{
			if (temperatures[i] < average)
				System.out.println("Day " + (i + 1) + " : " + temperatures[i] +"\n");
		}
	}
	}

}
