package ds_2_project_revise;

import java.math.BigInteger;

public class factorial {

    public static BigInteger factorialMethod(BigInteger x) {
        BigInteger fact = new BigInteger("1");
        for (BigInteger i = BigInteger.ONE; i.compareTo(x) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;

    }

    public static BigInteger factorialInt(int x) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= x; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
     return factorial;
    }
    
}

