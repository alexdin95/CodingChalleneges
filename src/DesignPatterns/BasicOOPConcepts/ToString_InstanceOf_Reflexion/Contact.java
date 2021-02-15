package DesignPatterns.BasicOOPConcepts.ToString_InstanceOf_Reflexion;

public class Contact {
    public String name; // Var va fi accesibila si din Friend si din Work
    // deoarece este extinsa de ele
    @Override
    public String toString(){
        String temp = "";

        if (this instanceof Friend){
            temp = "Name: "+ name + " PhNum: " + ((Friend)this).phoneNumber;
            // ((Friend)this).phoneNumber Trebuie sa fac castul altfel nu va fi afisat, este
            // okay sa il fac pt ca verific in if daca este o instanta a lui Friend
        } else if (this instanceof Work){
            temp = "Name: "+ name + " PhNum: " + ((Work)this).email;

        }
        return temp;
    }

}
