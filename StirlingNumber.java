
package ds_2_project_revise;

import java.math.BigInteger;
import java.text.NumberFormat;

public class StirlingNumber extends factorial {

    public static void Stirling(int n, int j) {
        NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);

        BigInteger process_1 = BigInteger.valueOf(-1); 
        BigInteger process_1b = BigInteger.valueOf(-1); 

        BigInteger proess_2 = BigInteger.ZERO; 
        BigInteger proess_2b = BigInteger.ZERO; 
        BigInteger SNotSC = BigInteger.ZERO; 

        for (int x = 0; x < j; x++) {
            process_1 = (process_1).multiply(process_1b);
            BigInteger comb1 = factorialInt(j).divide(factorialInt(x).multiply(factorialInt(j - x)));
            proess_2 = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
            proess_2b = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
            for (int z = 1; z < n; z++) {
                proess_2 = proess_2.multiply(proess_2b);
            }
            SNotSC = SNotSC.add((process_1).multiply(comb1).multiply(proess_2));
        }
        SNotSC = SNotSC.divide(factorialInt(j));
        System.out.println("The Stirling number of " + "S(" + n + "," + j + ")" + " is = " + myFormat.format(SNotSC));
    }
}
