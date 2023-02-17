package excercises;

public class Account {
    public int account_Number ;
    public String account_type;
    public int balance ;


    public Account(){   // Creating Account constructor
        this.account_Number = 12;
        this.account_type  ="Savings";
        this.balance = 130392 ;
    }


    public Account(int account_Number, String account_type, int balance){
        this.account_Number = account_Number;
        this.account_type = account_type;
        this.balance = balance;
    }
}


