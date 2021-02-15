package DesignPatterns.BasicOOPConcepts;

public class Test {
    public static void main(String[] args) {
        A objA = new A(); //Cream un obiect A
        objA.methodA(); // poate accesa metoda din A

        B objB = new B(); // Cream un obiect B
        objB.methodB();// poate accesa metoda din A si B
        objB.methodA(); // pentru ca B mosteneste A

        A obj1 = new B(); // SuperclassOBJ = new SubclassOBJ
        obj1.methodA(); // poate accesa metoda din A doar ,chiar daca este obiect de tip B
        // desii este un obiect B care ar trebui sa aiba acces la metodele din B,
        // dar in stanga "=" avem un obiect A deci poate accesa doar proprietatiel din A.
        int x = 10;
        // lafel cum int x = 10; poate primi doar valori de tip int, si obj1 poate accesa doar metode din A chiar este un obiect de tip B
        //B obj2 = new A(); // imposibil SubclassOBJ != new superclassOBJ
        // practic limitez obiectul de tip B doar la metodele din A
        //daca ar fi sa suprascriem metoda A in B atunci va apela metoda suprascrisa si nu cea originala din A, dar la metoda B tot nu va avea acces pt ca este suprascrisa.


    }
}
