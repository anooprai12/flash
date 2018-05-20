package com.kishore.mvc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kishore.mvc.Model.Emp;
import com.kishore.mvc.ServiceInterface.EmpServiceInterface;

@Controller
public class EmpController 
{
	@Autowired
	private EmpServiceInterface empServiceInterface;
	
	public EmpController() 
	{
		System.out.println("Created...");
	}
	
	@RequestMapping(value="/register")
	public ModelAndView register(Emp emp)
	{
		return new ModelAndView("register","reg",new Emp());
		
	}
	
	@RequestMapping(value="/empregister",method=RequestMethod.POST)
	public ModelAndView registerEmp(Emp emp)
	{
		empServiceInterface.empServiceSave(emp);
		return new ModelAndView("redirect:/viewemp");
		
	}
	
	@RequestMapping(value="/viewemp")
	public ModelAndView viewEmp(Emp emp)
	{
		List<Emp> list=empServiceInterface.empServiceViewAll(emp);
		return new ModelAndView("viewAll","list",list);
		
	}
	 @RequestMapping(value="/deleteEmployee/{id}",method = RequestMethod.GET)  
	    public ModelAndView delete(@PathVariable int id)
	  {  
		 	empServiceInterface.delete(id);  
	        return new ModelAndView("redirect:/view");  
	  }
	 
	
}
