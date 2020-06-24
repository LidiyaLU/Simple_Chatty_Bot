import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;


        for (int j = 1; j <= n; j++) {


            for (int i = 1; i <= j; i++) {

                count++;
                System.out.print(j+" ");
                if (count == n) {
                   break;
                }
            }
            if (count == n) {
                break;
            }

            }


        }


    }

