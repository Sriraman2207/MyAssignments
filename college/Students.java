package org.college;

public class Students extends Department {
	public void studentName() {
		System.out.println("Sriraman");
		}
		
		public void studentDept() {
		System.out.println("CSE");
		}
		
		public void StudentId() {
			System.out.println(4159);
		}
		public static void main(String[] args) {
			Students std=new Students();
			std.collegeName();
			std.collegeCode();
			std.collegeRank();
			std.deptName();
			std.studentName();
			std.studentDept();
			std.StudentId();
		}

}
