/*
 * Written By Grant Capers
 */
package homework3;
import java.util.Scanner;

public class Rectangle 
{
	static int length;
	//Need to create a function to print the area array of the rectangles
	static void printArea(double[] array)
	{
		//Have to have for loop for array
		{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println(); }
		}
		//Need function to sort the array in the ascending order
		static void sortArray(double[] array)
		{
			double temp = 0;
			
			for (int i = 0; i < array.length; i++) //this is nested for loop to sort the array 
			{
				for (int j = i + 1; j < array.length; j++)
				{
					if (array[i] > array[j])
					{
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("Display the sorted area: ");
			//Need to print the sorted array
			printArea(array);
		}
			
			public static void main(String[] args) 
			{
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number of rectangles: ");
				length = sc.nextInt(); //have to read the size of rectangles from the user
				while(length<=0) //in case the user enters an invalid length 
				{
					System.out.println("Enter valid number of rectangles: ");
					//Need to have user enter the length 
					length=sc.nextInt();
				}
					double[] rec_Length = new double[length];
					double[] rec_Breadth = new double[length];
					
					System.out.println("Enter the length and breadth of each rectangles in order: ");
					
					for(int i=0; i<length; i++)
					{
						rec_Length[i]=sc.nextDouble();
						rec_Breadth[i]=sc.nextDouble();
					}
					int newLength = Math.min(rec_Length. length, rec_Breadth. length);
				double[] rec_Area = new double[newLength];
				
				for(int j=0;j<newLength;j++)
				{
					rec_Area[j]=0.0;
					rec_Area[j]=rec_Length[j]*rec_Breadth[j];
					System.out.println(rec_Area[j]+" ");
				}
				
				System.out.println("The list of area of the rectangles: ");
				printArea(rec_Area);
				sortArray(rec_Area);
				
				}
	}

