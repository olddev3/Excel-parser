package com.example.excel.controller;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.excel.model.users;
import com.example.excel.respository.respository;
import com.example.excel.service.service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;


 
 
 
@RestController 
 public class control_class
{
  
 
private static final String FILE_NAME = null;


public control_class ()
  {
    
      // TODO Auto-generated constructor stub
  }
  
 
@Autowired 
 private service serve;
  
 
  /******* Get Controller 
 * @throws IOException *********/ 
  
 
//@GetMapping (value = "/view", produces =
//		    MediaType.
//		    APPLICATION_JSON_VALUE) 
// public ResponseEntity <
//    Object > getAll ()throws IOException 
//  {
//    
//return serve.convertTwoJson ();
//  
//
//}
   
private respository repo;

	//******** Post Controller ******* 
@PostMapping(value = "/add" , produces = MediaType.APPLICATION_JSON_VALUE)
public void convertExcelToJson() throws IOException,FileNotFoundException {
serve.add();
	
	
	
}

} 
