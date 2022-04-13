import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String sb = scn.next();

		StringBuilder sbs  = new StringBuilder();
		int i = 0;
		while(i < sb.length()-1) {
			sbs.append(sb.charAt(i));
			int  a = sb.charAt(i);
			int  b = sb.charAt(i+1);

			int c = b - a; 
			sbs.append(c);
			i++;
		}
		sbs.append(sb.charAt(i));
		System.out.println(sbs);
	}
}