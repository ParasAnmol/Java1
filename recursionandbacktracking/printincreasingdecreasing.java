import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        System.out.println(n);
        if(n > 1){
            pdi(n-1);
        }
        System.out.println(n);
    }

}