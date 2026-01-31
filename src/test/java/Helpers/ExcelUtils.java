package Helpers;

import java.io.FileInputStream;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] getExcelDataAsMap(String filePath, String sheetName) {

        List<Map<String, String>> rows = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            Row headerRow = sheet.getRow(0);

            int colCount = headerRow.getPhysicalNumberOfCells();

            FormulaEvaluator evaluator =
                    workbook.getCreationHelper().createFormulaEvaluator();
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);

                // ✅ SKIP empty rows (THIS FIXES YOUR NPE)
                if (row == null) {
                    continue;
                }

                Map<String, String> rowData = new LinkedHashMap<>();

                for (int j = 0; j < colCount; j++) {

                    String header =
                            headerRow.getCell(j).getStringCellValue().trim();

                    Cell cell =
                            row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

                    String value = formatter.formatCellValue(cell, evaluator);
                    rowData.put(header, value);
                }

                rows.add(rowData);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        Object[][] data = new Object[rows.size()][1];
        for (int i = 0; i < rows.size(); i++) {
            data[i][0] = rows.get(i);
        }
        return data;
    }
}
