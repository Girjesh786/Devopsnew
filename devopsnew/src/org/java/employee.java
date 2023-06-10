package org.java;

public class employee {
public int addemp() {
		int emp=101;
		System.out.println("add"+emp);
		return emp;
	}
	public void updateemployee() {
		System.out.println("Updated the employee details");
	}
	public static void main(String[] args) {
	employee emp = new  employee();
	emp.addemp();
	emp.updateemployee();	}
}
