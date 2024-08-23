import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=0;
        int cont=0;
        int sum=0;

        do {
            n = sc.nextInt();
            if (n > 100) {
               break; 
            }
            sum += n;
            cont++;
        } while (n <= 100);

        double total = (double)sum/cont;
        System.out.println("El promedio es: " + total);
        sc.close();
    }
}
