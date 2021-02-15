package StringProblems;

public class SebiMethodStrings {

    public static String getSubstring (String str, int start, int end){
        String substring="";
        if (end < 0 || end > str.length()-1 || start < 0 || start > str.length()-1 || start > end){
            return "Sorry Indexes are invalid";
        }
        for (int i = start; i <= end ; i++){
            substring += str.charAt(i) ;
        }
        return substring;
    }


    public static void main(String[] args) {
        System.out.println( getSubstring("Alexandru Are mere", 9,17));
    }
}
