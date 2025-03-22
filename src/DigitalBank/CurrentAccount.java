package DigitalBank;

public class CurrentAccount extends Accounts {
    @Override
    public void printExtract() {
        System.out.println("Extrato conta corrente ");
        super.extracted();
    }
}
