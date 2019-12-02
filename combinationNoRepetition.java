package ds_2_project_revise;

import java.math.BigInteger;
import java.text.NumberFormat;


public class combinationNoRepetition extends factorial {

    public static BigInteger combinationMethod(BigInteger num_X, BigInteger num_Y, BigInteger num_nFact, BigInteger num_rFact) {
        NumberFormat myFormat = NumberFormat.getInstance();
        
        myFormat.setGroupingUsed(true);
        
        BigInteger denaminator = BigInteger.ZERO;

        denaminator = num_X.subtract(num_Y);

        denaminator = factorialMethod(denaminator);

        denaminator = denaminator.multiply(num_rFact);

        BigInteger combination = new BigInteger("0");

        combination = num_nFact.divide(denaminator);

        System.out.println(num_X + "C" + num_Y + " = " + myFormat.format(combination) + " Combination ways");
        
        return combination;
    }
    
}
