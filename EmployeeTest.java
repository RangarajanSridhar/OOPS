package oopassignment;
import java.util.Scanner; 
public class EmployeeTest {
/**
 * @param args
 */
public static void main(String args[])
{Scanner input= new Scanner(System.in);
String a,b;
double sal; System.out.printf("for employee 1\nenter first name,second name,monthly salary");
a=(input.nextLine());
b=(input.nextLine());
sal=(input.nextDouble());
input.nextLine();
Employee C= new Employee(a,b,sal);
System.out.println();
System.out.printf("\nfor employee 2\nenter first name,second name,monthly salaryfre");
a=input.nextLine();
b=input.nextLine();
sal=input.nextDouble();
Employee D=new Employee();
D.setEmp1Name(a);
D.setEmp2Name(b);
D.setMsal(sal);
//displaying before manipulation
System.out.printf("\n");
C.display();
System.out.println();
D.display();
C.increment();
D.increment();
//displaying after manipulation
System.out.printf("\n");
C.display();
System.out.println();
D.display();
input.close();


}}
