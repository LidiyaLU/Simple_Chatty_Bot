import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        do {
            i = scan.nextInt();
            if (i == 0) {
                break;
            } else if (i % 2 != 0) {
                System.out.println("odd");
            } else if (i % 2 == 0) {
                System.out.println("even");
            }
        }
        while (i != 0);
    }
}