package assignment.EmployeeAndManeger;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner= new Scanner(System.in);	
    	Employee emp= new Employee();
    	Manager mng= new Manager();
    	
    	System.out.println("Welcome");
    	int Emp_id;
    	String Emp_name;
    	double Emp_salary;
    	for(int i=0; i<10; i++)
    	{
    	 System.out.println("Please Enter "+ (i+1) + " details");
    	 System.out.println("Please enter ID of the employee");
    	 Emp_id = scanner.nextInt();
    	 System.out.println("Please enter Name of the employee");
    	 Emp_name = scanner.next();
    	 System.out.println("Please enter Salary of the employee");
    	 Emp_salary = scanner.nextInt();
    	 
    	 if (Emp_salary < 100000) {
    	  	Configuration cnfE= new Configuration().configure().addAnnotatedClass(Employee.class);
    	  	SessionFactory sfE= cnfE.buildSessionFactory();
    	  	Session ss= sfE.openSession();
    	  	Transaction tx= ss.beginTransaction();
    	  	
    	  	emp.setEmp_id(Emp_id);
        	emp.setEmp_name(Emp_name);
        	emp.setEmp_salary(Emp_salary);;
        	ss.save(emp);
        	tx.commit();
    	 }
    	 else {
    		 Configuration cnfM= new Configuration().configure().addAnnotatedClass(Manager.class);
    			SessionFactory sfM= cnfM.buildSessionFactory();
    		  	Session ss= sfM.openSession();
        	  	Transaction tx= ss.beginTransaction();
        		mng.setMng_id(Emp_id);
            	mng.setMng_name(Emp_name);
            	mng.setMng_salary(Emp_salary);
            	ss.save(mng);
            	tx.commit();
    	 }
    	}
    scanner.close();	
    }
}
