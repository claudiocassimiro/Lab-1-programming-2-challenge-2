import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de n:");
        int n = scanner.nextInt();

        int result = getFactorial(n);

        System.out.println("O ultimo digito do fatorial de " + n + " é " + result % 10);
    }

    public static int getFactorial(int n) {
        if (n == 1) {
            return n;
        }

        return n * getFactorial(n - 1);
    }
}