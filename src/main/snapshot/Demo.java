package main.snapshot;

import main.snapshot.boardgame.BoardGame;
import main.snapshot.snapshot.Snapshot;

public class Demo {

    public static void main(String[] args) {
        BoardGame game = new BoardGame();
        Snapshot boardGameSnapshot;

        game.roundMoving();
        game.roundMoving();
        game.roundMoving();
        game.roundMoving();

        game.info();
        boardGameSnapshot = game.save();

        game.roundMoving();
        game.roundMoving();
        game.roundMoving();
        game.roundMoving();

        game.info();
        game.load(boardGameSnapshot);
        game.info();
    }

}
