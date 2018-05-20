package com.kishore.mvc.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kishore.mvc.DaoInterface.EmpDaoInterface;
import com.kishore.mvc.Model.Emp;

@Repository
public class EmpDaoImpl implements EmpDaoInterface
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void empDaoSave(Emp emp) 
	{
		String sql="insert into Employee values(?,?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] { emp.getId(), emp.getName(), emp.getAddress(),  emp.getSalary() });
		        
	}

	@Override
	public List<Emp> empDaoViewAll(Emp emp) 
	{
		
		System.out.println("Inside view DAO");
		
	    String sql="select * from Employee"; 
	    return jdbcTemplate.query(sql,new RowMapper<Emp>()
	    {  
	        public Emp mapRow(ResultSet rs, int row) throws SQLException
	        {  
	        	 Emp employee = new Emp();
                 employee.setId(rs.getInt(1));
                 employee.setName(rs.getString(2));
                 employee.setAddress(rs.getString(3));
                 employee.setSalary(rs.getString(4));
	            return employee;  
	        }  
	    });  
	}
	public int delete(int id)
	{  
	    String sql="delete from girmiti.Employee where id="+id+""; 
	    return jdbcTemplate.update(sql);  
	}

	@Override
	public List<Emp> viewAllEmployeeDao(int pageid, int total) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
