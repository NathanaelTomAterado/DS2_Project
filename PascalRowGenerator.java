package ds_2_project_revise;

import java.math.BigInteger;
import java.text.NumberFormat;

public class PascalRowGenerator extends combinationNoRepetition {

    public static BigInteger combinationMethod(BigInteger num_X, BigInteger num_nFact) {
        BigInteger combination = new BigInteger("0");

        for (BigInteger i = new BigInteger("0"); i.compareTo(num_X) <= 0; i = i.add(BigInteger.ONE)) {

            NumberFormat myFormat = NumberFormat.getInstance();

            myFormat.setGroupingUsed(true);

            BigInteger denaminator = BigInteger.ZERO;

            denaminator = num_X.subtract(i);

            denaminator = factorialMethod(denaminator);

            denaminator = denaminator.multiply(factorialMethod(i));

            combination = num_nFact.divide(denaminator);
            ;
            System.out.print("|"+myFormat.format(combination) + "| ");
            
        }
        return combination;
    }
}
