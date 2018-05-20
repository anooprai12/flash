package com.kishore.mvc.DaoInterface;

import java.util.List;

import com.kishore.mvc.Model.Emp;

public interface EmpDaoInterface 
{
	public void empDaoSave(Emp emp);
	
	public List<Emp> empDaoViewAll(Emp emp);
	 public List<Emp> viewAllEmployeeDao(int pageid,int total);
	  public int delete(int id);
}
