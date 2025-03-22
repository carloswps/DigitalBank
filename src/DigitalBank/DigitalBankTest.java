package DigitalBank;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Accounts current = new CurrentAccount();
        Accounts savings = new AccountSavings();

        while (true) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Transferir");
            System.out.println("4- Sair");

            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("Saindo...");
                scanner.close();
                return;
            }

            System.out.println("Escolha uma conta para deposito: ");
            System.out.println("1- Conta Corrente");
            System.out.println("2- Conta Polpança");
            int accountOption = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Digite um valor para Deposito: ");
                    double depositAccount = scanner.nextDouble();

                    if (accountOption == 1) {
                        current.deposit(depositAccount);
                        current.printExtract();
                    } else if (accountOption == 2) {
                        savings.deposit(depositAccount);
                        savings.printExtract();
                    } else {
                        System.out.println("Opção de conta invalida");
                    }
                    break;

                case 2:
                    System.out.println("Digite um valor para saque: ");
                    double withdrawAccount = scanner.nextDouble();

                    if (accountOption == 1) {
                        current.withdraw(withdrawAccount);
                        current.printExtract();
                    } else if (accountOption == 2) {
                        savings.deposit(withdrawAccount);
                        savings.printExtract();
                    } else {
                        System.out.println("Opção de conta invalida");
                    }
                    break;

                case 3:
                    System.out.println("Digite um valor para transferência: ");
                    double transferAccount = scanner.nextDouble();

                    if (accountOption == 1) {
                        current.transfer(transferAccount, current);
                        current.printExtract();
                    } else if (accountOption == 2) {
                        savings.transfer(transferAccount, savings);
                        savings.printExtract();
                    } else {
                        System.out.println("Opção de conta invalida");
                    }
                    break;
            }
        }
    }
}
