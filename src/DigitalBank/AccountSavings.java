package DigitalBank;

public class AccountSavings extends Accounts {
    @Override
    public void printExtract() {
        System.out.println("Extrato conta polpança ");
        super.extracted();
    }
}

