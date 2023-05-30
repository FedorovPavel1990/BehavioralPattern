package main.snapshot.boardgame;

import main.snapshot.snapshot.BoardGameSnapshot;
import main.snapshot.snapshot.Snapshot;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class BoardGame {

    private Players players = new Players();

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public void roundMoving() {
        players.getPlayer1().move(diceRoll());
        players.getPlayer2().move(diceRoll());
        players.getPlayer3().move(diceRoll());
        players.getPlayer4().move(diceRoll());
    }

    public void info() {
        System.out.println("--------------------");
        System.out.printf("Игрок 1 на позиции - %d%nИгрок 2 на позиции - %d%nИгрок 3 на позиции - %d%nИгрок 4 на позиции - %d%n",
                players.getPlayer1().getPosition(),
                players.getPlayer2().getPosition(),
                players.getPlayer3().getPosition(),
                players.getPlayer4().getPosition());
        System.out.println("--------------------");
    }

    public Snapshot save() {
        return new BoardGameSnapshot(this);
    }

    public void load(Snapshot saved) {
        saved.restore();
    }

    private int diceRoll() {
        try {
            return SecureRandom.getInstanceStrong().nextInt(5) + 1;
        } catch (NoSuchAlgorithmException e) {
            return 0;
        }
    }

}
