import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> a = new ArrayList<>();
        while (true) {
            double x = sc.nextDouble();
            a.add(x);
            System.out.println("Nhập thêm (Y/N)?");
            if(sc.nextLine().equals("N"))
                break;
        }
        for(Double i : a)
            System.out.println(i);
    }
}
