import java.util.Scanner;
public class practice2 {
      public static void printSum(int n) {
        int Sum = 0;
        for(int i = 1; i < n;i++){
        if(i % 2!=0)
        Sum = Sum + i;
        }
        System.out.println(Sum);
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
      }
}
    

