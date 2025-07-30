package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("a = " + dataA.value);
        changeReference(dataA);
        System.out.println("a = " + dataA.value);
    }

    public static void changeReference(Data dataA) {
        dataA.value = 20;
    }
}
