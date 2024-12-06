package Lab;
/* Written By Grant Capers
 * 
 */
import java.util.Scanner;

/*
 * Class date needs to be used to represent a date with valid month and a day
 */
class Date {
	public int month;
	public int day;
	
	/*
	 * Need to initialize the date to construct
	 */
	public Date(int m, int d) {
		month = m;
		day = d;
	}
}

public class ZodiacSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date[][] dates = new Date [12][2];
		/*
		 * For Aries: March 21 to  April 19
		 */
		dates[0][0] = new Date (3,21);
		dates[0][1] = new Date(4, 19);
		
		/*
		 * For Taurus: April; 20 to May 20
		 */
		dates[1][0] = new Date(4, 20);
		dates[1][1] = new Date(5,20);
		
		/*
		 * For Gemini May 21 to June 20
		 */
		dates[2][0] = new Date(5,21);
		dates[2][1] = new Date(6,20);
		
		/*
		 * For Cancer: June 21 to July 22
		 */
		dates[3][0] = new Date(6,21);
		dates[3][1] = new Date(7,22);
		
		/*
		 * For Leo: July 23 to August 22
		 */
		dates[4][0] = new Date(7,23);
		dates[4][1] = new Date(8,22);
		
		/*
		 * For Virgo: August 23 to September 22
		 */
		dates[5][0] = new Date(8,23);
		dates[5][1] = new Date(9,22);
		
		/*
		 * For Libra: September 23 to October 22
		 */
		dates[6][0] = new Date(9,23);
		dates[6][1] = new Date(10,22);
		
		/*
		 * For Scorpio: October 23 to November 21
		 */
		dates[7][0] = new Date(10,23);
		dates[7][1] = new Date(11,21);
		
		/*
		 * For Sagittarius: November 22 to December 21
		 */
		dates[8][0] = new Date(11,22);
		dates[8][1] = new Date(12,21);
		
		/*
		 * For Capricorn: December 22 to January 19
		 */
		dates[9][0] = new Date(12,22);
		dates[9][1] = new Date(1,19);
		
		/*
		 * For Aquarius: January 20 to February 18
		 */
		dates[10][0] = new Date(1,20);
		dates[10][1] = new Date(2,18);
		
		/*
		 * For Pisces: February 19 to March 20
		 */
		dates[11][0] = new Date(2,19);
		dates[11][1] = new Date(3,20);
		
		/*
		 * Need to make sure signs align and correspond with correct date ranges
		 */
		String[]ZodiacSigns = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
		
		Scanner sc = new
				Scanner(System.in);
		/*
		 * Need to take the date of birthday and month from the user
		 */
		System.out.println("What is your zodiac? Enter your birthday. Month(1-12) followed by the Day(1-31)");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		/*
		 * Make sure to check for valid month and day. Make sure there is an error message if the values are invalid
		 */
		if((month<1 || month>12) || (day <1 || day>31)) {
			System.out.println("Invalid month or day.");
			
			/*
			 * Need a loop to identify the Zodiac from users input
			 */
			for(int i = 0; i<12; i++) {
				
				if((dates[i][0].month <=month && dates[i][0].day >=day)) {
					
					System.out.println("Your Zodiac sign is: " + ZodiacSigns[i]);
					break;
				}
			}
			sc.close();
		}
		

	}

}
