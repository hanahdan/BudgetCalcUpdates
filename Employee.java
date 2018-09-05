package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee  {
	int emp_no;
	 String emp_name;
     int grade;
	String dept_name;
	double salary=0;
	ArrayList aemp_name=new ArrayList();
	ArrayList aemp_salary=new ArrayList();

public void addEmployeeDetails()
{
	Scanner input=new Scanner(System.in);
	
	int count=0;
	int emp_no=count+1;
	String temp="";
	
	while(emp_no>0 && emp_no<3)
	{
		System.out.println("Employee No :"+emp_no);
	
				System.out.println("Enter Employee Name");
		String e_name=input.next();
		aemp_name.add(e_name);
		this.emp_name=e_name;
		
		//d_name=this.dept_name;
		System.out.println("Enter your Grade");
		
		int e_grade=input.nextInt();
		this.grade=e_grade;
		if(this.grade>5){
			salary=150000;
			aemp_salary.add(salary);
		}
		else
		{
			salary=100000;
			aemp_salary.add(salary);
		}
		
		System.out.println("Enter Department Name");
		dept_name=input.next();
		
	
		//super.findDepartment();
		System.out.println("Employee Position:" + emp_no + "\n" +  "Employee Name :" + e_name + "\n" + 
				"Department name:" + dept_name + "\n" + "Grade: " + e_grade);
		System.out.println("--------------------------------");
		emp_no++;
				
	}
	
		
	input.close();
	
}

public void listEmployeeName()
{
for(Object temp:aemp_name)
{
	System.out.println(temp);
	
}

}
public void listSalary()
{
	for(Object temp:aemp_salary)
	{
		System.out.println(temp);
		
		
	}


}
}

