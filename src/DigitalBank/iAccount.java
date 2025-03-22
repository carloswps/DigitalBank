package DigitalBank;

public interface iAccount {
    void withdraw(double balance);
    void deposit(double balance);
    void transfer(double balance ,Accounts destination);
}
