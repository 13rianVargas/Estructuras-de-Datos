import java.util.Scanner;

public class LAB1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Precio del producto: ");
        int valorDelProducto = sc.nextInt();

        double descuento = valorDelProducto * 0.15;
        double valorConDescuento = valorDelProducto - descuento;

        System.out.println("Valor a pagar: " + valorConDescuento);

        sc.close();

    }//cierra main
}//cierra class
