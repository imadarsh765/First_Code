import java.util.*;

public class operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number=");
        int a= sc.nextInt();
        System.out.println("Enter second number=");
        int b= sc.nextInt();
        int c= a++;
        int d= a--;
        int e= ++b;
        int f= --b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
