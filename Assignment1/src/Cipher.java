import java.util.Scanner;
import java.util.Random;

/* 
 * Stephanie Buckingham
 * Programming Fundamentals
 * Summer Session II
 * Assignment 1  
 * 7/16/2020
*/

public class Cipher {

	public static void main(String[] args) {

		// Print title
		System.out.print(
				"Programming Fundamentals\n" + "Name: Stephanie Buckingham\n" + "PROGRAMMING ASSIGNMENT 1\n" + "\n");

		// Welcome to Cipher Program
		System.out.println("Welocome to the Cipher Program");

		// Prompt for 5 numbers
		System.out.println("Enter 5 numbers between 0 and 19.");
		Scanner scan = new Scanner(System.in);

		// Initialize numbers, scan, and output error message if not between 0-19
		int int1, int2, int3, int4, int5;

		System.out.print("1st Number: ");
		int1 = scan.nextInt();

		if (int1 > 19 || int1 < 0) {
			System.out.print("Please read the directions and try again.");
			System.exit(0);
		}

		System.out.print("2nd Number: ");
		int2 = scan.nextInt();

		if (int2 > 19 || int2 < 0) {
			System.out.print("Please read the directions and try again.");
			System.exit(0);
		}

		System.out.print("3rd Number: ");
		int3 = scan.nextInt();

		if (int3 > 19 || int3 < 0) {
			System.out.print("Please read the directions and try again.");
			System.exit(0);
		}

		System.out.print("4th Number: ");
		int4 = scan.nextInt();

		if (int4 > 19 || int4 < 0) {
			System.out.print("Please read the directions and try again.");
			System.exit(0);
		}

		System.out.print("5th Number: ");
		int5 = scan.nextInt();

		if (int5 > 19 || int5 < 0) {
			System.out.print("Please read the directions and try again.");
			System.exit(0);
		}

		// Total numbers and print
		int Total;
		Total = int1 + int2 + int3 + int4 + int5;
		System.out.println("Total = " + Total);

		System.out.println("\n");

		scan.close();

		// Initialize unencoded number, the tens digit and ones digit
		int unencodednumber, tensplace, onesplace;
		unencodednumber = int1 + int2 + int3 + int4 + int5;
		tensplace = unencodednumber / 10;
		onesplace = unencodednumber % 10;

		// Generate key and print
		Random gen = new Random();
		int key;
		key = gen.nextInt(10);
		System.out.println("Your encoding key is " + key);

		// Generate encoded number and print
		int encodedtens, encodedones, codednum;
		encodedtens = (tensplace + key) % 10;
		encodedones = (onesplace + key) % 10;
		codednum = (encodedtens * 10) + encodedones;
		System.out.println("Your encoded number is " + codednum);

	}
}
