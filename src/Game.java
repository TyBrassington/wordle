import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //separates randWord into individual letters


        Board board = new Board();
        Player player = new Player();

        board.updateBoard();
        player.playerMove();




    }
}
