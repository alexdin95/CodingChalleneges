package DesignPatterns.BasicOOPConcepts;

public class TestEmployee {
    public static void main(String[] args) {
        Email email = new OutlookEmail();
        Employee obj1 = new Employee(100 ,"Alex",email);
        obj1.notifyEmployee();

      email = new WebserviceEmail(); // mut referinta
        Employee obj2 = new Employee(200 ,"Andreea",email);
        obj2.notifyEmployee();
    }
}
