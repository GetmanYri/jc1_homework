package part6.task26;

public class Banknotes {
    public static final int TWENTY = 20;
    public static final int FIFTY = 50;
    public static final int ONE_HUNDRED = 100;

    int numberOfTwenty;
    int numberOfFifty;
    int numberOfHundred;

    @Override
    public String toString() {
        return "Banknotes in ATM {" +
                "numberOfTwenty=" + numberOfTwenty +
                ", numberOfFifty=" + numberOfFifty +
                ", numberOfHundred=" + numberOfHundred +
                '}';
    }

    public Banknotes(int numberOfTwenty, int numberOfFifty, int numberOfHundred) {
        this.numberOfTwenty = numberOfTwenty;
        this.numberOfFifty = numberOfFifty;
        this.numberOfHundred = numberOfHundred;
    }



}
