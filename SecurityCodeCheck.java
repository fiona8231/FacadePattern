
public class SecurityCodeCheck {
    private int code = 123;

    public int getCode(){return code;}

    public boolean isCodeCorrect(int codeToCheck){
        if(code == codeToCheck){
            return true;
        }else{
            return false;
        }

    }

}
