import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int numberAccount;
        String agency;
        String clientName;
        Double balance;

        System.out.println("Please enter the account number: ");
        numberAccount = scanner.nextInt();
        System.out.println("Please enter the agency number: ");
        agency = scanner.next();
        System.out.println("Please enter the client name: ");
        clientName = scanner.nextLine();
        clientName = scanner.nextLine();
        System.out.println("Please enter the balance: ");
        balance = scanner.nextDouble();

        account.setNumber(numberAccount);
        account.setAgency(agency);
        account.setClientName(clientName);
        account.setBalance(balance);

        System.out.println(account.toString());
    }
}