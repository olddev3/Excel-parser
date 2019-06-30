package com.example.excel.controller;

 
import java.io.IOException;

import java.util.List;

 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

 
import com.example.excel.service.service;

 
 
 
@RestController 
 public class control_class
{
  
 
public control_class ()
  {
    
      // TODO Auto-generated constructor stub
  }
  
 
@Autowired 
 private service serve;
  
 
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
   


	/******** Post Controller ******* 
   @PostMapping (value = "/add", produces = MediaType.) 
    public void add () throws IOException 
  {


}  */

} 
