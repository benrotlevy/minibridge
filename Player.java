
/**
 * Player on mini bridge
 *
 * @author (Benjamin Rotlevy)
 * @version (1.0)
 */
public class Player {
   
    private String _name;
    private int _score;
    private int _lastScore;

    /**
     * Constructor for objects of class Player
     * @param name name of player
     */
    public Player(String name) {
        _name = name;
        _score = 0;
        _lastScore = 0;
    }
    
    public String getName() {
        return this._name;
    }
    
    public int getScore() {
        return this._score;
    }
   
    public String toString() {
        return "Player name: " + _name + "\n" + "score: " + _score; 
    }
    
    public void addScore(int newScore){
        _lastScore = _score;
        _score += newScore; 
    }
    
    public int getLastScore() {
        return _lastScore;
    }
    
    public void setLastScore(int num) {
        _lastScore = num;
    }
    
    public void deleteScore() {
        _score = _lastScore;
    }
    
    public void setScore(int num) {
        _score = num;
    }
    
    
    
    
    
    
    
    
    
    
}
