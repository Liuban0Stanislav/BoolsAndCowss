import java.util.Random;

public class PlayerActions {
    Player player = new Player();


    boolean isNumbersUniq(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length && i != j; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
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

    public int[] getPlayerArray() {
        return player.getPayerArr();
    }

    public static int randomNum(int limit) {
        Random rand = new Random();
        return rand.nextInt(limit);
    }
}
