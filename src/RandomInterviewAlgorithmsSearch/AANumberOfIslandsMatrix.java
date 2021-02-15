package RandomInterviewAlgorithmsSearch;

public class AANumberOfIslandsMatrix {
    // gasesc 1, gasesc apoi insula acelui 1, trecem vertical si orizontal prin toata insula cu un bredforsearch si modific din 1 in 0,
    // crescand counter-ul pe fiecare insula
    //modific 1 in zero peste tot unde se ating pe V si H, si cresc counter-ul
    //bredford search java
    //voi face metoda care face cautarea / modificarea

    public void callBFS(char[][] grid, int i, int j){
        //Check boundaries
        // la j trebuie verificat pt grid[i]
        if (i <0 || i>= grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0'  ){
            return;
        }
        // fac o chemare recursiva ca sa verific toate locatiile adiacente valorii 1
        grid[i][j]='0';
        callBFS(grid,i+1,j);//up
        callBFS(grid,i-1,j);//down
        callBFS(grid,i,j+1);//right
        callBFS(grid,i,j-1);//left
    }

    public int numIslands(char[][] grid) {
        int counter = 0;
        for (int i =0 ; i<grid.length;i++){//pt fiecare rand
            for (int j =0; j<grid[i].length; j++){// pt fiecare coloana
                if (grid[i][j] == '1'){
                    counter++;
                    callBFS(grid,i,j);
                }
            }
        }
        return counter;
    }
}
