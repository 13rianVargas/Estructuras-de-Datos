import java.util.Scanner;

public class LAB4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b = sc.nextInt();

        int pares = 0;
        int impares = 0;
        int divisiblesPor7 = 0;
        int divisiblesPor3yPor5 = 0;
    
        for (int i = a; i <= b; i++) {

            if (i % 2 == 0) {
                pares+=1;
            } else {
                impares+=1;
            }// cierra if pares

            if (i % 7 == 0) {
                divisiblesPor7+=1;
            }// cierra if div 7

            if (i % 3 == 0 && i % 5 == 0) {
                divisiblesPor3yPor5+=1;
            }// cierra if div 3 y 5

        }//cierra for

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Cantidad de números divisibles por 7: " + divisiblesPor7);
        System.out.println("Cantidad de números divisibles por 3 y por 5: " + divisiblesPor3yPor5);

        sc.close();
    }
}
