import java.util.Scanner;
public class LAB10 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor de N: ");
        String entrada =  sc.nextLine();
        int cifras = entrada.length();
        int num = Integer.parseInt(entrada);

        int suma = armstrong(entrada, cifras, 0, num);

        if (suma == num) {
            System.out.println("Es un número de Armstrong");
        }else if (suma != num) {
            System.out.println("No es un número de Armstrong");
        }

        sc.close();
    }

    public static int armstrong(String entrada, int cifras, int index, int num){

        if (index < cifras) {
            int digit = Character.getNumericValue(entrada.charAt(index)); //String a Char y Char a int
            index -=-1;
            return  (int)Math.pow(digit, cifras) + armstrong(entrada, cifras, index, num);   
        } else {
            return 0;
        }

    }
}
