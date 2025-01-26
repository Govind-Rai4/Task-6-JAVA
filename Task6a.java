import java.util.Scanner;
public class Task6a {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char vowel = obj.next().charAt(0);

        if (vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u') {
            System.out.println("vowel" );
        }
        else if ((vowel >= 'a' && vowel <= 'z')) {
            System.out.println("Consonant" );
        }
        else {
            System.out.println("Neither vomel nor consonant");
        }
        
    }
}