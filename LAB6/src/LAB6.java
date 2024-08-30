import java.util.*;

public class LAB6 {

    static int num = 1;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nums(num);
        sc.close();
    }

    public static void nums(int num) {
        if (num <= n) {
            System.out.print(num + " ");
            num -= -1;
            nums(num);
        }
    }
}
