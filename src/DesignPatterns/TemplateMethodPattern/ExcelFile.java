package DesignPatterns.TemplateMethodPattern;

public class ExcelFile {
    public void readProcessAndSave(){
        readData();
        processData();
        saveData();
    }

    public void readData() {
        System.out.println("Read Data from excel file"); }

    public void processData() {
        System.out.println("Process Data from excel file");
    }

    public void saveData() {
        System.out.println("Save Data from Excel file to DB");
    }}
