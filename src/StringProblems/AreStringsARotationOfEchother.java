package StringProblems;

public class AreStringsARotationOfEchother {


    public static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }
        String concatenated = original + original;

        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String original="123456789";
        String rotated="678912345";
        System.out.println(checkRotatation(original,rotated));

    }

}
