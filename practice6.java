import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0;
        Scanner sc = new Scanner(System.in);
        int input;

        do {
            System.out.println("Press 1 to continue & 0 to stop");
            input = sc.nextInt();

            if (input == 0) break;

            System.out.println("Enter your number:");
            int number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }

        } while (input != 0);

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zero);
    }
}
