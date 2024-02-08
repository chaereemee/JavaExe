package ch10.collection02.linkedlist03;

//
import java.util.LinkedList;
import java.util.List;
//
import java.util.Scanner;

public class EmployeeManager {
	/** 원본 
	private final int EMP_NUM = 100;    // 100명 사원이 최대
	// Employee의 자식 객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0;           // 저장된 사원 객체 수, 다음 사원이 저장될 index
	*/
	//
	List<Employee> empList = new LinkedList<>();
	//
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직정보보기");
		System.out.println("6. 임시직정보보기");
		System.out.println("7. 일용직정보보기");
		System.out.println("8. 검색하기");
		System.out.println("9. 수정하기");
		System.out.println("10. 삭제하기");
		System.out.println("11. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}
	
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}
	
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	/**
	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		} else {
			isSave = false;
		}
		
		return isSave;
	}
	*/
	
	//
	private void saveEmployee(Employee emp) {
		empList.add(emp);
	}
	//

	private void viewAllEmployeeInfo() {
		/** 원본 
		for(int i=0; i<this.numOfEmp; i++) {
			this.empArr[i].showEmployeeInfo();
		}
		*/
		//
		for(int i=0;i<empList.size();i++)
			empList.get(i).showEmployeeInfo();
		//
	}
	
	private void viewRegularEmployeeInfo() {
		/**
		for(int i=0; i<this.numOfEmp; i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof RegularEmployee)
				this.empArr[i].showEmployeeInfo();
		}
		*/
		//
		for(int i=0; i<empList.size(); i++) {
			Employee emp = empList.get(i);
			if(emp instanceof RegularEmployee)
				empList.get(i).showEmployeeInfo();
		}
		//
	}
	
	private void viewTempEmployeeInfo() {
		/**
		for(int i=0; i<this.numOfEmp; i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof TempEmployee)
				this.empArr[i].showEmployeeInfo();
		}
		*/
		//
		for(int i=0; i<empList.size(); i++) {
			Employee emp = empList.get(i);
			if(emp instanceof TempEmployee)
				empList.get(i).showEmployeeInfo();
		}
		//
	}
	
	private void viewPartTimeEmployeeInfo() {
		/**
		for(int i=0; i<this.numOfEmp; i++) {
			Employee emp = this.empArr[i];
			if(emp instanceof PartTimeEmployee)
				this.empArr[i].showEmployeeInfo();
		}
		*/
		//
		for(int i=0; i<empList.size(); i++) {
			Employee emp = empList.get(i);
			if(emp instanceof PartTimeEmployee)
				empList.get(i).showEmployeeInfo();
		}
		//
	}
	
	//
	private void searchEmployee(String getEmpno) {
	    System.out.print("검색하고 싶은 사원의 사번은 >> ");
	    String searchEmpno = sc.next();

	    for(Employee emp : empList) {
	        if(emp.getEmpno().equals(searchEmpno)) {
	            emp.showEmployeeInfo();
	        }
	    }
	}
	//
	
	//
	private void modifyEmployee() {
	    System.out.print("수정하고 싶은 사원의 사번은 >> ");
	    String searchEmpno = sc.next();

	    for(int i = 0; i < empList.size(); i++) {
	        Employee emp = empList.get(i);
	        if(emp.getEmpno().equals(searchEmpno)) {
	            if(emp instanceof RegularEmployee) {
	                RegularEmployee modifiedEmp = createRegularEmployee();
	                empList.set(i, modifiedEmp);
	            } else if(emp instanceof TempEmployee) {
	                TempEmployee modifiedEmp = createTempEmployee();
	                empList.set(i, modifiedEmp);
	            } else if(emp instanceof PartTimeEmployee) {
	                PartTimeEmployee modifiedEmp = createPartTimeEmployee();
	                empList.set(i, modifiedEmp);
	            }
	        }
	    }
	}
	//
	
	//
	private void removeEmployee() {
	    System.out.print("삭제하고 싶은 사원의 사번은 >> ");
	    String searchEmpno = sc.next();

	    for(int i = 0; i < empList.size(); i++) {
	        Employee emp = empList.get(i);
	        if(emp.getEmpno().equals(searchEmpno)) {
	            empList.remove(i);
	        }
	    }
	}
	//
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
				case EmpMenu.REG_EMP:
					emp = createRegularEmployee();
					break;
				case EmpMenu.TEMP_EMP:
					emp = createTempEmployee();
					break;
				case EmpMenu.PART_EMP:
					emp = createPartTimeEmployee();
					break;
				case EmpMenu.ALL_INFO:
					emp = null;
					viewAllEmployeeInfo();
					break;
				case EmpMenu.REG_INFO:
					emp = null;
					viewRegularEmployeeInfo();
					break;
				case EmpMenu.TEMP_INFO:
					emp = null;
					viewTempEmployeeInfo();
					break;
				case EmpMenu.PART_INFO:
					emp = null;
					viewPartTimeEmployeeInfo();
					break;
				//
				case EmpMenu.EMP_SEARCH:
					emp = null;
					searchEmployee(null);	
					break;
				case EmpMenu.EMP_MODIFY:
					emp = null;
					modifyEmployee();
					break;
				case EmpMenu.EMP_REMOVE:
					emp = null;
					removeEmployee();
					break;
				//
				case EmpMenu.EXIT:
					emp = null;
					isRun = false;
					break;
				default:
					emp = null;
					System.out.println("해당 항목이 존재하지 않습니다.");
					break;
			}
			
			/**
			// emp 객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
			*/
			//
			if(emp!=null) 
				saveEmployee(emp);
			//
		}
		System.out.println("Program Exit...");
	}

}
