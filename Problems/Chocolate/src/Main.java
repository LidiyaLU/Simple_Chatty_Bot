import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        int square = n*m - k;
        if (n*m < k) {
            System.out.println("NO");
        }
        else if (n*m == k) {
            System.out.println("YES");
        }
        else if (square%n==0||square%m==0) {
            System.out.println("YES"); // put your code here
        }
        else {
            System.out.println("NO");
        }
    }
}