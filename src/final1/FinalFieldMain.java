package final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("Contructor init");
        ConstructInit constructInit1 = new ConstructInit(1);
        ConstructInit constructInit2 = new ConstructInit(2);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        System.out.println("Field init");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        System.out.println("const");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
