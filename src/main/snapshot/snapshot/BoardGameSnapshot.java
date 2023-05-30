package main.snapshot.snapshot;

import main.snapshot.boardgame.BoardGame;
import main.snapshot.boardgame.Players;

public class BoardGameSnapshot implements Snapshot {

    private final BoardGame boardGame;

    private final Players savedPlayersPositions;

    public BoardGameSnapshot(BoardGame boardGame) {
        this.boardGame = boardGame;
        this.savedPlayersPositions = boardGame.getPlayers().copy();
    }
    @Override
    public void restore() {
        boardGame.setPlayers(savedPlayersPositions);
    }
}
