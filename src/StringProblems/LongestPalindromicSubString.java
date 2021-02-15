package StringProblems;

import java.util.Map;

public class LongestPalindromicSubString {

    // Deci cea mai buna cale este de a incerca din mijloc sa ne expandam cat mai mult la dreapta si stanga si sa verificam pentru mijloc cat de mult se poate extinde si sa respecte conditiile de palindrom

    // EX cazul cel mai bun: badadab :    b<--a<--d<--a-->d-->a-->b, este un palindrom pt ca fiecare expansiune respecta conditia de palindrom
    // Pentru acest string am avea ca punct de plecare fiecare litera in parte pt expansiune si o pastram pe cea cu lungimea cea mai mare.
    //EX:  alabum:    a<--l-->abum ar fi Cel mai mare Substring Palindromic.

    //Problema apare ca avem 2 cazuri diferite in functie de Stringul verificat odata pentru String-uri impare si odata pentru Stringuri pare
    //Deoarece metoda b<--a<--d<--a-->d-->a-->b (Impar) nu ar merge pentru un string de tip-ul badaadab pentru ca expansiunea lui palindromica este
    // EX: badaadab b<--a<--d<--aa-->d-->a-->b
    //!! Ceea ce trebuie verificat defapt este daca avem String-uri duplicate unul langa altul in sstring pentru ca putem avea cazul impar cu 2 stringuri identice unul
    // langa celalalt ca punct de plecare ibadaadablk ib<--a<--d<--aa-->d-->a-->blk (Impar dar aceeasi regula)
    //Deci fac o metoda de traversare care primeste un String si un indice de plecare in care trebuie sa verific daca String-ul are caractere duplicate si sa isi schimbe regulile in functie de asta.

    //Metoda de expand from Middle
    public int expandFromMiddle(String s, int left, int right) {
        //First we check if the String is Fucked up
        int max = 0;
        if (s == null || left > right) return 0;
        while (left >= 0 && right <= s.length() - 1 //Cat timp e in lungime String-ului
                && s.charAt(left) == s.charAt(right)) { // Cat timp respecta conditia de palindrom
            left--;
            right++;

        }

        return right-left-1; //-1 pt ca avem de-a face cu index-uri
    }
    public static void main(String[] args) {


    }
}

