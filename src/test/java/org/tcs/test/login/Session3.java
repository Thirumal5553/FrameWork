package org.tcs.test.login;

import java.io.File;


public class Session3 {
	public static void main(String[] args) throws IOException {
		//1.Mention the path of Excel
		File file = new File("C:\\Users\\NMS\\eclipse-workspace\\FrameWorkProject\\Excel\\Book.xlsx");
		
		//2.Get the ojects/ytes from File---->FileInputdtream
		FileInputStream stream =new FileInputStream(file);
		
		//3.Mention the workook----->Collection of sheet
		//Workbook workbook = new XSSFWorkbook(file);
		Workbook workbook = new XSSFWorkbook(stream);
		
		
		//4.Sheet Name
		//workbook.getSheet(null);
		Sheet sheet = workbook.getSheet("Data");
		
		//5.Get the row
		//sheet.getRow(0)
		Row row = sheet.getRow(2);
		
		//6.Get the cell
		//row.getCell()
		Cell cell = row.getCell(1);
		System.out.println(cell);
	}

}
