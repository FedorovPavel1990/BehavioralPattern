package main.snapshot.snapshot;

import main.snapshot.boardgame.BoardGame;

public class BoardGameSnapshot implements Snapshot {

    private final BoardGame boardGame;
    private final BoardGame savedBoardGame;

    public BoardGameSnapshot(BoardGame boardGame) {
        this.boardGame = boardGame;
        this.savedBoardGame = boardGame.save();
    }

    @Override
    public void restore() {
        boardGame.load(savedBoardGame);
    }


}
