package DigitalBank;

public class CurrentAccount extends Accounts {
    public static int Sequence = 0;
    public CurrentAccount(){
        super.agency = 1;
        super.numberAgency = Sequence;
    }
}
