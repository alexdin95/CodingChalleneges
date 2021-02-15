package DesignPatterns.BasicOOPConcepts;

public class B extends A {
    public void methodB (){
        System.out.println(" B Object");
    }
    @Override
    public void methodA (){
        System.out.println(" A Object Overriden");
    }

    public B doSomething(){ // builder Pattern, ca sa faci chain de metode.
        // verifica mai tarziu daca se mentin valorile updatate, din campuri
        //bag 2 campuri in clasa str int
        // intr-o metoda modific / initializez int si in a doua string, si verific daca se pastreaza modificarile
         System.out.println(" Smth");
        return this;
    }
    public B doSomething2(){ // builder Pattern, ca sa fac chain de metode.
        System.out.println(" Smth2");
        return this;
    }
}
