package Utulities;

import io.cucumber.java.Scenario;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtility {

    public static ArrayList<ArrayList<String>> getData(String path, String sheet, int sutunSayisi) {
        ArrayList<ArrayList<String>> tablo = new ArrayList<>();
        Sheet sheet1 = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet1 = workbook.getSheet(sheet);
        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        for (int i = 0; i < sheet1.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> satir = new ArrayList<>();
            for (int j = 0; j < sutunSayisi; j++) {
                satir.add(sheet1.getRow(i).getCell(j).toString());
            }
            tablo.add(satir);
        }
        return tablo;
    }
    public static void writeExcel(String path, Scenario senaryo) {
        File file = new File(path);


        if (!file.exists()) {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Sayfa1");

            Row satir = sheet.createRow(0);
            Cell hucre = satir.createCell(0);
            hucre.setCellValue(senaryo.getName());
            Cell hucre2 = satir.createCell(1);
            hucre2.setCellValue(senaryo.getStatus().toString());

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();

            }catch (Exception ex){
                System.out.println("e = " + ex.getMessage());
            }

        } else {
            FileInputStream inputStream=null;
            Workbook workbook=null;
            Sheet sheet=null;

            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            }catch (Exception ex){
                System.out.println("ex = " + ex.getMessage());
            }


            Row satir = sheet.createRow(sheet.getPhysicalNumberOfRows());
            Cell hucre = satir.createCell(0);
            hucre.setCellValue(senaryo.getName());
            Cell hucre2 = satir.createCell(1);
            hucre2.setCellValue(senaryo.getStatus().toString());

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            }catch (Exception ex){
                System.out.println("ex = " + ex.getMessage());
            }

        }
    }
}
