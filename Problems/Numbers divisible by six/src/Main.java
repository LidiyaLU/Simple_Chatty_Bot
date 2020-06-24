import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int sum = 0;

        while (scan.hasNext()) {
            i = scan.nextInt();
            if (i % 6 == 0) {
                sum += i;

            }
        }
        System.out.println(sum); // put your code here

    }
}