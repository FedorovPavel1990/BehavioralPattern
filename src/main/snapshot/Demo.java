package main.snapshot;

import main.snapshot.boardgame.BoardGame;
import main.snapshot.snapshot.BoardGameSnapshot;

public class Demo {

    public static void main(String[] args) {
        BoardGame game = new BoardGame();

        game.move();
        game.move();
        game.move();
        game.move();

        game.info();
        BoardGameSnapshot boardGameSnapshot = new BoardGameSnapshot(game);

        game.move();
        game.move();
        game.move();
        game.move();

        game.info();
        boardGameSnapshot.restore();
        game.info();
    }

}
