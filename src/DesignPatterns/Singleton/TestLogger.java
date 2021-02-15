package DesignPatterns.Singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger ob1 = Logger.getInstance(); // va crea obiectul pt ca este primul si este null
        Logger ob2 = Logger.getInstance(); // il va returna pe cel creat deja , nu altul nou

        //va fi returnat acelasi obiect mereu daca cesta a fost creat.
    }
}
