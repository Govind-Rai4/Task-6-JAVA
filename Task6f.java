import java.util.Scanner;
public class Task6f {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter temp in Celsius: ");
        int temperature = obj.nextInt();

        if (temperature < 0) {
            System.out.println("Freezing: ");
        }
        else if (temperature <= 20) {
            System.out.println("cold: ");
        }
        else if (temperature <= 35) {
            System.out.println("warm: ");
        }
        else{
            System.out.println("Hot: ");
        }
    }
}
