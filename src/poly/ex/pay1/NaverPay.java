package poly.ex.pay1;

public class NaverPay implements Pay {

    @Override
    public boolean pay(int amount){
        System.out.println("sync to naverpay");
        System.out.println(amount + " try pay");
        return true;
    }
}
