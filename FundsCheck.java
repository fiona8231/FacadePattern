
public class FundsCheck {
    // Initially, we got 1000 in account
    private double cashInAccount = 1000.00;

    public double getCashInAccount(){ return cashInAccount; }

    public void withdrawlCashInAccount(double chashWithdrawl){
        cashInAccount -= chashWithdrawl;
    }

    public void depositeCashInAccount(double cashDeposite){
        cashInAccount += cashDeposite;
    }

    public boolean haveEnoughMoney(double newCash ){
        if (newCash > getCashInAccount()){
            System.out.println("You do not have enough money");
            System.out.println("Current Balance: " + getCashInAccount());
            return false;
        }else {
            withdrawlCashInAccount(newCash);
            System.out.println("Withdrawal Completed: Current Balance: " + getCashInAccount());
            return true;
        }
    }

    public void makeDeposite(double newCash){
        depositeCashInAccount(newCash);
        System.out.println("Deposit Completed: Current Balance: " + getCashInAccount());
    }


}
