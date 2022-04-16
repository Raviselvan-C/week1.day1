package week1.day1;

public class Problem1 {
	public static void main(String[] args) {
		
//Initialize an integer with a negative number like, int number = -40;
		int number = -40;
		
//		2. Check if the number is a negative number 
//		   Hint : any number that is lesser than zero is a negative number		
		if (number < 0) {
			
//3. If so, convert the number to a positive numer			
			number = - number;

//4.			Print as "The number -40 is converted to 40"			
			System.out.println("The number -40 is converted to 40");
		}
	}

}
