import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String test = scanner.next();
        String test1 = test.replace("a", "b");
        System.out.println(test1);
    }
}