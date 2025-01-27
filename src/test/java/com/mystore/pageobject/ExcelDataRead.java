package com.mystore.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {
public static void main(String[] args)  {
	XSSFWorkbook ExcelWBook=null;
	XSSFSheet ExcelSheet= null;
	XSSFRow Row;
	XSSFCell Cell;
	// Create an object of File Class to open file
	File excelFile = new File("C:\\Users\\Moreshwar\\Desktop\\DataReadExcel.xlsx");
	FileInputStream inpuStramfile = null;
//to create object of fileinputstream to read data from file
	
	try {
		 inpuStramfile = new FileInputStream(excelFile);
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
	//ExcelWBook= new XSSFWorkbook(inpuStramfile);
	
	
	}
}
