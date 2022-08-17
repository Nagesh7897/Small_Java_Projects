package assignment.EmployeeAndManeger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int Emp_id;
	private String Emp_name;
	private double Emp_salary;
	
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	public double getEmp_salary() {
		return Emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		Emp_salary = emp_salary;
	}

}
