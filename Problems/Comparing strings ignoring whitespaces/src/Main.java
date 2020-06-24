import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");

        System.out.println(str2.equals(str1));

        // put your code here
    }
}