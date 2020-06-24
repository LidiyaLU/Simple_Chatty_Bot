import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int dX = x1 - x2;
        int dY = y1 - y2;
        int deltaX = Math.abs(dX);
        int deltaY = Math.abs(dY);

        if (x1==x2||y1==y2||deltaX==deltaY) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}