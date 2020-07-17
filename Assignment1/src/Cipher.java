import java.util.*;

/* Stephanie Buckingham
Programming Fundamentals
Summer Session II
Assignment 1  */

public class Cipher {

	public static void main(String[] args) {

		// Welcome to Cipher Program
		System.out.println("Welocome to the Cipher Program");
		System.out.println();

		// Prompt for 5 numbers
		System.out.println("Enter 5 numbers between 0 and 19.");
		Scanner scan = new Scanner(System.in);

		// Initialize numbers 
		int int1, int2, int3, int4, int5;
		int1 = scan.nextInt();
		int2 = scan.nextInt();
		int3 = scan.nextInt();
		int4 = scan.nextInt();
		int5 = scan.nextInt();

		// Prompt if entered incorrect numbers
		if ( int1 > 19 || int1 < 0 || int2 > 19 || int2 < 0 || int3 > 19 || int3 < 0|| int4 > 19 || int4 < 0 || int5 > 19 || int5 < 0) {
			System.out.println("Please read the directions and try again.");
			System.exit(0);
		}
		scan.close();

		// Initialize unencoded number, the tens digit and ones digit
		int unencodednumber, tensplace, onesplace;
		unencodednumber = int1 + int2 + int3 + int4 + int5;
		tensplace = unencodednumber / 10;
		onesplace = unencodednumber % 10;

		// Generate key and print
		Random gen = new Random();
		int key;
		key = gen.nextInt(9);
		System.out.println("\n");
		System.out.println("Your encoding key is " + key);

		// Generate encoded number and print
		int encodedtens, encodedones, codednum;
		encodedtens = (tensplace + key) % 10;
		encodedones = (onesplace + key) % 10;
		codednum = (encodedtens * 10) + encodedones;
		System.out.println("\n");
		System.out.println("Your encoded number is " + codednum);

	}
}
