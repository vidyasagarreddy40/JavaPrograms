import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class excelDataConfig {

    private static final excelDataConfig INSTANCE = new excelDataConfig();

    private excelDataConfig(){
         
    }

    public static excelDataConfig getInstance(){
        return INSTANCE;
    }

    XSSFWorkbook wb;
    XSSFSheet sheet;
    File src;

    public void getExcel(String excelPath) {
        try {
            if (src == null) {
                src = new File(excelPath);
                FileInputStream fileInputStream = new FileInputStream(src);
                wb = new XSSFWorkbook(fileInputStream);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getData(String sheetName, int Row, int Col) {
        sheet = wb.getSheet(sheetName);
        String data = sheet.getRow(Row).getCell(Col).getStringCellValue();

        return data;
    }

    public void writeExcel(String sheetName, int Row, int Col, String text) {
        try {
            sheet = wb.getSheet(sheetName);
            sheet.getRow(Row).createCell(Col).setCellValue(text);
            FileOutputStream fos = new FileOutputStream(src);
            wb.write(fos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
