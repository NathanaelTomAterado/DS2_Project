package ds_2_project_revise;

import java.util.*;
import java.math.BigInteger;
import java.util.InputMismatchException;

public class Limiter {

    public static void ok() {
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.print("================================================================================================================================================================================================================================================================================================================================================================================");
        System.out.println("================================================================================================================================================================================================================================================================================================================================================================================");

    }

    public static void limiterMethod(BigInteger nX, BigInteger rY) {
        BigInteger maxLimit = new BigInteger("500");
        BigInteger minLimit = new BigInteger("0");

        int res_nXPostive_A = nX.compareTo(maxLimit);
        int res_nXPostive_B = maxLimit.compareTo(nX);
        int res_nXNegative_A = nX.compareTo(minLimit);
        int res_nXNegative_B = minLimit.compareTo(nX);

        int res_rYPositive_A = rY.compareTo(maxLimit);
        int res_rYPositive_B = maxLimit.compareTo(rY);
        int res_rYNegative_A = rY.compareTo(minLimit);
        int res_rYNegative_B = minLimit.compareTo(rY);

        if (res_nXPostive_A > res_nXPostive_B || res_nXNegative_A < res_nXNegative_B) {
            System.err.println("        -- INPUT IS OUT OF RANGE!--         ");
            System.exit(0);
        } else if (res_rYPositive_A > res_rYPositive_B || res_rYNegative_A < res_rYNegative_B) {
            System.err.println("        -- INPUT IS OUT OF RANGE!--      ");
            System.exit(0);
        }
    }

    public static void limiterMethod(BigInteger nX) {
        BigInteger maxLimit = new BigInteger("500");
        BigInteger minLimit = new BigInteger("0");

        int res_nXPostive_A = nX.compareTo(maxLimit);
        int res_nXPostive_B = maxLimit.compareTo(nX);
        int res_nXNegative_A = nX.compareTo(minLimit);
        int res_nXNegative_B = minLimit.compareTo(nX);
        if (res_nXPostive_A > res_nXPostive_B || res_nXNegative_A < res_nXNegative_B) {
            System.err.println("        --n INPUT IS OUT OF RANGE!--         ");
            System.exit(0);
        }

    }

    public static void LimiterNoRepetition(BigInteger nFactorial, BigInteger rFactorial) {
        int comp1 = nFactorial.compareTo(rFactorial);
        int comp2 = rFactorial.compareTo(nFactorial);
        Scanner sc = new Scanner(System.in);
        if (comp2 > comp1) {
            System.err.println("           --INVALID INPUT! n should always be higher than r--       ");
            System.err.println("              --RESTART THE CONSOLE TO REPEAT THE PROCESS --       ");
            System.exit(0);
        }
    }
    
    public static void limiterMethod_for_stirling(BigInteger nX, BigInteger rY) {
        BigInteger maxLimit = new BigInteger("500");
        BigInteger minLimit = new BigInteger("1");

        int res_nXPostive_A = nX.compareTo(maxLimit);
        int res_nXPostive_B = maxLimit.compareTo(nX);
        int res_nXNegative_A = nX.compareTo(minLimit);
        int res_nXNegative_B = minLimit.compareTo(nX);

        int res_rYPositive_A = rY.compareTo(maxLimit);
        int res_rYPositive_B = maxLimit.compareTo(rY);
        int res_rYNegative_A = rY.compareTo(minLimit);
        int res_rYNegative_B = minLimit.compareTo(rY);

        if (res_nXPostive_A > res_nXPostive_B || res_nXNegative_A < res_nXNegative_B) {
            System.err.println("        -- INPUT IS OUT OF RANGE!--         ");
            System.exit(0);
        } else if (res_rYPositive_A > res_rYPositive_B || res_rYNegative_A < res_rYNegative_B) {
            System.err.println("        -- INPUT IS OUT OF RANGE!--      ");
            System.exit(0);
        }
    }

}
