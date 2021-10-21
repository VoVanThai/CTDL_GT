import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        for(int x : a) {
            System.out.print(x);
        }
    }
}
