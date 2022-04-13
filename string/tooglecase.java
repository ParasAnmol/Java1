import java.io.*;
import java.util.*;

public class Main {

	public static void toggleCase( String str){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length()-1; i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z'){
				int b = c - 32;
				char ch = (char)b;
				sb.append(ch);
			}
			else if (c >= 'A' && c <= 'Z'){
				int b = c + 32;
				char ch = (char)b;
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		toggleCase(str);
	}

}