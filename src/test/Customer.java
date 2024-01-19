package test;

public class Customer extends User {

	private int point;

	public Customer() {
		super();
	}

	public Customer(int point) {
		super();
		this.point = point;
	}
	
	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}

	public void showInfo() {
		System.out.println("아이디:" + getId() + "\t" + "비번:" + getPw() +"\t" + "이름:" + getName() + "\t" + "포인트:" + point);
	}
}
