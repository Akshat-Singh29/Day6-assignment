public class Batsman {
    String playerName;
    int runs;
    int balls;
    int strikeRate;

    public Batsman(String playerName, int runs, int balls) {
        this.playerName = playerName;
        this.runs = runs;
        this.balls = balls;
        this.strikeRate = (runs * 100) / balls;
    }

    public void display() {
        System.out.println("Strike Rate = " + strikeRate);
    }

    public static void main(String[] args) {
        Batsman batsman = new Batsman("Gill", 75, 50);
        batsman.display();
    }
}
