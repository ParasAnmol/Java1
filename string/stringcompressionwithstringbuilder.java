import java.io.*;
import java.util.*;

public class Main {

	public static StringBuilder compression1(String str){
		String ne = "" + str.charAt(0);
		StringBuilder res = new StringBuilder(ne);
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) !=  str.charAt(i-1)){
				res.append(str.charAt(i));
			}
		}

		return res;
	}

	public static StringBuilder compression2(String str){
		String ne = "" + str.charAt(0);
		StringBuilder res = new StringBuilder(ne);
		int count = 1;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) !=  str.charAt(i-1)){
				if(count != 1){
					res.append(count);
				}
				res.append(str.charAt(i));
				count = 0;
			}
			count++;
		}
		if(count != 1){
			res.append(count);
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}