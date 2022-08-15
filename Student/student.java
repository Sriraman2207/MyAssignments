package Student;

public class student {
	public void getStudentDetails(int id) {
		System.out.println(id);
	}
	
	public void getStudentDetails(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	
	public void getStudentDetails(int id,String name,String email) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}
	public void getStudentDetails(int id, String name, String email,phone number) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		student std=new student();
		std.getStudentDetails(4159);
		std.getStudentDetails(4159, "Sriraman");
		std.getStudentDetails(4159, "Sriraman", "sriram@gmail.com");
		std.getStudentDetails(4159, "Sriraman", "sriram@gmail.com", 1234567890);
	}

}
