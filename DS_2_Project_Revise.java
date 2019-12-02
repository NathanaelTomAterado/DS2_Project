package ds_2_project_revise;
//__________________________________________________________________________________________________________

import java.util.Scanner;
import java.math.BigInteger;
import java.text.NumberFormat;
//__________________________________________________________________________________________________________

public class DS_2_Project_Revise {

    public static void main(String[] args) {
        boolean process = true;
        while (process == true) {
//__________________________________________________________________________________________________________
            Scanner sc = new Scanner(System.in);
//__________________________________________________________________________________________________________        
            factorial myFactorial = new factorial();
            permutationNoRepetition myPermutation = new permutationNoRepetition();
            combinationNoRepetition myCombination = new combinationNoRepetition();
            permutation_With_Repetition myPermutation_Repetition = new permutation_With_Repetition();
            combination_With_Repetition myCombination_Repetition = new combination_With_Repetition();
            Limiter limit = new Limiter();
            PascalRowGenerator row = new PascalRowGenerator();
            StirlingNumber StirlingMethod = new StirlingNumber();
//__________________________________________________________________________________________________________
            System.out.println("||==========================================================================================================================||");
            System.out.println("||      a = Permutation and Combination WITHOUT Repetition      "
                    + "b = Permutation and Combination WITH Repetition             ||\n"
                    + "||      c = Stirling Number of the Second Case                  "
                    + "d = Pascal Triangle Row Generator                           ||\n"
                    + "||                                                              e = Factorial                                               ||");
            System.out.println("||==========================================================================================================================||");

            System.out.print("    Please choose an Operation:");
            char opt = sc.next().charAt(0);
//__________________________________________________________________________________________________________
            switch (opt) {

                case 'a':
                case 'A':
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("|                                          --|PROGRAM MAY ONLY ACCEPT 0 - 500|--                               |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");

                    System.out.print("Enter the n value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    int number_x = sc.nextInt();
                    BigInteger nFactorial = factorial.factorialMethod(BigInteger.valueOf(number_x));
                    System.out.print("Enter the r value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    int number_y = sc.nextInt();
                    BigInteger rFactorial = factorial.factorialMethod(BigInteger.valueOf(number_y));

                    Limiter.limiterMethod(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y));
                    Limiter.LimiterNoRepetition(nFactorial, rFactorial);
                    System.out.println("||==========================================================================================================================||");
                    System.out.print("||                  a = Permutation Without repetition        "
                            + "b = Combination Without repetition                            ||\n");
                    System.out.println("||==========================================================================================================================||");

                    System.out.print("Please choose an operation: ");
                    opt = sc.next().charAt(0);
                    switch (opt) {
                        case 'a':
                        case 'A':
                            permutationNoRepetition.permutationMethod(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y), nFactorial);
                            break;
                        case 'b':
                        case 'B':
                            combinationNoRepetition.combinationMethod(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y), nFactorial, rFactorial);
                            break;
                        default:
                            System.out.println("        --INVALID INPUT!--      ");
                    }
                    break;
//______________________________________________________________________________________________________________________
                case 'b':
                case 'B':
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("|                                          --|PROGRAM MAY ONLY ACCEPT 0 - 500|--                               |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");

                    System.out.print("Enter the n value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    number_x = sc.nextInt();
                    nFactorial = factorial.factorialMethod(BigInteger.valueOf(number_x));

                    System.out.print("Enter the r value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    number_y = sc.nextInt();
                    rFactorial = factorial.factorialMethod(BigInteger.valueOf(number_y));

                    Limiter.limiterMethod(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y));
                    System.out.println("||==========================================================================================================================||");
                    System.out.print("||                                   a = Permutation With repetition      "
                            + "b = Combination With repetition                   ||\n"
                            + "||==========================================================================================================================||\n"
                            + "     Please choose an Operation:");
                    opt = sc.next().charAt(0);
                    switch (opt) {
                        case 'a':
                        case 'A':
                            Limiter.LimiterNoRepetition(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y));
                            NumberFormat myFormat = NumberFormat.getInstance();
                            myFormat.setGroupingUsed(true);
                            BigInteger answer = new BigInteger("0");
                            answer = permutation_With_Repetition.permutation_Repetition_method(BigInteger.valueOf(number_y), BigInteger.valueOf(number_x));
                            System.out.println(number_x + "P" + number_y + " = " + myFormat.format(answer) + " Permutation ways");
                            break;
                        case 'b':
                        case 'B':
                            combination_With_Repetition.combination_Repetition_method(BigInteger.valueOf(number_x), BigInteger.valueOf(number_y), nFactorial, rFactorial);
                            break;
                        default:
                            System.out.println("        --INVALID INPUT!--      ");
                    }
                    break;
//______________________________________________________________________________________________________________________

                case 'c':
                case 'C':
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("|                                          --|PROGRAM MAY ONLY ACCEPT 1 - 500|--                               |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");

                    System.out.print("Enter the n value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    int number_a = sc.nextInt();
                    System.out.print("Enter the j value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    int number_b = sc.nextInt();
                    Limiter.limiterMethod_for_stirling(BigInteger.valueOf(number_a), BigInteger.valueOf(number_b));
                    Limiter.LimiterNoRepetition(BigInteger.valueOf(number_a), BigInteger.valueOf(number_b));
                    StirlingNumber.Stirling(number_a, number_b);
                    break;

                case 'd':
                case 'D':
                    System.out.println("----------------------------------------------------------------------------------------------------------------");
                    System.out.println("|                                          --|PROGRAM MAY ONLY ACCEPT 0 - 500|--                               |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------");

                    System.out.print("Enter the n value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    number_x = sc.nextInt();
                    Limiter.limiterMethod(BigInteger.valueOf(number_x));
                    nFactorial = factorial.factorialMethod(BigInteger.valueOf(number_x));
                    PascalRowGenerator.combinationMethod(BigInteger.valueOf(number_x), nFactorial);
                    break;
                case 'e':
                case 'E':
                    System.out.print("Enter the n value: ");
                    while (!sc.hasNextInt()) {
                        sc.next();
                        System.err.print("INVALID INPUT MAY ONLY ACCEPT POSITIVE INTEGER. TRY AGAIN: ");
                    }
                    int nFact = sc.nextInt();
                    Limiter.limiterMethod(BigInteger.valueOf(nFact));
                    NumberFormat myFormat = NumberFormat.getInstance();
                    myFormat.setGroupingUsed(true);
                    System.out.println(nFact + "! = " + myFormat.format(factorial.factorialMethod(BigInteger.valueOf(nFact))));
                    break;
                default:
                    System.err.println("        --INVALID INPUT!--      ");
            }
            System.out.print("\nDo you want to repeat the operation? [Y/N]: ");
            char repeat = sc.next().charAt(0);
            if (repeat == 'n' || repeat == 'N') {
                System.out.println("RUN TERMINATED...");
                process = false;
                Limiter.ok();
            } else if (repeat == 'y' || repeat == 'Y') {
                process = true;
                Limiter.ok();
            } else {
                System.err.println("        --INVALID INPUT!--      ");
                System.exit(0);
            }
        }
//__________________________________________________________________________________________________________________________________________________________________________________________
    }
}
