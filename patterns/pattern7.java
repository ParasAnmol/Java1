import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int star = 1;
        int space = 0;
        for (int i = 1; i <= n; i++) {
            for( int j = 1 ; j <= space  ; j++ ) {
                System.out.print("\t");
            }
            for( int k =1 ; k <= star  ; k++ ) {
                System.out.print("*\t");
            }
            space++;
            System.out.println();
        }
    }
}