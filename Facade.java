
public class Facade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecurityCodeCheck securityCodeCheck;
    FundsCheck fundsCheck;

    Welcome welcome;

    public Facade(int newaccountNum, int newSecurcode){
        accountNumber = newaccountNum;
        securityCode = newSecurcode;

        welcome = new Welcome();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();

        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber(){ return accountNumber; }
    public int getSecurityCode(){ return  securityCode; }

    public void withdrawlCash(double cashWithdrawl){
        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)
                && fundsCheck.haveEnoughMoney(cashWithdrawl)){
            System.out.println("Transaction Complete \n");
        }else {
            System.out.println("Transaction Fail! \n");
        }
    }

    public void depositCash(double cashDeposit){
        if(accountNumberCheck.accountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)){

            fundsCheck.makeDeposite(cashDeposit);
            System.out.println("Transaction Complete \n");
        }else {
            System.out.println("Transaction Fail! \n");
        }

    }


}
