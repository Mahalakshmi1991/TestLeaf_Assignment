package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel  {
	
	public static String[][] readExcelData(String filename) throws IOException
	{
		//Open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelData/"+filename+".xlsx");
		
		//To locate worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//To count the number of rows
		//including header (row 1)
		//int physicalNumberOfRows =  sheet.getPhysicalNumberOfRows();
		
		//excluding header
		int rowCount = sheet.getLastRowNum();
		
		//To count number of columns
		int columnCount = sheet.getRow(rowCount).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		for(int i = 1; i <= rowCount ; i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j = 0 ; j < columnCount ; j++)
			{
				data[i-1][j] = row.getCell(j).getStringCellValue();
			}
		}
		wb.close();
		return data;
		
	}

}
