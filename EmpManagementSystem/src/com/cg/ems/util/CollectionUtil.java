package com.cg.ems.util;
import java.util.HashSet;
import com.cg.ems.dto.Employee;
public class CollectionUtil
{
	private static HashSet<Employee> empSet=new HashSet<Employee>();
	
	static
	{
		empSet.add(new Employee(160750,"Soumya",55000.0F));
		empSet.add(new Employee(160662,"Dinesh",88000.0F));
		empSet.add(new Employee(160601,"Abhimanyu",89000.0F));
		empSet.add(new Employee(160608,"Tandon",12000.0F));
		empSet.add(new Employee(160708,"Sai Kiran",26000.0F));
	}
	public static void addEmp(Employee emp)
	{
		empSet.add(emp);
	}
	public static HashSet<Employee> getAllEmp()
	{
		return empSet;
	}
	
}
