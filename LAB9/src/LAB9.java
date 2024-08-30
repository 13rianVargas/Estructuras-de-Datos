import java.util.Scanner;
public class LAB9 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor de N: ");
        String entrada =  sc.nextLine();
        int cifras = entrada.length();
        int num = Integer.parseInt(entrada);

        System.out.println("\nEl número es: " + invierteNum(num, cifras) );

        sc.close();
    }

    public static int invierteNum(int num, int cifras){
        if ((num/10)!=0) {
            int inversion = ((num%10)*(int)(Math.pow(10,cifras-1)));
            return inversion + invierteNum(num/10, cifras-1);
        }else if (((num/10)==0)) {
            return (num%10);
        }
        return 0;
    }
    
}
