package DesignPatterns.TemplateMethodPattern;

public class TextFileSystem {
    public void readProcessAndSave(){
        readData();
        processData();
        saveData();
    }


    public void readData() {
        System.out.println("Read Data from Text file"); }

    public void processData() {
        System.out.println("Process Data from Text file"); }

    public void saveData() {

        System.out.println("Save Data from Text file to DB"); }
}
