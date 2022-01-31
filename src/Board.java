public class Board {

    int movesLeft = 6;
    int moveCount = 0;

    Player player = new Player();

    public int movesLeft(){
        movesLeft--;
        return movesLeft;
    }
    public int moveCounter(){
        moveCount++;
        return moveCount;
    }


    public void updateBoard(){
        if (!player.gameOver){

            if (moveCount == 0){
                for (int x = 0; x < 6; x++){
                    System.out.println("⬛⬛⬛⬛⬛");
            }
        }


        }
    }
}
