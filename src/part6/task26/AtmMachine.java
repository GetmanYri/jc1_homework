package part6.task26;

import java.util.Scanner;

public class AtmMachine {

    public int getSumInAtm() {
        return sumInAtm;
    }
    private int sumInAtm;
    private final int PASSWORD=123456;
    Scanner atm = new Scanner(System.in);
    Banknotes banknotes = new Banknotes(0, 0, 0);

    public void addBanknotes() {
        System.out.println(banknotes.toString());
        System.out.println("Hello!!! Add banknotes in the ATM!");
        System.out.println("How many twenties?");
        banknotes.numberOfTwenty += atm.nextInt();
        System.out.println("How many fifties?");
        banknotes.numberOfFifty += atm.nextInt();
        System.out.println("How many hundreds?");
        banknotes.numberOfHundred += atm.nextInt();
        setSumInAtm();
        System.out.println(banknotes.toString());
        System.out.println("Sum in ATM = " + sumInAtm);
    }

    public boolean withdrawMoney() {
        int sum = atm.nextInt();
        boolean luck = false;
        int count;
        if (sum <= sumInAtm) {

            int numOfHundred = Math.min(sum / Banknotes.ONE_HUNDRED, banknotes.numberOfHundred);
            count = sum - numOfHundred * Banknotes.ONE_HUNDRED;
            int numOfFifty = Math.min(count / Banknotes.FIFTY, banknotes.numberOfFifty);
            count -= numOfFifty * Banknotes.FIFTY;
            int numOfTwenty = Math.min(count / Banknotes.TWENTY, banknotes.numberOfTwenty);
            count -= numOfTwenty * Banknotes.TWENTY;

            if (count == 0) {
                banknotes.numberOfTwenty -= numOfTwenty;
                banknotes.numberOfFifty -= numOfFifty;
                banknotes.numberOfHundred -= numOfHundred;
                setSumInAtm();
                System.out.println("Take the money, please");
                System.out.println("Number of hundred = " + numOfHundred + " pcs.");
                System.out.println("Number of fifty = " + numOfFifty + " pcs.");
                System.out.println("Number of twenty = " + numOfTwenty + " pcs.");
                luck = true;
                System.out.println(banknotes.toString());
                System.out.println("Sum in the ATM = " + sumInAtm);

            } else {
                System.out.println("Error sum, try again");

            }

        } else {
            System.out.println("There is no such amount of money in the ATM");
            System.out.println("Sum in the ATM = " + sumInAtm);
            System.out.println(banknotes.toString());
        }
        System.out.println(luck);
        return luck;
    }
    public int getPassword() {
        return PASSWORD;
    }
    public void setSumInAtm() {
        sumInAtm = banknotes.numberOfFifty * Banknotes.FIFTY +
                banknotes.numberOfTwenty * Banknotes.TWENTY + banknotes.numberOfHundred * Banknotes.ONE_HUNDRED;
    }
}
