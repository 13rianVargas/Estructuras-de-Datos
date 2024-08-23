import java.util.Scanner;

public class LAB7 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("El residuo es: " + residuo(a, b));

        sc.close();
    }

    public static int residuo(int a, int b) {
        if (a >= b) {
            int res = residuo(a - b, b);
            return res;
        } else {
            return a % b;
        }
    }
}
