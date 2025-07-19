public class Main {
    public static void main(String[] args){
        CheckingAccount mychecking=new CheckingAccount("123-4567890",10000);
        mychecking.displayAccountInfo();
        mychecking.withdraw(1000);
    }
}
