import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int i = scanner.nextInt();
        while (i != 0) {
            i = scanner.nextInt();
            count++;
        }
        System.out.println(count);
        
    }
}
