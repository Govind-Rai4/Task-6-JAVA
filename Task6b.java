import java.util.Scanner;

public class Task6b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a Year: ");
	int year = scanner.nextInt();

	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
	System.out.println(year + "Leap year. ");
}
	else {
	System.out.println(year + "Not Leap year. ");
}
	scanner.close();
}
}