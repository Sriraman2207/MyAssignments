package week2.day1;

public class Calculator {
	public void additionTwoNumber() {
	     int a=20;
	     int b=80;
	     int c=a+b;
	System.out.println(c);

}
	 public void subTwoNumber() {
		 int e=80;
		 int f=30;
		 int g=e-f;
		 System.out.println(g);
	 }
	 public void multipleTwoNumber() {
		 double i=98.05;
		 double j=22.10;
		 double k=i*j;
		 System.out.println(k);
	 }
	 public void dividTwoNumber() {
		 float x=30.000F;
		 float y=28.000F;
		 float z=x/y;
		 System.out.println(z);
		 
	 }
	 public static void main(String[] args) {
		 Calculator calc=new Calculator();
		 calc.additionTwoNumber();
		 calc.subTwoNumber();
		 calc.multipleTwoNumber();
		 calc.dividTwoNumber();
		
	}
}
