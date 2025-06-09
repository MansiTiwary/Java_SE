import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int n = sc.nextInt();

        boolean isPrime = true;
        int div = 2;

        if (n <=1) {
            System.out.println("NOT A PRIME NUMBER");
            return;
        }

        while (Math.sqrt(n) >= div) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        if (isPrime) {
            System.out.println("IS A PRIME NUMBER");
        } else {
            System.out.println("NOT A PRIME NUMBER");
        }
    }
}