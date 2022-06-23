package src.task3;

public class MyClass {
    String s = "HELLO";
    Integer intV = 5;

    public void answer(int value) {
        MyFuncInterface<String> strValue;
        MyFuncInterface<Integer> intValue;
        strValue = () -> new StringBuilder(s).reverse().toString();
        intValue = () -> {
            int result = 1;
            for (int i = 1; i <= intV; i++) {
                result = i * result;
            }
            return result;
        };
        switch (value) {
            case 1 -> System.out.println(strValue.getValue());
            case 2 -> System.out.println(intValue.getValue());
            default -> System.out.println("Wrong value! Enter 1 || 2");
        }
    }
}
