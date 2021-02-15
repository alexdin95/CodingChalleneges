package DesignPatterns.TemplateMethodPattern;

public class TestTemplateMethod {

    public static void main(String[] args) {

        ExcelFile obj1 = new ExcelFile();
        obj1.readProcessAndSave();

        TextFileSystem obj2 = new TextFileSystem();
        obj2.readProcessAndSave();
    }
}
