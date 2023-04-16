import java.util.*;;

public class switchx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Good moring");
                break;
            case 2:
                System.out.println("Good Afternoon");
                break;
            case 3:
                System.out.println("Good Evening");
                break;
            case 4:
                System.out.println("Good night");
                break;

        
            default:
            System.out.println("invaild number");
                break;
        }
    }
}
