import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("x=");
        int x = sc.nextInt();
        System.out.println("y=");
        int y = sc.nextInt();

        int recta = 2*x+3;

        if (recta == y) {
            System.out.println("El punto pertenece a la recta");
        } else {
            System.out.println("El punto no pertenece a la recta");
        }

        sc.close();
    }
}
