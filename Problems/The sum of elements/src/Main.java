import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        do {
            i = scan.nextInt();
            sum += i;
        }
        while (i != 0);
        System.out.println(sum);
    }
}