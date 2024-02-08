package ch10.collection02.hashmap02;

public abstract class Employee {
	private String empno;          // 사번
	protected String name;           // 이름
	
	public Employee(String empno, String name) {
		this.setEmpno(empno);
		this.name = name;
	}
	
	public void showEmployeeInfo() {
		System.out.println("--------------------");
		System.out.println("empno : " + getEmpno());
		System.out.println("name : " + name);
	}
	
	public abstract double getMonthPay();

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}
}
 