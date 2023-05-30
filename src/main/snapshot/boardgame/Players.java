package main.snapshot.boardgame;

public class Players {

    private Player player1 = new Player();
    private Player player2 = new Player();
    private Player player3 = new Player();
    private Player player4 = new Player();

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player getPlayer3() {
        return player3;
    }

    public Player getPlayer4() {
        return player4;
    }

    public Players copy() {
        Players players = new Players();
        players.player1 = new Player();
        players.player1.position = player1.position;
        players.player2 = new Player();
        players.player2.position = player2.position;
        players.player3 = new Player();
        players.player3.position = player3.position;
        players.player4 = new Player();
        players.player4.position = player4.position;
        return players;
    }

    public static class Player {
        private int position;

        public int getPosition() {
            return position;
        }

        public void move(int steps) {
            this.position += steps;
        }
    }
}
