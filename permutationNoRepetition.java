package ds_2_project_revise;

import java.math.BigInteger;
import java.text.NumberFormat;

public class permutationNoRepetition extends factorial {

    public static void permutationMethod(BigInteger num_A, BigInteger num_B, BigInteger num_C) {
        NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);
        
        BigInteger n_rPnR = BigInteger.ZERO;

        n_rPnR = num_A.subtract(num_B);

        n_rPnR = factorialMethod(n_rPnR);

        BigInteger permutation = new BigInteger("0");

        permutation = num_C.divide(n_rPnR);

        System.out.println(num_A +"P"+num_B+" = "+ myFormat.format(permutation) + " Permutation ways");

    }

}
