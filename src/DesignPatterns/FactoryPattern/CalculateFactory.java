package DesignPatterns.FactoryPattern;

public class CalculateFactory {
    // String type va determina tip-ul de obiect necesar.
    public Calculate getCalculation(String type) {
        // concept de mai devreme Superclasa poate fi clasa sau interfata,
        // in cazul de fata va fi interfata deoarece toate obiectele necesare o returneaza si o vom utiliza ca tip-ul de returnare.
        Calculate object = null;
        if (type.toLowerCase().equals("substract")) {
            object = new Substract();
        } else if (type.toLowerCase().equals("add")) {
            object = new Add();
        } else if (type.toLowerCase().equals("divide")) {
            object = new Divide();
        }
        return object;
    }

}

