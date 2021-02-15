package DesignPatterns.BasicOOPConcepts.ToString_InstanceOf_Reflexion;

public class TestContact {

    public static void main(String[] args) {
        Friend contact1 = new Friend();
        contact1.name="Alex"; // are Acces deoarece Friend extinde Contact in care se afla var name
        contact1.phoneNumber = "0723161444";

        Contact contact2 = new Work();
        contact2.name="Manole"; // are Acces deoarece Friend extinde Contact in care se afla var name
        ((Work)contact2).email = "Ionut_Manolescu@yahoo.ro";

        Contact contact3 = new Friend();
        contact3.name= "Sebi";
        ((Friend) contact3).phoneNumber= "0724227021";
        // acum va functiona deoarece am facut Casting la contact3
        // pentru a avea acces la proprietatile din clasa Friend plus cele din contact
        // trebuie aplicat casting-ul pt fiecare camp in parte la care vrem acces
        ((Friend) contact3).name= "Sebi"; // merge chiar daca avea cces deja
         //contact3.phoneNumber= "0724227021"; // nu merge a doua oara, trebuie facut casting de fiecare data

        contact3.toString();
        contact2.toString();

    }
}
