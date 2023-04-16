import java.util.Scanner;
public class number {
    int n1;
    int n2;
    int n3;
    int n4;
    Scanner sc = new Scanner(System.in);

    public void input() {
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
    }

    public void display() {
        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println(n1 + " is greter");
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println(n2 + "is greter");
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            System.out.println(n3 + "n3 is greater");
        } else {
            System.out.println(n4 + " is greater");
        }
    }

    public static void main(String args[]) {
        number ob = new number();
        ob.input();
        ob.display();
    }
}
