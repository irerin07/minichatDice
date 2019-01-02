package my.chat.example;

public class Dice {
    private int diceNumber;
    private int result;
    public Dice(int diceNumber) {
        this.diceNumber = diceNumber;
    }


    public void roll() {
        result = (int)((Math.random() * diceNumber) + 1);
    }

    public int getResult() {
        return result;
    }
}
