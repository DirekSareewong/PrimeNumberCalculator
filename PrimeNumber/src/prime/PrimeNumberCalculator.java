package prime;

import java.util.Scanner;

public class PrimeNumberCalculator {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.print("Input a numer: ");
		Scanner input = new Scanner(System.in);
		int argument = input.nextInt();
		if(IsPrimeNumber(argument))
			System.out.println("The numer " + argument + " is a prime number.");
		else
			System.out.println("The numer " + argument + " is not a prime number.");
	}
	
	public static boolean IsPrimeNumber(int number) throws Exception {
		if(number <= 2)
			throw new Exception("Not a valid number");
		for(int i = 2;i<number;i++){
			if(number%i==0)
				return false;
		}
		return true;
	}

}
