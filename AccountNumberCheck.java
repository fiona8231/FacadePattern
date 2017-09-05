
public class AccountNumberCheck {
    private int accountNumber = 123456;

    public int getAccountNumber(){ return accountNumber;}

    public boolean accountActive(int NumToCheck){
        if(accountNumber == NumToCheck)
        { return true;} else {
            return false;
        }
    }
}
