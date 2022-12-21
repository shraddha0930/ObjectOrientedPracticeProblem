package day11and12Practiceproblem;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account ac  =new Account();
        ac.withdraw();

    }
}

class Account {
    Scanner scanner  = new Scanner(System.in);
    // method for withdraw amount and to check to total balance
    public int withdraw() {
        System.out.println("Account balance");
        int availableBalance = scanner.nextInt();


        System.out.println("Enter Amount to withdraw");
        int withdrawAmount = scanner.nextInt();

        if (availableBalance >= withdrawAmount) {
            availableBalance -= withdrawAmount;
            System.out.println("Total Balance is:" + availableBalance);
            return withdrawAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }

        return availableBalance;
    }
}
