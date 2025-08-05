package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        data.value = 5;
        System.out.println(data.value);
        data.value = 6;
        System.out.println(data.value);
    }
}
