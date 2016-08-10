package dsp;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Commissions {
Scanner input = new Scanner(System.in);
public int s;
public int[] sale;
public int[] a=new int[10];
public void set(){
	System.out.println(" Enter the number of salepersons ");
	s=input.nextInt();
	sale=new int[s];
}
public void setData(){
	System.out.println("Enter the gross for the salesperson");
	for(int i=0;i<sale.length;i++)
		sale[i]=input.nextInt();
}
public void calc(){
	for(int i=0;i<sale.length;i++)
		sale[i]=(int) (200+(0.09)*sale[i]);
	}
public void display(){
	System.out.println("the salaries are");
	for(int i=0;i<sale.length;i++)
		System.out.println(sale[i]);
}
public void check(){
	for(int k=0;k<sale.length;k++)
		a[k]=0;
	for(int i=0;i<sale.length;i++)
	{
		if(sale[i]>=200 && sale[i]<300 )
			a[0]++;
		else if(sale[i]>=300 && sale[i]<400)
			a[1]++;
		else if(sale[i]>=400 && sale[i]<500)
			a[2]++;
		else if(sale[i]>=500 && sale[i]<600)
			a[3]++;
		else if(sale[i]>=600 && sale[i]<700)
			a[4]++;
		else if(sale[i]>=700 && sale[i]<800)
			a[5]++;
		else if(sale[i]>=800 && sale[i]<900)
			a[6]++;
		else if(sale[i]>=900 && sale[i]<1000)
			a[7]++;
		else if(sale[i]>=1000)
			a[8]++;
	}
}
	public void table(){
		System.out.println("$200-299  $300-399  $400-499  $500-599  $600-699  $700-799  $800-899  $900-999  >$1000");
		for(int i=0;i<9;i++)
			System.out.printf("    "+a[i]+"     ");
			}

	public static void main(String[] args) {
		Commissions c=new Commissions();
		c.set();
		c.setData();
		c.calc();
		c.display();
		c.check();
		c.table();
		
		// TODO Auto-generated method stub

	}

}
