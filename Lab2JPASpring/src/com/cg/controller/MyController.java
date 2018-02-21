package com.cg.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dto.Trainee;

import com.cg.service.ITraineeService;

@Controller
public class MyController 
{
	@Autowired
	ITraineeService traineeservice;
	
	@RequestMapping(value="Login",method=RequestMethod.GET)
	public String Login()
	{
		return "loginPage";
	}
	
	@RequestMapping(value="Trainee",method=RequestMethod.GET)
	public String TraineeMgmt()
	{
		return "traineemgmt";
	}
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String addEmployee(@ModelAttribute("my") Trainee tr,
			Map<String,Object> model)
	{
		List<String> myDeg=new ArrayList<>();
		myDeg.add("Jee");
		myDeg.add("OrApps");
		myDeg.add("Vmv");
		model.put("deg", myDeg);
		return "addTrainee";
	}
	
	@RequestMapping(value="insertdata",method=RequestMethod.POST)
	public String insertTrainee(@ModelAttribute("my") Trainee tr)
	{
		
		traineeservice.addTrainee(tr);
		
		return "success";
		
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteTrainee()
	{
		return "deletetrainee";
	}
	
	@RequestMapping(value="show",method=RequestMethod.GET)
	public ModelAndView showATrainee(@RequestParam("tid") int id)
	{
		
		List<Trainee> myAllData=traineeservice.showTraineeById(id);
		return new ModelAndView("showall", "temp", myAllData);
	}
	
	@RequestMapping(value="dodelete",method=RequestMethod.GET)
	public String employeeDelete(@RequestParam("iiid") int id1)
	{
		traineeservice.deleteTrainee(id1);
		return "sucess1";
	}
	
	@RequestMapping(value="retrieve",method=RequestMethod.GET)
	public String retrieveTrainee()
	{
		return "retrievetrainee";
	}
	
	@RequestMapping(value="show1",method=RequestMethod.GET)
	public ModelAndView showATrainee1(@RequestParam("tid1") int id2)
	{
		
		List<Trainee> myAllData1=traineeservice.showTraineeById(id2);
		return new ModelAndView("retrievebyId", "temp", myAllData1);
	}
	
	@RequestMapping(value="retrieveall",method=RequestMethod.GET)
	public ModelAndView showAllEmployee()
	{
		List<Trainee> myAllData=traineeservice.showAllDetails();
		return new ModelAndView("showall1","temp",myAllData);
	}
	
	@RequestMapping(value="modify",method=RequestMethod.GET)
	public String updateTrainee()
	{
		return "updatetrainee";
	}
	
	@RequestMapping(value="show2",method=RequestMethod.GET)
	public ModelAndView showTrainee(@RequestParam("tid") int id,
			@ModelAttribute("me") Trainee t)
	{
		
		List<Trainee> myAllData=traineeservice.showTraineeById(id);
		return new ModelAndView("showall2", "temp", myAllData);
	}
	
	@RequestMapping(value="doupdate",method=RequestMethod.GET)
	public String employeeDelete1(@ModelAttribute("me") Trainee t)
	{
		System.out.println("Me mei gaya"+t.getTraineeId());
		traineeservice.updateTrainee(t);
		return "sucess1";
	}
		
}
