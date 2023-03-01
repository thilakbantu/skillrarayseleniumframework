package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/*
 * 
 * this class contains reusable method to perform actions on exception 
 * 
 */
public class ExcelUtility {

	private Workbook wb;
	/*
	 * this method is used to initialized the excel sheet
	 * 
	 */
	public void ExcelIntialization(String excelPath)
	{
		FileInputStream fis=null;
		
		try
		{
			fis=new FileInputStream(excelPath);

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			wb=WorkbookFactory.create(fis);
		}
	catch(EncryptedDocumentException |IOException e)
	{
		e.printStackTrace();
	}
	
	}
	/*
	 * this method is used to read data from excel
	 * 
	 */
	public String readDataFromExcelstring( String sheetName,int rowNum,int cellNum)
	{
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	/*
	 * this method is used to read multiple data from excel
	 * 
	 */
	public List<String>readDataFromExcel(String sheetName)
	{
		Sheet sh=wb.getSheet(sheetName);
		List<String>dataList=new ArrayList<>();
		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			dataList.add(sh.getRow(i).getCell(1).getStringCellValue());
		}
		return dataList;
		
	}
	/*
	 * 
	 * this method is used to close the excel workbook
	 * 
	 */
	public void closeExcel()
	{
		try
		{
			wb.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
