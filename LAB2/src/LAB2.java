import java.util.Scanner;

public class LAB2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        System.out.print("c= ");
        int c = sc.nextInt();

        double discriminante = (b*b)-4*a*c;
        double x1 = (-b + Math.sqrt(discriminante))/2*a;
        double x2 = (-b - Math.sqrt(discriminante))/2*a;

        if (discriminante > 0) {
            System.out.println("Los ceros son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            
            if (x1 == 0) {
                System.out.println("Tiene un solo cero x= " + x2);
            } else {
                System.out.println("Tiene un solo cero x= " + x1);
            }
            
        } else if (discriminante < 0) {
            System.out.println("No tiene solución real");        
        }

        sc.close();
    }
}
