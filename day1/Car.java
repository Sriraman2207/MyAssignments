package day1;

public class Car {
	public void applyBreak() {
	System.out.println("break");
	}
	public void applyGear() {
		System.out.println("gear");
	}
	public void switchOnAc() {
		System.out.println("ac");
	}
		public void applyAcclerate() {
			System.out.println("acclerate");
		}
		public static void main(String[] args) {
			Car c=new Car();
		    c.applyBreak();
		    c.applyGear();
		    c.switchOnAc();
		    c.applyAcclerate();
		}
	}
	


