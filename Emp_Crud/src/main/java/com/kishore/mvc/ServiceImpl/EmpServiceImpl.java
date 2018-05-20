package com.kishore.mvc.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishore.mvc.DaoInterface.EmpDaoInterface;
import com.kishore.mvc.Model.Emp;
import com.kishore.mvc.ServiceInterface.EmpServiceInterface;

@Service
public class EmpServiceImpl implements EmpServiceInterface
{

	@Autowired
	private EmpDaoInterface empDaoInterface;
	
	@Override
	public void empServiceSave(Emp emp)
	{
		empDaoInterface.empDaoSave(emp);
	}

	@Override
	public List<Emp> empServiceViewAll(Emp emp)
	{
		return empDaoInterface.empDaoViewAll(emp);
	}
	public List<Emp> viewAllEmployeeService(int pageid,int total)
	{
		return empDaoInterface.viewAllEmployeeDao(pageid, total);
	}

	@Override
	public int delete(int id) 
	{
		return empDaoInterface.delete(id);
	}
	
	

}
