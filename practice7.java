import java.util.Scanner;
public class practice7 {
    public static void main(String[] args) {
        System.out.println("Enter x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 0; i < 10; i++) {
           result = result * x; 
        }
        System.out.println("x to the power n is :"+result);
    }
}
