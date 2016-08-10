package pds;
import java.util.Scanner;
public class Employee {
	public String firstName;
	public String lastName;
	public double sal;
	public Employee(String a,String b,double c){
		firstName=a;
		lastName=b;
		if(sal>=0)
			sal=c;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	Scanner input=new Scanner(System.in);
	public void setfName(){
		System.out.println("Enter the first name");
		firstName=input.next();
	}
	public String getfName(){
		return firstName;
	}
	public void setlName(){
		System.out.println("Enter the last name");
		lastName=input.next();
	}
	public String getlName(){
		return lastName;
	}
	public void setsal(){
		System.out.println("Enter the salary ");
		double d=input.nextDouble();
		if(d>=0)
			sal=d;
	}
	public double getsal(){
		return sal;
	}
	public void incSal(){
		sal=sal+(0.1)*sal;
	}
	public void display(){
		System.out.println("first name is "+ firstName);
		System.out.println("second name is "+ lastName);
		System.out.println("salary is" + sal);
	}
	public void dis()
	{
			System.out.println("Incremented salary " + sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("palaniappa", "mughilan", 1000000);
		e1.display();
		e1.incSal();
		e1.dis();
		Employee e2=new Employee();
		e2.setfName();
		e2.setlName();
		e2.setsal();
		e2.display();
		e2.incSal();
		e2.dis();
	}

}
