package test;

public class Staff extends User {

	private int salary;
	
	public Staff() {
		super();
	}

	public Staff(int salary) {
		super();
		this.salary = salary;
	}
	
	public Staff(String id, String pw, String name, int salary) {
		super(id, pw, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}
	
	public void showInfo() {
		System.out.println("아이디:" + getId() + "\t" + "비번:" + getPw() +"\t" + "이름:" + getName() + "\t" + "월급:" + salary);
	}
}
