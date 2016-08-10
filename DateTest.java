package oopassignment;
import java.util.Scanner;
public class DateTest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in); 
		System.out.printf("\nenter date,month and year");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		Date D=new Date(a,b,c);
		D.display();
		//changing values in D using set methods
		System.out.printf("\nenter date,month and year");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		D.setD(a);
		D.setM(b);
		D.setY(c);
		D.display();
		input.close();
	

		
	}

}
