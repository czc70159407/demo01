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
		// ָ��Ҫ��ȡ EXCEL �ĵ�����
		String filename = "d:\\test\\Mobile.xls";
	
		//ͨ���������ȡconnection
		Connection connection = DbcpUtils.getConnection();
		Statement state = connection.createStatement();
		
		// filename="d:\\hello.xls";
		// ����������
		FileInputStream input = new FileInputStream(filename);
		
		// ͨ������������������������������
		Workbook workbook = WorkbookFactory.create(input);
		
		//�����������ݶ���
		Modile modile =new Modile();
		
		// ������������������й�����
		int sheetnum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetnum; i++) {
		
			// ��ȡ������������
			Sheet sheet = workbook.getSheetAt(i);
			
			// ��ȡ�������µ���������
			int rownum = sheet.getPhysicalNumberOfRows();
			
			// ��ȡ��һ�еĵ�Ԫ�����
			for (int j = 1; j < rownum; j++) {
			
				// ��ȡ��ÿһ��
				Row row = sheet.getRow(j);
				int cellnum = row.getPhysicalNumberOfCells();
				
				// ��ȡÿһ���µ�ȫ����Ԫ��
				for (int x = 1; x < cellnum; x++) {
					Cell cell = row.getCell(x);
				
					// ��ȡÿ����Ԫ���µ�����
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
