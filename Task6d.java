import java.util.Scanner;
public class Task6d {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the color red, yellow, green: ");
        String color =obj.next().toLowerCase();

        if (color.equals("red")) {
            System.out.println("Stop");
        }
        else if (color.equals("yellow")) {
            System.out.println("Get ready");
        }
        else if (color.equals("green")) {
            System.out.println("Go");
        }
        else {
            System.out.println("Invalid Color");
        }
    }
}
