import java.util.*;
// for triangle
public class structure {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            // first half
            for(int j=i; j>=1; j--) {
                System.out.print("*");
            }
            // second half
            for (int j=2; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
