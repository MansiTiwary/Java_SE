import java.util.Scanner;

public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14 * r *r;
        System.out.println("AREA OF CIRCLE "+ area);
    }
}
