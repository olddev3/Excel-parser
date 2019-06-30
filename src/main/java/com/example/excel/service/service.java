package com.example.excel.service;

 
import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.ArrayList;

 
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.ControllerAdvice;

 
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.SerializationFeature;

import com.fasterxml.jackson.databind.node.ObjectNode;

 
@Service 
 @ControllerAdvice 
 public class service
{
  
 
public service ()
  {
    
      // TODO Auto-generated constructor stub
  }
  
 
 
private static final String FILE_NAME =
    "C:\\Users\\knl\\Desktop\\customers-1.xlsx";
  
 
public ResponseEntity < Object > convertTwoJson ()throws IOException 
  {
    

      //      try {
    FileInputStream excelFile = new FileInputStream (new File (FILE_NAME));
    
Workbook workbook = new XSSFWorkbook (excelFile);
    
Sheet userSheet = workbook.getSheetAt (0);
    
int firstRowNum = userSheet.getFirstRowNum ();
     
int lastRowNo = userSheet.getLastRowNum ();
     
int noOfColumns = userSheet.getRow (0).getPhysicalNumberOfCells ();
     


//-----------------------    Getting Keys of JSON from first row of excel sheet  -----------
     


String key[] = new String[noOfColumns];
     

Row firstRow = userSheet.getRow (0);
     

for (int col = 0; col < noOfColumns; col++)
      {
	
Cell cell = firstRow.getCell (col);
	
key[col] = cell.getStringCellValue ();
    
} 


for (int i = 0; i < noOfColumns; i++)
      
System.out.println (key[i]);
    
 
 
//---------------------------  Ends Here -----------------------------
      
 
//-----------------------       Creating JSON   ---------------------------
      ObjectMapper mapper =
      new ObjectMapper ().enable (SerializationFeature.INDENT_OUTPUT);
    
ArrayList < ObjectNode > users = new ArrayList <> ();
    
//                      JsonNode node = mapper.createObjectNode();
      
//                      ((ObjectNode) node).put("key","value");
//                      System.out.println(node);
      
for (int row = 1; row <= lastRowNo; row++)
      {
	
JsonNode node = mapper.createObjectNode ();
	
 
Row currentRow = userSheet.getRow (row);
	
for (int col = 0; col < noOfColumns; col++)
	  {
	    
Cell cell = currentRow.getCell (col);
	    
 
//                                      ((ObjectNode) node).put(key[col],cell.getStringCellValue());
	      
if (cell.getCellTypeEnum () == CellType.STRING)
	      {
		
((ObjectNode) node).put (key[col],
					  cell.getStringCellValue ());
	      
}
	    else if (cell.getCellTypeEnum () == CellType.NUMERIC)
	      {
		
((ObjectNode) node).put (key[col],
					  cell.getNumericCellValue ());
	      
}
	    
 
//                                      System.out.println(cell.getStringCellValue());
	  }
	
users.add ((ObjectNode) node);
      
 
}
    
      //      System.out.println(users);
      
 
      //      } 
      
      /*      catch (FileNotFoundException e) {
         e.printStackTrace();
         } catch (IOException e) {
         e.printStackTrace();
         } */ 
      
 
return new ResponseEntity <> (users, HttpStatus.OK);
  
 
 
 
 
}

 
 
 
 
}


