package ch09.abstract10;

public abstract class Employee {
	protected String empno;      // 사번  자식을 생성하면 protected
	protected String name;       // 이름 
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	
	public void showEmployeeInfo() {
		System.out.println("-------------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	
	public abstract double getMonthPay();  // 추상메소드 : 객체 못만듦, 상속 O
}
