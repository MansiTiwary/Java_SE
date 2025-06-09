import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[25];
        int sum = 0;
        for (int i = 0; i < 25; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
            int avg = sum / 25;
        
        System.out.println("AVERAGE IS " + avg);
    }
}
