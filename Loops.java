/*
@Agata Sakowicz
        Objective
        In this challenge, we're going to use loops to help us do some simple math.
        Task
        Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
        Print  lines of output; each line  (where ) contains the  of  in the form:
        N x i = result.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int result=0;
        int i;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (i=1; i<=10; i++){
            result = i*N;
            System.out.println(N +" x " + i + " = " +result);
        }

        scanner.close();
    }
}

