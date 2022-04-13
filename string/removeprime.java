import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		
		for (int i = al.size()-1;i >= 0 ; i--) {
			int a = al.get(i);
			int b = 0;
			for (int j = 2; j <= a/2; j++) {
				if(a%j == 0){
					b = 1;
				}
			}
			if(b == 0){
				al.remove(i);
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}