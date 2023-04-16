import java.util.*; //This statement are used to  take the input;
public class condition {
    public static void main(String args[]) {
        //input
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); //datatype;
        //condition
        if (age > 18) {
            System.out.println("adult");

        } else {
            System.out.println("not adult");
        }
 }
}
