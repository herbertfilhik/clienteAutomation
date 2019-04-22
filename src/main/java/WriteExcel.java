import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
    public static void main(String[] args) throws Exception {
        // create file input stream object for the excel sheet
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\MassaDados\\cad_massadados.xls");
        // create object for work book
        Workbook wb = WorkbookFactory.create(fis);
        //create object for sheet present in excel using Workbook object 'wb'
        Sheet sheet = wb.getSheet("cadxls");
        //create object for row present in sheet using Sheet object 'sheet'
        Row row = sheet.getRow(1);
        //create object for cell present in row using Row object 'row'
        Cell cell = row.createCell(1);
        cell.setCellValue("Written by apache poi2");
        FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\MassaDados\\cad_massadados.xls");
        wb.write(fos);
    }
}