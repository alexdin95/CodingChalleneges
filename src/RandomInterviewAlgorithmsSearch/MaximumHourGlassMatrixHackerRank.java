package RandomInterviewAlgorithmsSearch;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaximumHourGlassMatrixHackerRank {

    //vom muta forma de hourglass prin Array si stocam suma maxima a valorilor din structura.
    public static int maxHourglass(int[][] arr) {
        int maxVal = -10000;
        //Given a 6X6  2D Array, :
        for (int i = 0; i <= 3; i++) { // pt ca hurglass poate sa inceapa maxim din index-ul 3, de la index 4 iese din Array-ul de 6X6

            for (int j = 0; j <= 3; j++) { // acelasi principiu in jos poate sa inceapa de la index-ul 3 cel tarziu
                int currentHourGlassVal = arr[i][j] + arr[i ][j+1] + arr[i ][j+2]
                        + arr[i + 1][j + 1]
                        + arr[i+2][j ] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                maxVal = Math.max(maxVal, currentHourGlassVal);
            }
        }
        return maxVal;

    }

    public static void main(String[] args) {

        int[][] arr = { {-9, -9, -9, 1, 1, 1},
                        {0, -9, 0, 4, 3, 2},
                        {-9, -9, -9, 1, 2, 3},
                        {0, 0, 8, 6, 6, 0},
                        {0, 0, 0, -2, 0, 0,},
                        {0, 0, 1, 2, 4, 0}};


        System.out.println(maxHourglass(arr));
    }


}
