package poly.ex.pay1;

public class NewPay implements Pay {

    @Override
    public boolean pay(int amount){
        System.out.println("sync to newpay");
        System.out.println(amount + " try pay");
        return true;
    }
}
