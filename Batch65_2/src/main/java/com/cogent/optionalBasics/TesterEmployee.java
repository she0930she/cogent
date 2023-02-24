package com.cogent.optionalBasics;

import java.util.ArrayList;
import java.util.List;

public class TesterEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = createEmployeeList();
        Employee employee = findEmployee(employeeList,"Jessi");  //Normal or No Optional
        System.out.println("all goes correct even numm info comes");
        
        System.out.println("Employee name: "+employee.getName());  //try catch to manage
    }
 
    public static Employee findEmployee(List<Employee> employeeList,String name)
    {
        for(Employee e:employeeList)
        {
            if(e.getName().equalsIgnoreCase(name))
            {
                return e;
            }
        }
        return null;
    }
    public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();
 
        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",22);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
 
        return employeeList;
 


	}

}
