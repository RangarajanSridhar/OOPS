package oopassignment;
import java.util.Scanner;
public class DiffArray {

	public static boolean uniq(int []a,int b)
	{int i=0;
	if(b<10||b>100){return false;}
		for(i=0;i<a.length;i++)
		{if(a[i]==b)
			{return false;}}
		return true;}
	public static void main(String[] args) {
		int []a={1,2,3,4,5};
		
	    int i=0,x;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nworst case array\n");
		
		for (int j:a)
		{System.out.println(j);	}
	while(i<a.length){
           System.out.printf("\nenter a numeber\n");
           x=in.nextInt();
           if(uniq(a,x))
        	   {a[i]=x;
        	   i++;
        	   }
           else
        	   {System.out.println("the number you have entered already exists in the array or the element you have entered is not between 10 and 100.Try a new one");
        	   }}
	System.out.printf("\nupdated array\n");
	for(int j:a){System.out.println(j);}
	in.close();
	}

}
