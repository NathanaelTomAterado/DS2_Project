/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_2_project_revise;

import java.math.BigInteger;
import java.text.NumberFormat;

/**
 *
 * @author mcshop
 */
public class combination_With_Repetition extends factorial {

    public static void combination_Repetition_method(BigInteger num_X, BigInteger num_Y, BigInteger num_nFact, BigInteger num_rFact) {
        NumberFormat myFormat = NumberFormat.getInstance();
        myFormat.setGroupingUsed(true);
        BigInteger numerator = BigInteger.ZERO;
        BigInteger denaminator = BigInteger.ZERO;
        BigInteger combination = BigInteger.ZERO;

        numerator = num_X.add(num_Y);
        numerator = numerator.subtract(BigInteger.ONE);
        numerator = factorialMethod(numerator);

        denaminator = num_X.subtract(BigInteger.ONE);
        denaminator = factorialMethod(denaminator);
        denaminator = denaminator.multiply(num_rFact);

        combination = numerator.divide(denaminator);

        System.out.println(num_X + "C" + num_Y + " = " + myFormat.format(combination) + " Combination ways");

    }

}
