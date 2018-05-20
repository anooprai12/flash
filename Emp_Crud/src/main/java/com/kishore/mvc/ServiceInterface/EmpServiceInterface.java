package com.kishore.mvc.ServiceInterface;

import java.util.List;

import com.kishore.mvc.Model.Emp;

public interface EmpServiceInterface 
{
	public void empServiceSave(Emp emp); 
	
	public List<Emp> empServiceViewAll(Emp emp);
	 public List<Emp> viewAllEmployeeService(int pageid,int total);
	  public int delete(int id);
	  
}
