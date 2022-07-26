package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String name) {
		System.out.println(name);
		
		
	}
	public void printEmployeeId(int id) {
		System.out.println(id);
	}
	public void printEmployeeAddress(String address) {
		System.out.println(address);
	}
	public void printEmployeeSalary(Double salary) {
		System.out.println(salary);
	}
	public void printEmployeeMobileNumber(Long mobNum) {
		System.out.println(mobNum);
	}
	
   public static void main(String[] args) {
	   EmployeeDetails emp=new EmployeeDetails();
	   emp.printEmployeeName("Sriraman");
	   emp.printEmployeeId(222);
	   emp.printEmployeeAddress("Chennai");
	   emp.printEmployeeSalary(40.000);
	   emp.printEmployeeMobileNumber(7887291616L);
	
}
}


