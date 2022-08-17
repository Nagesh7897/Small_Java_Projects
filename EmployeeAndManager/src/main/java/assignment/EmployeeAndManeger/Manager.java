package assignment.EmployeeAndManeger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	
	@Id
	private int Mng_id;
	private String Mng_name;
	private double Mng_salary;
	
	
	public int getMng_id() {
		return Mng_id;
	}
	public void setMng_id(int mng_id) {
		Mng_id = mng_id;
	}
	public String getMng_name() {
		return Mng_name;
	}
	public void setMng_name(String mng_name) {
		Mng_name = mng_name;
	}
	public double getMng_salary() {
		return Mng_salary;
	}
	public void setMng_salary(double mng_salary) {
		Mng_salary = mng_salary;
	}
}
