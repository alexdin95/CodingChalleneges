package StringProblems;

public class FirstNonrepeatedCharFromString {

    //1 Metoda 1 cu un singur index of si Substrings
    public static char firstNonRepeatedChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (((s.substring(0,i) + s.substring(i+1,s.length())).indexOf(s.charAt(i))) == -1) {
                return s.charAt(i);
            }

        }
return '*';

    }

    //2 Metoda cu first index si last index

    public static char firstNonRepeatedChar2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return s.charAt(i);
            }

        }
        return '*';
    }


    public static void main(String[] args) {
        System.out.println("alex".substring(1));
        System.out.println(firstNonRepeatedChar("avavml"));
        System.out.println(firstNonRepeatedChar2("avavml"));
    }
}

