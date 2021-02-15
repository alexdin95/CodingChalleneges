package StringProblems;

public class SFindAllPermutationsOfAString_HARD {


    //1.
    public static void findAllPermutations(String word) {
    //3.
        permutation("", word);
    }


    //2.
    private static void permutation(String perm, String word) {
        if (word.isEmpty()) { //word se va micsora succesiv pana cand  va fi printat
            System.err.println(perm + word);
        } else {
            //Algorithm is keeping one character fix and then calculating permutations of others.
            for (int i = 0; i < word.length() ;i++){
                permutation(perm + word.charAt(i), //blocheaza caracterul
                        word.substring(0, i) + word.substring(i + 1, word.length()));
            }           // ia restul de charactere inainte si dupa characterul blocat si face un string din ele
        }
    }


    public static void main(String[] args) {
        findAllPermutations("122");
    }
}
