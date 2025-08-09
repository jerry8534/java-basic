package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true){
            System.out.println("pay option:");
            String payOption = sc.nextLine();
            if(payOption.equals("exit")){
                System.out.println("exit");
                return;
            }

            System.out.println("pay amount:");
            int amount = sc.nextInt();
            sc.nextLine();
            payService.processPay(payOption, amount);
        }
    }
}
