package StringProblems;

public class ConvertStringToInt {

    public static int covertStringToInt (String s) {

        int sInt = Integer.parseInt(s);
        try {
            sInt = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            sInt = 0;
        }
        return sInt;
    }
    public static void main(String[] args) {

    }
}
