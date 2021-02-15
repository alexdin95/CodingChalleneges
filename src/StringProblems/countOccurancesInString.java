package StringProblems;

public class countOccurancesInString {
    public static int countOccurances(char c, String s){
        int counter = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i)==c){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countOccurances('a' ,"aaalae"));

    }
}
