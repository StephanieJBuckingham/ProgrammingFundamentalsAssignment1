import java.util.*;

//Stephanie Buckingham
//Programming Fundamentals
//Summer Session II
//Assignment 1 

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Enter 5 integers between 0 and 19.");
		Scanner scan = new Scanner(System.in);
		int int1, int2, int3, int4, int5;
		int1 = scan.nextInt();
		int2 = scan.nextInt();
		int3 = scan.nextInt();
		int4 = scan.nextInt();
		int5 = scan.nextInt();

		if (int1 > 19 || int2 > 19 || int3 > 19 || int4 > 19 || int5 > 19) {
			System.out.println("Please read the directions and try again.");
			System.exit(0);
		}

		scan.close();

		int uncodednum, uncodenumtens, uncodenumones;
		uncodednum = int1 + int2 + int3 + int4 + int5;
		System.out.println(uncodednum);

		uncodenumtens = Math.round(uncodednum / 10);
		uncodenumones = Math.round(uncodednum % 10);

		int int1tens;
		int int1ones;
		int int2tens;
		int int2ones;
		int int3tens;
		int int3ones;
		int int4tens;
		int int4ones; 
		int int5tens;
		int int5ones;
		int1tens = Math.round(int1 / 10);
		int1ones = Math.round(int1 % 10);
		int2tens = Math.round(int2 / 10);
		int2ones = Math.round(int2 % 10);
		int3tens = Math.round(int3 / 10);
		int3ones = Math.round(int3 % 10);
		int4tens = Math.round(int4 / 10);
		int4ones = Math.round(int4 % 10);
		int5tens = Math.round(int5 / 10);
		int5ones = Math.round(int5 % 10);

		Random gen = new Random();
		int key;
		key = gen.nextInt(9);
		System.out.println(key);

		int encodedtens, encodedones, codednum;
		encodedtens = (uncodenumtens + key) % 10;
		encodedones = (uncodenumones + key) % 10;
		codednum = (encodedtens * 10) + encodedones;
		System.out.println(codednum);

	}
}
