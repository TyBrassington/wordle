import java.util.Arrays;
import java.util.Scanner;

public class Player {

    Game game = new Game();
    boolean gameOver = false;


    public void playerMove() {
        //splits word into individual chars
        Word word = new Word();
        String str = word.setWord();
        char[] stringToChar = str.toCharArray();
        for (char output : stringToChar)
            System.out.print(output + " ");
        System.out.println("");


        Board board = new Board();

        while (true) {
            //user input and valid input
            Scanner IO = new Scanner(System.in);
            if (board.movesLeft > 0) {
                board.moveCounter();
                System.out.println("Guess the word:");
                String userInput = IO.nextLine().toLowerCase();
                boolean isLetter = userInput.matches("[a-zA-Z]+");
                if (isLetter == true) {
                    if (userInput.length() == 0) {
                        System.out.println("Input something.\n");
                    } else if (userInput.length() != 5) {
                        System.out.println("Input a 5 word.\n");
                    } else {

                        char[] inputToChar = userInput.toCharArray();
                        System.out.println("");
                            //win condition
                            if (Arrays.equals(stringToChar, inputToChar)) {
                                System.out.println("\uD83D\uDFE9"); //placeholder for board
                                if (board.moveCount != 1) {
                                    System.out.println("You won in " + board.moveCount + " moves!");
                                } else {
                                    System.out.println("You won in " + board.moveCount + " move!");
                                }
                                gameOver = true;
                                break;
                            } else {
                                System.out.println("\uD83D\uDFE5"); //placeholder for board
                                board.movesLeft();
                                board.moveCounter();
                                if (board.movesLeft != 0) {
                                    System.out.println(board.movesLeft + " Moves Remaining\n");

                                }

                            }
                        }
                    }
                } else {
                    System.out.println("Game Over");
                    gameOver = true;
                    break;
                }
            }
        }
    }

