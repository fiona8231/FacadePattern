
public class Testing {
    public static void main(String[] args){

        Facade bank1 = new Facade(123456, 123);
        bank1.withdrawlCash(500.00);
        bank1.withdrawlCash(800.00);
        bank1.depositCash(100.00);


    }
}
