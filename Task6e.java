import java.util.Scanner;
public class Task6e {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();

        if (number % 2 ==0) {
            System.out.println(number + " Even number");
        }
        else {
            System.out.println(number + " is odd.");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " is divisible by both 3 and 5.");
        } else {
            System.out.println(number + " is not divisible by both 3 and 5.");
        }
    }
}
