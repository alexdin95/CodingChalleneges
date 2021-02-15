package GameOfLife;

public class Simulation {
    int heightI;
    int widthJ;
    int board[][];

    public Simulation(int height, int width) {
        this.heightI = height;
        this.widthJ = width;
        this.board = new int[height][width];
    }


    // modifical astfel incat sa folosesti un string builder;
    //vrem o cale de printare a board-ului.
    public void printBoard() {
        System.out.println("---");
        for (int i = 0; i < board.length; i++) {
            String line = "|"; // cream o bordura si mai jos if pt afisare sub o alta forma daca celula este in viata
            for (int j = 0; j < board[i].length; j++) {
                if (this.board[i][j] == 0) {
                    line += "□";
                } else {
                    line += "■";
                }

            }
            line += "|";
            System.out.println(line);
        }
        System.out.println("---\n");
    }

    // Metode pentru a modifica starea unei celule Alive Or Dead;
    public void setAlive(int i, int j) {
        this.board[i][j] = 1;
        System.out.println("Cell [" + i + "] [" + j + "] was set to be Alive");
    }

    public void setDead(int i, int j) {
        this.board[i][j] = 0;
        System.out.println("Cell [" + i + "] [" + j + "] was set to be Dead");
    }
    // Pentru logica ne trebuie o functie care sa numere vecinii unei celule

    public int countAliveNeighbours(int i, int j) {
        int count = 0;


        count += getState(i - 1, j - 1);
        count += getState(i - 1, j);
        count += getState(i - 1, j + 1);

        count += getState(i, j - 1);
        count += getState(i, j + 1);

        count += getState(i + 1, j - 1);
        count += getState(i + 1, j);
        count += getState(i + 1, j + 1);

        return count;
    }

    public int getState(int i, int j) {
        //verific ca celula in care am citit este in grid, daca nu este o presupun moarta
        if (i < 0 || i >= heightI) {
            return 0;
        }
        if (j < 0 || j >= widthJ) {
            return 0;
        }
        return this.board[i][j];
    }

    public void step() {
        int newBoard[][] = new int[heightI][widthJ];
        for (int i = 0; i < board.length; i++) {
            // trebuie creat un board nou pt ca nu vrem sa il modificam pe cel original in timp ce il verificam.
            // pentru ca va rezulta in modificarea numerului de vecini pt o celula inainte ca aceasta sa poata fi verificata.


            for (int j = 0; j < board[i].length; j++) {
                int aliveNeighbours = countAliveNeighbours(i, j);
                if (this.board[i][j] == 1) {
                    if (aliveNeighbours < 2) {
                        newBoard[i][j] = 0;
                    } else if (aliveNeighbours == 3 || aliveNeighbours == 2) {
                        newBoard[i][j] = 1;
                    } else if (aliveNeighbours > 3) {
                        newBoard[i][j] = 0;

                    }
                } else {
                    if (aliveNeighbours == 3) {
                        newBoard[i][j] = 1;
                    }

                }
            }

        }
        this.board = newBoard;

    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(5, 10);
        simulation.printBoard();
        // toate sunt zero acu deci trebuie sa facem cateva vii;
        simulation.setAlive(2, 2);
        simulation.setAlive(2, 3);
        simulation.setAlive(2, 4);
        simulation.setAlive(2, 8);
        simulation.setAlive(2, 6);
        simulation.setAlive(2, 7);
        simulation.setAlive(1, 4);
        simulation.setAlive(1, 4);
        simulation.setAlive(3, 4);

        for (int i = 0; i < 50; i++) {
            simulation.printBoard();
            simulation.step();
            simulation.printBoard();
            simulation.step();
            simulation.printBoard();
            simulation.step();
            simulation.printBoard();
        }
        }
    }