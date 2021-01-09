import java.util.Scanner;
/**
 * GameTable of mini bridge.
 *
 * @author (Benjamin Rotlevy)
 * @version (1.0)
 */
public class GameTable {

    private static Scanner scan = new Scanner(System.in);
    private static int rounds = 0;

    public static void startGame(MiniBridge game) {
        System.out.println("Start of game" + "\n" + "\n" + "Please enter player's name");
        String name = scan.next();

        while(!name.equals("continue")) {
            game.addPlayer(name);
            System.out.println("Please enter player's name or enter continue");
            name = scan.next();
        }
        System.out.println("\nGame started\n");
        System.out.println(game);
    }

    public static void addScoreToPlayers(MiniBridge game) {
        System.out.println("\nStart of round number " + (rounds + 1));
        for(int i = 0; i < game.getNoOfPlayers(); i++) {
            System.out.println("add score to: " + game.getPlayer(i).getName());
            int score = scan.nextInt();
            game.addScore(i, score);
            
        }
        System.out.println("\n" + game);
    }
    
    public static void backToLastScore(MiniBridge game) {
        for(int i = 0; i < game.getNoOfPlayers(); i++) {
            game.deleteScore(i);
        }
        System.out.println("\n" + game);
    }

    public static void main(String[] args) {
        MiniBridge game = new MiniBridge();
        startGame(game);
        
        int maxRounds = 52 / game.getNoOfPlayers();
        
        while(rounds < maxRounds) {
            addScoreToPlayers(game);
            System.out.println("enter 1 to reset score or 0 to continue");
            int num = scan.nextInt();
            while(num == 1){
                backToLastScore(game);
                addScoreToPlayers(game);
                System.out.println("enter 1 to reset score or 0 to continue");
                num = scan.nextInt();
            }
            rounds++;
            System.out.println("end of round number " + rounds);
        }
    }
}
