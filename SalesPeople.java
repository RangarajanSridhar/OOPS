package oopassignment;
import java.util.Scanner;
public class SalesPeople {public static int []a={0,0,0,0,0,0,0,0,0};
public static void update(int b)
{/*this function receives gross sales after each input,calculates his 
overall pay and modifies counter array. Gross salary is not saved in a
different array as it is not required to serve the purpose of the program*/ 
	
	
	int x=(int)(b*0.09+200);
if(x>=200&&x<=299){a[0]++;}

if(x>=300&&x<=399){a[1]++;}

if(x>=400&&x<=499){a[2]++;}

	if(x>=500&&x<=599){a[3]++;}
	
		if(x>=600&&x<=699){a[4]++;}
		
			if(x>=700&&x<=799){a[5]++;}
			 if(x>=800&&x<=899){a[6]++;}
			 if(x>=900&&x<=999){a[7]++;}
			 if(x>=1000){a[8]++;}


}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n,x;
		System.out.println("enter the number of employees for whom gross salary is to be calculated");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{System.out.printf("\nenter the gross sales of employee[%d]",i);
		x=in.nextInt();
		update(x);
		}
        		System.out.printf("SALARY RANGE\t\tNUMBER OF PEOPLE");
        		for(i=0;i<8;i++)
        		{System.out.printf("\n%d to %d\t\t\t%d",200+i*100,299+i*100,a[i]);}
        		System.out.printf("\n>1000\t\t\t\t%d",a[8]);
in.close();
	}

}
