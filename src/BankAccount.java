public class BankAccount {
    private int balance;
    public void deposit(double amount){
        if (amount>0){
            balance +=amount;
            System.out.println("Deposit" +" "+ amount +" "+"successfull");
        }
        else{
            System.out.println("Deposit unsuccessfull");
        }

    }
    public void withdraw(double amount){
       if( amount>0 && balance>=amount){
        balance-=amount;
        System.out.println("withdraw"+" "+amount+" "+"successfull");
       }
       else{
        System.out.println("withdraw"+" "+amount+" "+"successfull");
       }
    }
    public int check_balance(){
        return balance;
    }
    public static void main(String[] args){
        BankAccount obj=new BankAccount();
        obj.deposit(200.00);
        obj.withdraw(100.0);
        obj.check_balance();
    }
}
