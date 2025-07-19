public class CheckingAccount implements BankAccount,InterestBearing{
    String accountNumber;
    double balance;

    public CheckingAccount(String accountNumber,double initialBalance){
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
    }
}