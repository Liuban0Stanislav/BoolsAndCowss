import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws Exception {
        /**
         * создаем игроков
         */
        PlayerActions paMan = new PlayerActions();
        PlayerActions paPC = new PlayerActions();
        /**
         * игроки загадывают число
         */
        paMan.setPlayerNumber(9361);
        paPC.setPlayerNumber();

        System.out.println(paMan.getPlayerNumber());
        System.out.println(Arrays.toString(paMan.numToArr(paMan.getPlayerNumber())));

        System.out.println(paPC.getPlayerNumber());
        System.out.println(Arrays.toString(paPC.numToArr(paPC.getPlayerNumber())));

        System.out.println("paMan.isNumbersUniq(paMan.getPlayerArray()) = " + paMan.isNumbersUniq(paMan.getPlayerArray()));
    }
}
