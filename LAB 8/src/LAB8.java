import java.util.Scanner;

public class LAB8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Valor de N:");
        int n = sc.nextInt();
        System.out.println("La suma es: " + sumaCifras(n));
        sc.close();
    }

    public static int sumaCifras(int n) {
        if (n <= 0) {
            return 0;
        } else if (n > 0) {
            return (n % 10) + sumaCifras(n / 10);
        }
        return 0;
    }
}
