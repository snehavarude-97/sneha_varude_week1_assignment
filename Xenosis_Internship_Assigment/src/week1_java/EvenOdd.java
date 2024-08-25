//2.Create a program that takes user input and checks if the number is even or odd.

package week1_java;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to be checked: ");
		number = in.nextInt();
		if(number % 2 ==0)
		{
			System.out.println("Given number " +number+ " is EVEN");
		}
		else
		{
			System.out.println("Given number " +number+ " is ODD");
		}

	}

}
