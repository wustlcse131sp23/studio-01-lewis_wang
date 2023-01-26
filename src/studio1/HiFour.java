package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("First person's name: ");
		String personOne = in.nextLine();
		System.out.print("Second person's name: ");
		String personTwo = in.nextLine();
		System.out.print("Third person's name: ");
		String personThree = in.nextLine();
		System.out.print("Fourth person's name: ");
		String personFour = in.nextLine();
		System.out.println("Greetings " + personOne + ", " + personTwo + ", " + personThree + ", and " + personFour);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
