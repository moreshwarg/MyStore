package com.mystore.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataReadDemo {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook Workbook= null;
		XSSFSheet xSSFSheet= null;
		int xSSFRow;
		XSSFCell xSSFCell;
		File file= new File("C:\\Users\\Moreshwar\\Desktop\\DataReadExcel.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook= new XSSFWorkbook(fis);
		xSSFSheet = Workbook.getSheet("TestData");
		int ttlRow1= xSSFSheet.getLastRowNum()+1;
		int ttlCell=xSSFSheet.getRow(0).getLastCellNum()+1;
		
		for(int totalRow=0;totalRow<ttlRow1;totalRow++) {
			for(int totalCell=0;ttlCell<ttlCell;ttlCell++ ) {
				System.out.println(xSSFSheet.getRow(totalRow).getCell(totalCell).toString());	
				System.out.println("\t");}
		}
System.out.println("\n");
	}
	
}
