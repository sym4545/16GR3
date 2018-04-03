/**
 * 
 */
package com.qhit.lh.grs.sym.exam.tkgl.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qhit.lh.grs.sym.exam.kmgl.bean.Course;
import com.qhit.lh.grs.sym.exam.tkgl.bean.WrittenQuestion;


public class PoiReaderExcel {
	@SuppressWarnings("resourse")
	public static List<WrittenQuestion> readerExcel(InputStream is,Course course){
		
		List<WrittenQuestion> listQuestion = new ArrayList<WrittenQuestion>();
		//澹版槑骞舵墦寮�宸ヤ綔绨�?
		Workbook workbook = null;
		try {
			//璇诲彇鏁版嵁娴佷腑鐨勬枃浠跺璞�?
			workbook = new HSSFWorkbook(is);
		} catch (IOException e) {
			try {
				//璇诲彇鏁版嵁娴佷腑鐨勬枃浠跺璞�?
				workbook = new XSSFWorkbook(is);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		try {
			//璇诲彇榛樿鐨勭涓�涓伐浣滆�?
			Sheet sheet = (Sheet) workbook.getSheetAt(0);
			//浠庣储寮曚负1鐨勮寮�濮嬭
			int firstRowIndex = 1;
			//璇诲埌鏈夋暟鎹殑鏈�鍚庤鐨勭储寮�?
			int lastRowIndex = sheet.getPhysicalNumberOfRows();
			for (int i = firstRowIndex; i < lastRowIndex; i++) {
				//閫氳繃绱㈠紩鑾峰彇褰撳墠琛岀殑�?�硅�?
				Row row = sheet.getRow(i);
				WrittenQuestion question = new WrittenQuestion();
				//鑾峰彇鏈�鍚庡崟鍏冩牸绱㈠紩
				int lastCellIndex = row.getLastCellNum();
				if(row.getCell(0).getStringCellValue() == null && "".equals(row.getCell(0).getStringCellValue())){
					break;
				}
				for (int j = 0; j < lastCellIndex; j++) {
					//鑾峰彇褰撳墠鍗曞厓鏍肩殑瀵硅�?
					Cell cell = row.getCell(j);
					cell.setCellType(Cell.CELL_TYPE_STRING);
					switch (j) {
					case 0:
						question.setQtitle(cell.getStringCellValue());
						break;
					case 1:
						question.setOptionA(cell.getStringCellValue());
						break;
					case 2:
						question.setOptionB(cell.getStringCellValue());
						break;
					case 3:
						question.setOptionC(cell.getStringCellValue());
						break;
					case 4:
						question.setOptionD(cell.getStringCellValue());
						break;
					case 5:
						question.setAnswer(cell.getStringCellValue());
						break;
					case 6:
						question.setQtype(cell.getStringCellValue());
						break;
					case 7:
						question.setDegree(cell.getStringCellValue());
						break;
					case 8:
						question.setChapter(cell.getStringCellValue());
						break;
					}
				}
				//璁剧疆璇剧▼缂栧�?
				question.setCsId(course.getCsId());
				//娣诲姞璇曢鍜岃绋嬬殑鍏崇�?
				question.setCourse(course);
				//鎶婅鍙栫殑璇曢�?�硅薄淇濆瓨鍒伴泦鍚堜腑
				listQuestion.add(question);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listQuestion;
	}
}
