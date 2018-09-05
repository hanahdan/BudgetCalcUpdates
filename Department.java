package Project;

//import java.util.ArrayList;
//this.dept_Name=
	/*	switch(dept_Name)
		{
		case "sales":
			this.findBudget();
			break;
		case "it":
			this.findBudget();
			break;
			
		default:
				System.out.println("Check your department");
				break;*/

public class Department extends Employee{
	String dept_Name;
	int grade;
	double total=0;

	double d_budget=50000;
	double budget=0.0;
	
	Department()
	{
		//this.dept_Name=super.dept_name;
		this.grade=super.grade;
		//this.d_budget=50000;
	}
	public double findSalary()
	
	{
	
		
		if(super.grade>5)
		{
			budget =d_budget+150000;
			//System.out.println(budget);
		}
		else
		{
		budget=d_budget+100000;
			//System.out.println(budget);
			}
		
		return budget;	
	}
	public void findDepartment()
	
	{
		if(super.dept_name==null)
				{
			System.out.println("Check your input");
				}
		else{
			
		
		switch(super.dept_name)
		{
		case "Sales":
			total=total+this.findSalary();
			System.out.println("Sales Department :"+total);
			break;
		case "IT":
			//total= total+this.findSalary();
			System.out.println(total+super.salary);
			break;
			
		default:
				System.out.println("Check your department");
				break;
		}
		}
		
	}
	public double findTotBudget()
	
	{
		//for(int i=1;i<aemp_salary.get(i);i++)
		{
			
		}
		return total;
	}
}
