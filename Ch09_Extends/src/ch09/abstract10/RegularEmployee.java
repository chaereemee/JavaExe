package ch09.abstract10;

public class RegularEmployee extends Employee {

	protected int yearSalary;    // 연봉 
	protected int bonus;		 // 보너스 

	public RegularEmployee(String empno, String name, int yearSalary, int bonus) {
		super(empno, name);  // Employeee(empno, name) 호출 
		this.yearSalary = yearSalary;
		this.bonus = bonus;
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary+bonus) / 12;
		return mPay;
	}
	
	@Override
	public void showEmployeeInfo() {
		// 부모 기능 + 추가 확장 
		super.showEmployeeInfo(); // Employee의 show 호출
		System.out.println("bonus : " + bonus);
		System.out.println("monthPay : " + getMonthPay());
	}

}
