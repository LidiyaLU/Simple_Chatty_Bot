import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        //boolean goodAmount = a > 10 && a < 20;
        boolean good = (a >= 10 && a <= 20 && weekend == false) || (a>=15&&a<=25&&weekend == true);
        System.out.println(good);
    }
}