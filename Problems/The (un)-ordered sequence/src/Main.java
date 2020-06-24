import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean order = true;
        int min = s.nextInt();
        int max = s.nextInt();
        if (max == 0) {
            System.out.println(order);
            return;
        }
        int n = s.nextInt();
        if (n == 0) {
            System.out.println(order);
            return;
        }

        while (n != 0) {

            //n = s.nextInt();

            if (n >= max && min <=max ) {
                min = max;
                max = n;
                order = true;
            }
            else if (n <= max && min >= max) {
                min = max;
                max = n;
                order = true;
            }
            else
            {
                order = false;
            }
            n = s.nextInt();

        }
        System.out.println(order);


    }

}
