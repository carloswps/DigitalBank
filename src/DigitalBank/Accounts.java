package DigitalBank;

public abstract class Accounts implements iAccount {
    protected int agency;
    protected int numberAgency;
    protected double balance;

    @Override
    public void deposit(double balance) {
        
    }
    @Override
    public void transfer(double balance, Accounts destination) {
        
    }
    @Override
    public void withdraw(double balance) {
        
    }

    public int getAgency() {
        return agency;
    }
    public int getNumberAgency() {
        return numberAgency;
    }
    public double getBalance() {
        return balance;
    }

    public void withdraw(){

    }
    public void deposit(){

    }
    public void transfer(){
        
    }
}
