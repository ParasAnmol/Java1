import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = factorial(n);
        System.out.println(m);
    }

    public static int factorial(int n){
        if(n >= 2){
            n = n * factorial(n-1);
        }
        return n;
    }

}