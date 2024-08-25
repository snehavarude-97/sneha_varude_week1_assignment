//Q3. Implement a simple calculator using switchcase statements.

package week1_java;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		String yn,sym;
		int fno,sno,result;
		Scanner in =new Scanner(System.in);
		do {
			System.out.println("Enter First Number: ");
			fno = in.nextInt();
			System.out.println("Enter Second Number: ");
			sno = in.nextInt();
			System.out.println("Enter symbols to do calculation(+,-,*,/)");
			sym = in.next();
			switch(sym)
			{
			case "+" :
				result = fno + sno;
				System.out.println("Addition is: " +result);
				break;
			case "-" :
				result = fno - sno;
				System.out.println("Substraction is: "+result);
				break;
			case "*" :
				result = fno*sno;
				System.out.println("Multication is: "+result);
				break;
			case "/" :
				result = fno/sno;
				System.out.println("Division is: "+result);
				break;
			default:
				System.out.println("Enter a valid operation");
				break;
			}
			System.out.println("Do you want to continue(Press y for Yes and n for No)");
			yn = in.next();
		}while(yn.equals("y")|| yn.equals("Y"));
		System.out.println("Exit");
	}

}
