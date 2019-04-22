import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
    public static void main(String[] args) throws Exception{
        // create file input stream object for the excel sheet
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\MassaDados\\gxm_massadados.xls");
        // create object for work book
        Workbook wb = WorkbookFactory.create(fis);
        //create object for sheet present in excel using Workbook object 'wb'
        Sheet sheet = wb.getSheet("cadxls");
        //int sheet = wb.getSheetIndex("GXM");
        //create object for row present in sheet using Sheet object 'sheet'
        Row row = sheet.getRow(0);
        //create object for cell present in row using Row object 'row'
        Cell cell = row.getCell(0);
        //print the value present in the excel sheet
        System.out.println(cell.getStringCellValue());
        //System.out.println(sheet);
    }
}