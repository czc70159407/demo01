package com.offcn.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.offcn.po.Modile;

public class LuRu {
		
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, SQLException {
		// 指定要读取 EXCEL 文档名称
		String filename = "d:\\test\\Mobile.xls";
	
		//通过工具类获取connection
		Connection connection = DbcpUtils.getConnection();
		Statement state = connection.createStatement();
		
		// filename="d:\\hello.xls";
		// 创建输入流
		FileInputStream input = new FileInputStream(filename);
		
		// 通过工作簿工厂类来创建工作簿对象
		Workbook workbook = WorkbookFactory.create(input);
		
		//创建接受数据对象
		Modile modile =new Modile();
		
		// 遍历工作簿下面的所有工作表
		int sheetnum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetnum; i++) {
		
			// 获取到单个工作表
			Sheet sheet = workbook.getSheetAt(i);
			
			// 获取工作表下的所有行数
			int rownum = sheet.getPhysicalNumberOfRows();
			
			// 获取第一行的单元格个数
			for (int j = 1; j < rownum; j++) {
			
				// 获取到每一行
				Row row = sheet.getRow(j);
				int cellnum = row.getPhysicalNumberOfCells();
				
				// 获取每一行下的全部单元格
				for (int x = 1; x < cellnum; x++) {
					Cell cell = row.getCell(x);
				
					// 获取每个单元格下的内容
					if (cell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
						String celval = cell.getStringCellValue();
						if(x==1){
							modile.setMobileNum(Integer.parseInt(celval));
						}else if(x==2){
							modile.setMobileArea(celval);
						}else if(x==3){
							modile.setMobileType(celval);
						}else if(x==4){
							modile.setAreaCode(celval);
						}else if(x==5){
							modile.setPostCode(celval);
						}
						
					} else if (cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
						int celval = (int)cell.getNumericCellValue();
						if(x==1){
							modile.setMobileNum(celval);
						}else if(x==2){
							modile.setMobileArea(Integer.toString(celval));
						}else if(x==3){
							modile.setMobileType(Integer.toString(celval));
						}else if(x==4){
							modile.setAreaCode(Integer.toString(celval));
						}else if(x==5){
							modile.setPostCode(Integer.toString(celval));
						}	
					} else if (cell.getCellType() == HSSFCell.CELL_TYPE_BOOLEAN) {
						System.out.println(cell.getBooleanCellValue() + "\t");
					} else if (cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
						System.out.println("NULL" + "\t");
					} else {
						System.out.println(cell.getDateCellValue() + "\t");
					}
				}
				String sql="INSERT INTO mobile(mobilenum,mobilearea,mobiletype,areacode,postcode) "
						+"VALUES('"+modile.getMobileNum()+"','"+modile.getMobileArea()+"','"+modile.getMobileType()+"','"+modile.getAreaCode()+"','"+modile.getPostCode()+"')";
				state.executeUpdate(sql);
				if(j%1000==0){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}

	}

}
