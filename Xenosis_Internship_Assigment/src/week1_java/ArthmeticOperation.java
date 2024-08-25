/*Write a program to perform basic arithmetic operations (addition, subtraction, 
 * multiplication,division).
*/
package week1_java;
import java.util.Scanner;
public class ArthmeticOperation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int result1, result2, result3, result4;
		//asking input of two numbers
		System.out.println("enter first no: ");
		int fno= in.nextInt();
		System.out.println("enter second no: ");
		int sno= in.nextInt();
		
		//addition of two no
		result1 = fno +sno;
		System.out.println("Addition of two numbers is: "+result1 );
		
		//substraction of two no
		result2 = fno - sno;
		System.out.println("Substraction of two numbers is: "+result2);
		
		//Multiplication of two no
		result3 = fno * sno;
		System.out.println("Multiplication of two numbers is: "+result3);
		
		//Division of two no
		result4 = fno / sno;
		System.out.println("Multiplication of two numbers is: "+result4);

	}

}
