import java.util.*;


public class max {
    public static void main(String args[]) {
        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a > b && b > c && c > d) {
            System.out.println("a is greater");
        } else if (b > c) {
            System.out.println("b is greater");
        } else if (c > d) {
            System.out.println("c is greater");
        } else {
            System.out.println("d is greater");
        }
        
    }
}
