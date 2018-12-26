import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
        BigDecimal b1 = new BigDecimal("4.015");
        BigDecimal b2 = new BigDecimal("100");
        System.out.println(b1.multiply(b2));



    }
}
