package com.example.excel.controller;

 
import java.io.FileNotFoundException;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.excel.repository.repository;
import com.example.excel.service.service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


 
 
 
@RestController 
 public class control_class
{
  
	
	private static final String FILE_NAME =
		    "C:\\Users\\knl\\Desktop\\customers-1.xlsx";
 
public control_class ()
  {
    
      // TODO Auto-generated constructor stub
  }
  
 
@Autowired 
 private service serve;

private repository  repo;
  
 
  /******* Get Controller 
 * @throws IOException *********/ 
  
 
@GetMapping (value = "/view", produces =
		    MediaType.
		    APPLICATION_JSON_VALUE) 
 public ResponseEntity <
    Object > getAll ()throws IOException 
  {
    
return serve.convertTwoJson ();
  }
   


	/******** Post Controller 
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException *******/
@PostMapping(value = "/add" , produces = MediaType.APPLICATION_JSON_VALUE)
public void save() throws IOException,FileNotFoundException
{
	
	
	serve.add1();
}
	/*
	HttpHeaders posthead = new HttpHeaders();
	
	   posthead.add("Lang", "en-Us");
	   posthead.getDate();
	
		ObjectMapper objectMapper = new ObjectMapper();
		String formJsonData = formNode.toString();
		try {
			
			Users use = objectMapper.readValue(formJsonData, Users.class);
              repo.save(use);
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(formJsonData);
		
		 return new ResponseEntity<>(formJsonData,posthead ,HttpStatus.OK);
	}
	*/


} 
