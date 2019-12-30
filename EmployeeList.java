package utils;

import java.util.*;

public class EmployeeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> empList = new ArrayList<>();
		for (int i=0; i!=-1;){
			int code = sc.nextInt();
			if(code==-1)
				break;
			String name = sc.next();
			int salary = sc.nextInt();
			empList.add(new Employee(code, name, salary));
		}
		empList.add(new Employee(115, "Aishwarya", 5000));
		empList.add(new Employee(117, "Ankita", 5000));
		for(Employee emp : empList)
			System.out.println(emp.getEmpCode()+" "+emp.getEmpName()+" "+emp.getSalary());
	}
}
