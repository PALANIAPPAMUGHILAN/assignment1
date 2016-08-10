package spd;
import java.util.Scanner;
public class Date {
public  int year;
public int date,month;
public Date( int x,int y,int z)
{
	year=x;
	month=y;
	date=z;
}
public Date() {
	// TODO Auto-generated constructor stub
}
Scanner input=new Scanner(System.in);
public void setYear(){
	System.out.println("enter the year");
	year=input.nextInt();
}
public int getyear()
{
	return year;
}
public void setMonth(){
	System.out.println("Enter the month");
	month=input.nextInt();
}
public int getMonth(){
	return month;
}
public void setDate(){
	System.out.println("Enter date");
	date=input.nextInt();
}
public int getDate(){
	return date;
}
public void displayDate(){
	System.out.println(month+"/"+date+"/"+year);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		d.setYear();
		d.setMonth();
		d.setDate();
		d.displayDate();	
		Date a = new Date(2016,8,6);
		a.displayDate();
		
	}
}
