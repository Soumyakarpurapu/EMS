package com.cg.ems.dto;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String empName;
	private float empsal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpsal() {
		return empsal;
	}
	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	
	public Employee(int empId, String empName, float empsal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsal = empsal;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empsal=" + empsal + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		if(emp.empId==this.empId)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode()
	{
		return empId;
	}
	@Override
	public int compareTo(Employee emp)
	{
		if(emp.empId<this.empId)
		{
			return -1;
		}
		else if(emp.empId==this.empId)
		{
			return 0;
		}
		else
		{
			return +1;
		}
	}
}
