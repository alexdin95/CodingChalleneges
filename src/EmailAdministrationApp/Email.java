package EmailAdministrationApp;

import java.util.Random;
import java.util.Scanner;

public class Email {
   // Random random = new Random();
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailboxCapacity;
   private String alternateEmail;
   private int passwordcapacity = 8;
   private String email;
   private String companySuffix="anycompany.com";


   //private String company;
  // private String email;


    public Email(String firstName,
                 String lastName
    ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password = randomPassword(passwordcapacity);
        this.email = firstName.toLowerCase()+ "."+ lastName.toLowerCase() +"@" + department.toLowerCase()+ "."+ companySuffix.toLowerCase() ;

    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                ", passwordcapacity=" + passwordcapacity +
                ", email='" + email + '\'' +
                ", companySuffix='" + companySuffix + '\'' +
                '}';
    }

    //Set the mailbox Capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    // Set alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }
    // Change password

    public void setPassword(String newPassword){
        this.password=newPassword;
    }
    //get mail box capacity
    public String getMailboxCapacity(){
        return this.alternateEmail;
    }
    // get password
    public String getPassword(){
        return this.password;
    }

    // get alternate email
    public int getAlternateEmail(){
        return this.mailboxCapacity;
    }


    private  String setDepartment(){
        System.out.print("Please insert the number associated to the department department:\n" +
                " 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for none.\n");
        Scanner sc = new Scanner(System.in);
        int depChoice =  sc.nextInt();
         if (depChoice == 1){
            return "sales";
        }
        else if (depChoice == 2){ return "dev";}
        else if(depChoice == 3){ return "acct";}
        else {return "";}

    }

    private String randomPassword(int lenght){
        String passwordSet ="ABCDEFGHIJKLMNOPRSTUNXYZ0123456789!@#$%^&*";
        char[] password = new char[lenght];
        for (int i =0 ; i <lenght; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i]= passwordSet.charAt((int) (Math.random() * passwordSet.length()));
        }

        return new String( password); // transform char arr intr-un string;
    }

// serializable.
}
