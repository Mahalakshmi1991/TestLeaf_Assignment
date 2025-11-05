package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel
{

	public static String[][] readExcelData(String fileName) throws IOException
	{
		XSSFWorkbook workBook = new XSSFWorkbook("./ExcelData/"+fileName+".xlsx");
		XSSFSheet xssfSheet = workBook.getSheet("Sheet1");
		int rowCnt = xssfSheet.getLastRowNum();
		short columnCnt = xssfSheet.getRow(rowCnt).getLastCellNum();
		String[][] data= new String[rowCnt][columnCnt];
		try
		{
		
		for(int i = 1; i <= rowCnt; i++)
		{
			XSSFRow row = xssfSheet.getRow(i);
			for(int j = 0; j < columnCnt; j++)
			{
				data[i-1][j] = row.getCell(j).getStringCellValue();
			}
		}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			workBook.close();
		}
		return data;
	}

}
