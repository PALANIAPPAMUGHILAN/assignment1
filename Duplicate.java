package psd;
import java.util.*;
public class Duplicate {
	public int n;
	public int[] a=new int[5];
	public Duplicate(){
		n=0;
	}
	public void insert(int x){
		int i;
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
				return;
	}
		a[i]=x;
		n++;
	}
	public void in(){
		for(int i=0;i<5;i++)
			a[i]=0;
	}
	public void display(){
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	Scanner input=new Scanner(System.in);
	public void setdata(){
		int e = 0;
		System.out.println(" Enter numbers between 10 and 100");
		for(int k=0;k<5;k++)
		{
		e=input.nextInt();
		insert(e);
		display();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate d1 = new Duplicate();
		d1.in();
		d1.setdata();

	}

}
