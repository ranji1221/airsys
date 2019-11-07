package util;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtil {
	public static void main(String[] args)throws Exception {
		//-- 1. 构建文件流对象
		FileInputStream in = new FileInputStream("D:/a.xls");
		//-- 2. 工作簿
		HSSFWorkbook workBook = new HSSFWorkbook(in);
		//-- 3. 根据索引获取Sheet对象
		HSSFSheet sheet = workBook.getSheetAt(0);
		//-- 4. 获取最后一行的索引值
		int count = sheet.getLastRowNum();
//System.out.println(count);
		//-- 5. 循环遍历所有数据
		for(int i=1;i<=count;i++){
			//-- 获取某行对象
			HSSFRow row = sheet.getRow(i);
			//-- 获取某行的列数
			int colnum = row.getLastCellNum();
			//-- 迭代某行的数据
			HSSFCell cell = row.getCell(0);
			System.out.print(cell.getStringCellValue()+'\t');
			cell = row.getCell(1);
			System.out.print(cell.getNumericCellValue());
			System.out.println();
		}
		//-- 6. 关闭流
		workBook.close();
	}
}
