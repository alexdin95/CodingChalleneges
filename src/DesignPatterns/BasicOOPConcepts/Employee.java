package DesignPatterns.BasicOOPConcepts;

public class Employee {
    int empId;
    String empName;
    double salary;
    int grade;
    String company = "IBM";
    Email email; // referinta catre interfata email.
    //inafara de faptul ca trebuie instantata in constructor aceasta are nevoie si de implementari
    // in clase pentru a putea fi utila.

    public Employee(int empId, String empName, Email email) {
        this.empId = empId;
        this.empName = empName;
        this.email=email;
    }

    // vrem o metoda care va notifica angajatul, care sa utilizeze referinta din email.
    public void notifyEmployee() {
        email.sendEmail(); // utilizeaza referinta din clasa ceea ce inseaman ca aceasta trebuie neaparat instantiata pt functionarea metodei
        // Asta inseamna ca si aceasta trebuie sa se regaseasca in constructor.
    }

    public double getSalary() {
        return salary;
    }

    public int getGrade() {
        return grade;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
