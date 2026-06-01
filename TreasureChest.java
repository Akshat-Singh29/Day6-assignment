public class TreasureChest {
    String playerName;
    int coinsCollected;
    String reward;

    public TreasureChest(String playerName, int coinsCollected) {
        this.playerName = playerName;
        this.coinsCollected = coinsCollected;
        if (coinsCollected >= 1000) {
            reward = "Diamond Sword";
        } else if (coinsCollected >= 500) {
            reward = "Gold Sword";
        } else if (coinsCollected >= 100) {
            reward = "Iron Sword";
        } else {
            reward = "Wooden Sword";
        }
    }

    public void display() {
        System.out.println("Player: " + playerName);
        System.out.println("Coins Collected: " + coinsCollected);
        System.out.println("Reward: " + reward);
    }

    public static void main(String[] args) {
        TreasureChest player = new TreasureChest("Alex", 750);
        player.display();
    }
}
