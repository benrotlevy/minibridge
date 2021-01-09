
/**
 * MiniBridge game.
 *
 * @author (Benjamin Rotlevy)
 * @version (1.0)
 */
public class MiniBridge {
    
    private Player[] _players;
    private int _noOfPlayers;
    private final int MAX_PLAYERS = 52;
    /**
     * Constructor for objects of class MiniBridge
     */
    public MiniBridge() {
        _players = new Player[MAX_PLAYERS];
        _noOfPlayers = 0;
    }

    public void addPlayer(String name) {
        _players[_noOfPlayers] = new Player(name);
        _noOfPlayers++;
    }
    
    public String toString() {
        if(_noOfPlayers == 0) {
            return "there is no players";
        }
        String list = _players[0].toString();   
        for(int i = 1; i < _noOfPlayers; i++) {
            list += "\n" + _players[i].toString();
        }
        return list;
    }
    
    public int getNoOfPlayers() {
        return _noOfPlayers;
    }
    
    public Player getPlayer(int index) {
        Player newPlayer = new Player(_players[index].getName());
        int score = _players[index].getScore();
        newPlayer.addScore(score);
        int lastScore = _players[index].getLastScore();
        newPlayer.setLastScore(lastScore);
        return newPlayer;
    }
    
    public void addScore(int index, int score) {
        _players[index].addScore(score);
    }
    
    public void deleteScore(int index) {
        _players[index].deleteScore();
    }
    
}
