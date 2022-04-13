import java.io.*;
import java.util.*;

public class Main {

	public static boolean palin(String s){
		int i = 0,j = s.length()-1;

		while(i < j){
			int m = s.charAt(i);
			int n = s.charAt(j);
			if(m == n){
				i++;
				j--;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public static void solution(String str){
		
		for (int i = 0; i < str.length(); i++) {
			for(int j = i+1; j <= str.length(); j++){
				String s = str.substring(i,j);
				if(palin(s) == true){
					System.out.println(s);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}