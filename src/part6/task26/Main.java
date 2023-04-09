package part6.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean start = true;
        boolean luck = true;
        int command;
        Scanner user = new Scanner(System.in);
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.addBanknotes();

        while (start) {
            if (atmMachine.getSumInAtm() < 20) {
                System.out.println("no money in the ATM!!!");
                start = false;
                continue;
            }

            System.out.println("To get started, please press - 1");
            command = user.nextInt();
            if (command == 1) {
                do {
                    System.out.println("Please, enter the withdrawal amount.");
                    luck = atmMachine.withdrawMoney();
                } while (!luck);
            } else if (command == atmMachine.getPassword()) {
                atmMachine.addBanknotes();
            } else {
                System.out.println("Error! Try again.");
            }
        }
    }
}
