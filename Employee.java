package oopassignment;



public class Employee {
	private String emp1Name;
	private String emp2Name;
	private double msal;

public Employee()
         {setEmp1Name(null);
          setEmp2Name(null);
          setMsal(0);}
public Employee(String a,String b, double x)
          {setEmp1Name(a);
          setEmp2Name(b);
          setMsal(x);
          }
public String getEmp1Name() {
	return emp1Name;
}
public void setEmp1Name(String emp1Name) {
	this.emp1Name = emp1Name;
}
public String getEmp2Name() {
	return emp2Name;
}
public void setEmp2Name(String emp2Name) {
	this.emp2Name = emp2Name;
}
public double getMsal() {
	return msal;
}
public void setMsal(double msal) {
	this.msal = msal;
}
public void display()
{double x;
x=msal*12.0;
System.out.printf("FIRST NAME=%s\nSECOND NAME=%s\nANNUAL SALARY=%f",emp1Name,emp2Name,x);
	
}
public void increment()
{msal*=1.1;
}
}


