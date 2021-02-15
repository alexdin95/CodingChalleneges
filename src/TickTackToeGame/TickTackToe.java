package TickTackToeGame;

import java.util.HashSet;
import java.util.Scanner;

public class TickTackToe {
    private HashSet<Integer> positions = new HashSet<>();
    int counter=0;

    private char[][] board = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setNumberX(int n) {
        if (positions.contains(Integer.valueOf(n))){
            System.out.println(" Invalid Value , it has already been set");

            return;
        } else {
            positions.add(Integer.valueOf(n));
        }
        switch (n) {
            case 1:
                this.board[0][0] = 'X';
                this.counter ++;
                break;
            case 2:
                this.board[0][2] = 'X';
                this.counter ++;
                break;
            case 3:
                this.board[0][4] = 'X';
                this.counter ++;
                break;
            case 4:
                this.board[2][0] = 'X';
                this.counter ++;
                break;
            case 5:
                this.board[2][2] = 'X';
                this.counter ++;
                break;
            case 6:
                this.board[2][4] = 'X';
                this.counter ++;
                break;
            case 7:
                this.board[4][0] = 'X';
                this.counter ++;
                break;
            case 8:
                this.board[4][2] = 'X';
                this.counter ++;
                break;
            case 9:
                this.board[4][4] = 'X';
                this.counter ++;
                break;

        }

    }

    public int getPosition() {
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        return position;
    }

    public void setNumberO(int n) {
        if (positions.contains(Integer.valueOf(n))){
            System.out.println(" Invalid Value , it has already been set");

            return;
        } else {
            positions.add(Integer.valueOf(n));
        }
        switch (n) {
            case 1:
                this.board[0][0] = 'O';
                this.counter ++;
                break;
            case 2:
                this.board[0][2] = 'O';
                this.counter ++;
                break;
            case 3:
                this.board[0][4] = 'O';
                this.counter ++;
                break;
            case 4:
                this.board[2][0] = 'O';
                this.counter ++;
                break;
            case 5:
                this.board[2][2] = 'O';
                this.counter ++;
                break;
            case 6:
                this.board[2][4] = 'O';
                this.counter ++;
                break;
            case 7:
                this.board[4][0] = 'O';
                this.counter ++;
                break;
            case 8:
                this.board[4][2] = 'O';
                this.counter ++;
                break;
            case 9:
                this.board[4][4] = 'O';
                this.counter ++;
                break;

        }


    }

    public boolean isXWinner() {
        if ((this.board[0][0] == 'X' && this.board[0][2] == 'X' && this.board[0][4] == 'X') ||
                (this.board[2][0] == 'X' && this.board[2][2] == 'X' && this.board[2][4] == 'X') ||
                (this.board[4][0] == 'X' && this.board[4][2] == 'X' && this.board[4][4] == 'X') ||
                (this.board[0][0] == 'X' && this.board[2][2] == 'X' && this.board[4][4] == 'X') ||
                (this.board[0][4] == 'X' && this.board[2][2] == 'X' && this.board[4][0] == 'X')||
                (this.board[0][0] == 'X' && this.board[0][2] == 'X' && this.board[0][4] == 'X')||
                (this.board[2][0] == 'X' && this.board[2][2] == 'X' && this.board[2][4] == 'X')||
                (this.board[4][0] == 'X' && this.board[4][2] == 'X' && this.board[4][4] == 'X'))  {
            return true;
        }
        return false;
    }

    public boolean isOWinner() {
        if ((this.board[0][0] == 'O' && this.board[0][2] == 'O' && this.board[0][4] == 'O') ||
                (this.board[2][0] == 'O' && this.board[2][2] == 'O' && this.board[2][4] == 'O') ||
                (this.board[4][0] == 'O' && this.board[4][2] == 'O' && this.board[4][4] == 'O') ||
                (this.board[0][0] == 'O' && this.board[2][2] == 'O' && this.board[4][4] == 'O') ||
                (this.board[0][4] == 'O' && this.board[2][2] == 'O' && this.board[4][0] == 'O') ||
                (this.board[0][0] == 'O' && this.board[0][2] == 'O' && this.board[0][4] == 'O')||
                (this.board[2][0] == 'O' && this.board[2][2] == 'O' && this.board[2][4] == 'O')||
                (this.board[4][0] == 'O' && this.board[4][2] == 'O' && this.board[4][4] == 'O')) {
            return true;
        }
        return false;
    }

    public void clearBoard() {
        this.board[0][0] = ' ';
        this.board[0][2] = ' ';
        this.board[0][4] = ' ';
        this.board[4][0] = ' ';
        this.board[4][2] = ' ';
        this.board[4][4] = ' ';
        this.board[2][0] = ' ';
        this.board[2][2] = ' ';
        this.board[2][4] = ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = "";

        TickTackToe game = new TickTackToe();
        game.counter=0;





        while (true) {
            game.printBoard();

            if ( game.counter %2 ==0){
                System.out.println( " Player 1 , Insert postion (1-9)");
                game.setNumberX(game.getPosition());



            } else {
                System.out.println( " Player 2 , Insert postion (1-9)");
                game.setNumberO(game.getPosition());

            }
            if ( game.isXWinner()){
                System.out.println( "Player 1 Has Won! \n CONGRATULATIONS !!!");
                game.printBoard();
                System.out.println( " Press any key to reset and restart or QUIT to exit ");
                command = sc.nextLine();
                if ( command.equals( "QUIT")) {

                    break;}
                else {
                    game.clearBoard();
                    game.counter=0;
                }

            } else if ( game.isOWinner()){
                System.out.println( "Player 2 Has Won! \n CONGRATULATIONS !!!");
                game.printBoard();
                System.out.println( " Press any key to reset and restart or QUIT to exit ");
                command = sc.nextLine();
                if ( command.equals( "QUIT")) {

                    break;}
                else {
                    game.clearBoard();
                    game.counter=0;
                }
            } else if (game.counter == 9 ) {

                System.out.println( "Equality \n Perfectly balanced as all things should be!");
                game.printBoard();
                System.out.println( " Press any key to reset and restart or QUIT to exit ");
                command = sc.nextLine();
                if ( command.equals( "QUIT")) {

                    break;}
                else {
                    game.clearBoard();
                    game.counter=0;
                }
            }

        }
        System.out.println( " Thank you for playing ");


    }
}
