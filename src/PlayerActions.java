import java.util.Random;

public class PlayerActions {
    Player player = new Player();

    public static int randomNum(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }

    public int[] numToArr(int num) {
        int[] arr = new int[4];
        arr[0] = num / 1000;
        arr[1] = num / 100 % 10;
        arr[2] = num / 10 % 10;
        arr[3] = num % 10;
        return player.setPayerArr(arr);
    }

    public void setPlayerNumber(int playerNumber) throws Exception {
        if (playerNumber < 1000 || playerNumber >= 10_000) {
            throw new Exception("введенное число должно быть 4-х значным");
        }
        player.setPlayerNum(playerNumber);
    }

    public void setPlayerNumber() {
        player.setPlayerNum(randomNum(9000) + 1000);
    }

    public int getPlayerNumber() {
        return player.getPlayerNum();
    }
}
