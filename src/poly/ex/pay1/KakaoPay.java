package poly.ex.pay1;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount){
        System.out.println("sync to kakaopay");
        System.out.println(amount + " try pay");
        return true;
    }
}
