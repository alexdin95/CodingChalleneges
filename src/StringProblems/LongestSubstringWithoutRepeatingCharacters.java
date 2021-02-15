package StringProblems;

public class LongestSubstringWithoutRepeatingCharacters {

    public static String longestSubstring(String s ){
        String longestSubstring="";
        for (int i =0;i < s.length()-1;i++){
            if(s.substring(i+1,s.length()).indexOf(s.charAt(i))==-1){
                //iau bucata far i, si verific daca se afla characterul de la i in restul.
                longestSubstring+=s.charAt(i);
            } else {break;}

        }
        return longestSubstring;
    }
    public static void main(String[] args) {

        System.out.println(longestSubstring("Alex are mere"));
        System.out.println(longestSubstring("123qweasdd"));

    }
}
