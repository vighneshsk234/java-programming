public class WrapperMethodsExample {

    public static void main(String[] args) {

        // 1. parseInt()
        String str = "100";
        int num = Integer.parseInt(str);
        System.out.println("parseInt(): " + num);

        // 2. valueOf()
        Integer obj = Integer.valueOf("200");
        System.out.println("valueOf(): " + obj);

        // 3. toString()
        String text = Integer.toString(300);
        System.out.println("toString(): " + text);

        // 4. max()
        System.out.println("max(): " + Integer.max(15, 30));

        // 5. min()
        System.out.println("min(): " + Integer.min(15, 30));

        // 6. sum()
        System.out.println("sum(): " + Integer.sum(20, 25));

        // 7. compare()
        System.out.println("compare(10,20): " + Integer.compare(10, 20));
        System.out.println("compare(20,10): " + Integer.compare(20, 10));
        System.out.println("compare(10,10): " + Integer.compare(10, 10));

        // 8. doubleValue()
        Integer number = 50;
        System.out.println("doubleValue(): " + number.doubleValue());

        // 9. intValue()
        Double decimal = 45.89;
        System.out.println("intValue(): " + decimal.intValue());

        // 10. byteValue()
        System.out.println("byteValue(): " + number.byteValue());

        // 11. floatValue()
        System.out.println("floatValue(): " + number.floatValue());

        // 12. longValue()
        System.out.println("longValue(): " + number.longValue());

        // 13. booleanValue()
        Boolean flag = Boolean.TRUE;
        System.out.println("booleanValue(): " + flag.booleanValue());

        // 14. charValue()
        Character ch = 'A';
        System.out.println("charValue(): " + ch.charValue());
    }
}