import java.util.Scanner;
public class greatest {
    int n1;
    int n2;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter your first no");
        n1 = sc.nextInt();
        System.out.println("Enter your 2nd no");
        n2 = sc.nextInt();
    }

    public void display() {
        if (n1 > n2) {
            System.out.println(n1 + "is greater");
        } else {
            System.out.println(n2 + " is greater");
        }

    }

    public static void main(String args[]) {
        greatest ob = new greatest();
        ob.input();
        ob.display();
    }
}
