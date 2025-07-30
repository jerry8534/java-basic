package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = createOrder("tofu", 2000, 2);
        orders[0] = order1;

        ProductOrder order2 = createOrder("kimchi", 5000, 1);
        orders[1] = order2;

        ProductOrder order3 = createOrder("cola", 1500, 2);
        orders[2] = order3;

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("Total amount : " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("name : " + order.productName + ", price : " + order.price + ", quantity : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
