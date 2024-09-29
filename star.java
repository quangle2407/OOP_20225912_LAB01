package ex3_star;
import java.util.Scanner;

public class star {
	public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Nhap n: ");
            int n = keyboard.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = n; j > i + 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i * 2; j++) {
                    System.out.print("*");
                }
                for (int j = n; j > i + 1; j--) {
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
        System.exit(0);
    }
}
