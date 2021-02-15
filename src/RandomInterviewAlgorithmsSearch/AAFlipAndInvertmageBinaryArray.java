package RandomInterviewAlgorithmsSearch;

public class AAFlipAndInvertmageBinaryArray {

    //Given a binary Matrix we want to flip the image horizontally and invert it.
    // Va trebui sa avem doua pointere pt inceput si final
    // daca pointerele au valori egale pur si simplu inversam valoarea lor din 1 facem 0 si vice versa.
    // Daca pointerele au valori diferite le sucim locul.

    // pt u narray unidimensional:
//    int low=0;
//    int high=arr.length;
//    while (low<=high){
//        if (arr[low]==arr[high]){
//         arr[low]=1-arr[low]; // il transform fie in 1 sau zero daca sunt egale
//            arr[high]=arr[low];
//        }
//        low++;
//        high--;
//    }
//    return arr


    static int[][] flipArr(int[][] arr) {


        for (int i = 0; i < arr.length; i++) { // iau pe rand toate subArray-urile
            int inceput = 0;
            int sfarsit = arr[i].length - 1;

            while (inceput <= sfarsit) {
                //daca pointerele au aceeasi valoare Inceput=1,sfarsit=1 le inversam si transformam in ZERO.
                if (arr[i][inceput] == arr[i][sfarsit]) {
                    arr[i][inceput] = 1 - arr[i][sfarsit];
                    arr[i][sfarsit] = arr[i][inceput];
                }
                inceput++;
                sfarsit--;
            }


        }
        return arr;
    }

    public static void main(String[] args) {

        int[][] arr = { {1, 1, 1, 0, 1, 1},
                        {1, 1, 0, 0, 0, 0},
                        {1, 0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 1, 0},
                        {0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0}};

        int[][] flippedArr = flipArr(arr);

        for (int i = 0; i < flippedArr.length; i++) {
            System.out.println("");
            for (int j = 0; j < flippedArr[i].length; j++) {
                System.out.print(flippedArr[i][j] + " ");
            }
        }
    }
    
}
