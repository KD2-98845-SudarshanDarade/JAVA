
class Employee {

	private String first_name;
	private String last_name;
	private double monthly_salary;
	
	
	Employee() {
		this.first_name = " ";
		this.last_name = " ";
		this.monthly_salary = 0;
	}
	
	Employee(String first_name, String last_name, double monthly_salary) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.monthly_salary = monthly_salary;		
	}
	
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public double getMonthly_salary() {
		return monthly_salary;
	}

	public void setMonthly_salary(double monthly_salary) {
		this.monthly_salary = monthly_salary;
	}

}


public class EmployeeTest{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setMonthly_salary(2200.00);
		double e1_salary = e1.getMonthly_salary();
		System.out.println("Employee 1 salary before raise " + e1_salary);
		e2.setMonthly_salary(2500.00);
		double e2_salary = e2.getMonthly_salary();
		System.out.println("Employee 2 salary before raise " + e2_salary);
		
		
		e1.setMonthly_salary(e1_salary * 1.10);
		double e1_salary_after_hike = e1.getMonthly_salary();
		System.out.println("Employee 1 salary after raise " + e1_salary_after_hike);
		e2.setMonthly_salary(e2_salary * 1.10);
		double e2_salary_after_hike = e2.getMonthly_salary();
		System.out.println("Employee 2 salary after raise " + e2_salary_after_hike);
	}
}

