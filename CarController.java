package com.sierraspringboot.mvnProject.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	 
	List<String> cars = new ArrayList<String>();
		
	@RequestMapping(value="/cars", method=RequestMethod.POST)
	public String addCar(@RequestBody String car)
	
	{
		cars.add(car);
		return "Successfully Car add: " + car;
	}
	
	@RequestMapping ("/cars")
	public List<String> getCars(){
		return cars;
	}
	@RequestMapping(value="/cars", method=RequestMethod.DELETE)
	public String deleteCar(@RequestBody String car) {
		cars.remove(car);
		return " Succefully Car removed: " + car;
	}

}
