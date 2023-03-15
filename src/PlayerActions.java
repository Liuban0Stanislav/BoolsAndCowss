import java.util.Random;

public class PlayerActions {
    Player player = new Player();

    public static int randomNum(int limit){
        Random rand = new Random();
        return rand.nextInt(limit);
    }

    public void setPlayerNumber(int playerNumber) throws Exception {
        if (playerNumber < 1000 && playerNumber >= 10_000){
            throw new Exception("введенное число должно быть 4-х значным");
        }
//        if (playerNumber >= 10_000){
//            throw new Exception("введенное число должно быть 4-х значным");
//        }
//        if (playerNumber < 1000){
//            throw new Exception("введенное число должно быть 4-х значным");
//        }
        player.setPlayerNum(playerNumber);
    }

    public void setPlayerNumber(){
        player.setPlayerNum(randomNum(9000)+1000);
    }

    public int getPlayerNumber(){
        return player.getPlayerNum();
    }
}
