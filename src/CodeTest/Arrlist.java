import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> soThuc = new ArrayList<>();
        
        while(true){
            System.out.print("Nhập số thực:");
            Double x = sc.nextDouble();
            sc.nextLine();
            soThuc.add(x);
            System.out.println("Nhập thêm ?(Y/N)");
            String temp = sc.nextLine();
            if(temp.equals("N"))
                break;
        }

        System.out.println("Danh sách số thực:");
        for (Double double1 : soThuc) {
            System.out.println(double1);
        }
        

    }
}
