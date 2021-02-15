package StringProblems;

public class IsStringPalindrome {

    public static boolean isPalindrome(String s){
        if (s.isEmpty() || s==null) return false;
        int pointer1=0;
        int pointer2=s.length()-1;

        while(pointer1<=pointer2){

        if (s.charAt(pointer1)!=s.charAt(pointer2)){
            return false;
        }
            pointer1++;
            pointer2--;
        }
        return true;
    }



    public static void main(String[] args) {

        System.out.println(isPalindrome("alaala"));
        System.out.println(isPalindrome("1alaala1"));
        System.out.println(isPalindrome("1ala2ala1"));
        System.out.println(isPalindrome("1ala2ala1"));
        System.out.println(isPalindrome("1ala22ala1"));
        System.out.println(isPalindrome("1ala223ala1"));
        System.out.println(isPalindrome("1ala22la1"));

    }
}
