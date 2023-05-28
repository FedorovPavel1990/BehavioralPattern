package main.snapshot.boardgame;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class BoardGame {

    private int player1 = 0;
    private int player2 = 0;
    private int player3 = 0;
    private int player4 = 0;

    public void move() {
        player1 += diceRoll();
        player2 += diceRoll();
        player3 += diceRoll();
        player4 += diceRoll();
    }

    public void info() {
        System.out.println("--------------------");
        System.out.printf("Игрок 1 на позиции - %d%nИгрок 2 на позиции - %d%nИгрок 3 на позиции - %d%nИгрок 4 на позиции - %d%n",
                player1, player2, player3, player4);
        System.out.println("--------------------");
    }

    public BoardGame save() {
        BoardGame savedBoardGame = new BoardGame();
        savedBoardGame.player1 = player1;
        savedBoardGame.player2 = player2;
        savedBoardGame.player3 = player3;
        savedBoardGame.player4 = player4;
        return savedBoardGame;
    }

    public void load(BoardGame savedBoardGame) {
        player1 = savedBoardGame.player1;
        player2 = savedBoardGame.player2;
        player3 = savedBoardGame.player3;
        player4 = savedBoardGame.player4;
    }

    private int diceRoll() {
        try {
            return SecureRandom.getInstanceStrong().nextInt(5) + 1;
        } catch (NoSuchAlgorithmException e) {
            return 0;
        }
    }

}
