package com.ampersand.apinasa.apis;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ampersand.apinasa.utils.ConRegistroNasa;
import com.ampersand.apinasa.beans.RegistroNasa;

@RestController 
@RequestMapping("/apis")
public class RegistroNasaApi {
	
	@Autowired
	ConRegistroNasa crn;
	
	@GetMapping("/getregnasa")
	public List<RegistroNasa> getAll(){ 

	return crn.gets();
	 }

	
	
	
	

}
