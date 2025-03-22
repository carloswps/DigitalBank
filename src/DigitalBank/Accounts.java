package DigitalBank;

public abstract class Accounts implements iAccount {
    protected static final int Agency_STANDARD = 1;
    protected static int SEQUENCE = 1;

    protected int agency;
    protected int numberAgency;
    protected double balance;

    public Accounts() {
        this.agency = Agency_STANDARD;
        this.numberAgency = SEQUENCE++;
    }

    @Override
    public void withdraw(double value) {
        if (value > 0 && balance >= value) {
            System.out.println("Saque realizado com sucesso");
        }else if (value < 0) {
            System.out.println("Você não pode fazer saques com valores negativos");
        }else{
            System.out.println("Valor indisponivel para saque");
        }
    }

    @Override
    public void deposit(double value) {
        if (value < 0) {
            System.out.println("Você não pode fazer depositos com valores negativos");
        }else{
            System.out.println("Valor depositado com sucesso");
            balance += value;
        }
    }

    @Override
    public void transfer(double value, Accounts accountsDestination) {
        if (value > 0 && value <= balance) {
            balance = balance - value;
            accountsDestination.balance = balance + value;
        }else if (value < 0){
            System.out.println("Você não pode fazer transferências com valores negativos");
        }
    }

    protected void extracted() {
        System.out.println(String.format("Agência %d", this.agency));
        System.out.println(String.format("Numero %d", this.numberAgency));
        System.out.println(String.format("Saldo %.2f", this.balance));
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
