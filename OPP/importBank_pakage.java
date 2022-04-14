package OPP;

import BankPakage.*;

public class importBank_pakage {
    public static void main(String[] args) {
        bank mydetail = new bank();
      //  BankPakage.bank mybank = new BankPakage.bank();
        Account myaccount = new Account();
        myaccount.setName("Mezan");
        System.out.println(myaccount.getName());
        mydetail.setBankName("HBL");
        System.out.println(mydetail.getBankName());
    }
}
