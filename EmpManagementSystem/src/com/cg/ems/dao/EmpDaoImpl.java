package com.cg.ems.dao;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.util.CollectionUtil;

public class EmpDaoImpl implements EmployeeDao 
{
	static Scanner sc=null;
	static EmployeeService empSer=null;
	@Override
	public int addEmployee(Employee ee) throws EmployeeException
	{
		CollectionUtil.addEmp(ee);
		return ee.getEmpId();
	}

	@Override
	public HashSet<Employee> fetchAllEmp() 
	{
		return CollectionUtil.getAllEmp();
	}

	@Override
	public Employee getEmpById(int empId)
	{			
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();		
		Employee e= null;
		while(it.hasNext())
		{
			Employee ee=it.next();
			if(empId==ee.getEmpId())
			{
				e=ee;			
			}
		}
		return e;
	}

	@Override
	public HashSet<Employee> searchEmpByName(String name) 
	{
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();	
		while(it.hasNext())
		{
			Employee ee=it.next();
			if(name.equals(ee.getEmpName() ))
			{
				System.out.println(ee.getEmpId()+"\t\t"+ee.getEmpName()+"\t\t"+ee.getEmpsal());
			}
		}
		return empSet;
	}

	@Override
	public int deleteEmp(int empId)
	{	
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();		
		while(it.hasNext())
		{
			Employee ee=it.next();
			if(empId==ee.getEmpId())
			{
				it.remove();		
			}
		}
		return 0;
	}

	@Override
	public Employee updateEmp(int empId, String newName, float newSal)
	{	
		HashSet<Employee> empSet=CollectionUtil.getAllEmp();
		Iterator<Employee> it=empSet.iterator();	
		Employee e=null;
		while(it.hasNext())
		{
			Employee ee=it.next();
			if(empId==ee.getEmpId())
			{
				it.remove();
				e=new Employee(empId,newName,newSal);
				empSet.add(e);
		
			}
			
		}
		return e;
	}

}
