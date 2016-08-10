package oopassignment;

public class Date {
	private int d,m,y;
	public Date(){setD(0);setM(0);setY(0);}
	public Date(int x,int yr,int z)
	{setD(x);setM(yr);setY(z);}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void display()
	{
	System.out.printf("\n%d/%d/%d\n",d,m,y);
	}
	}
	


