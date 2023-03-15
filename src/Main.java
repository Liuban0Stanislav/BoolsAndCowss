public class Main {
    public static void main (String[] args) throws Exception {
        PlayerActions paMan = new PlayerActions();
        PlayerActions paPC = new PlayerActions();

        paMan.setPlayerNumber(10000);
        System.out.println(paMan.getPlayerNumber());
    }
}
