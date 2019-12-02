package ds_2_project_revise;

import java.math.BigInteger;

public class permutation_With_Repetition {

    public static BigInteger permutation_Repetition_method(BigInteger exponent, BigInteger num_X) {
        BigInteger fact = new BigInteger("1");
        for (BigInteger i = BigInteger.ONE; i.compareTo(exponent) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(num_X);
        }
        return fact;

    }
}
