package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("a = " + dataA);
        System.out.println("b = " + dataB);
        System.out.println("a value = " + dataA.value);
        System.out.println("b value = " + dataB.value);

        dataA.value = 20;
        System.out.println("a = " + dataA.value);
        System.out.println("b = " + dataB.value);

        dataB.value = 30;
        System.out.println("a = " + dataA.value);
        System.out.println("b = " + dataB.value);
    }
}
