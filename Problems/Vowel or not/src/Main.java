import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        boolean answer;

        answer = ch == 'a' || ch == 'A' || ch == 'o' || ch == 'O' || ch == 'e' || ch == 'E' || ch == 'u' || ch == 'U' || ch == 'i' || ch == 'I';
        return (answer);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}