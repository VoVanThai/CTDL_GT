import java.util.Scanner;

public class Apple {
    Scanner sc = new Scanner(System.in);
    int id;
    double khoiLuong;
    String mauSac;

    public Apple(int i, double kl, String ms) {
        id = i;
        khoiLuong = kl;
        mauSac = ms;
    }

    public void nhapThongTin() {
        System.out.println("Nhập id:");
        id = sc.nextInt();
        System.out.println("Nhập khối lượng: ");
        khoiLuong = sc.nextDouble();
        System.out.println("Nhập màu sắc: ");
        mauSac = sc.nextLine();
    }

    public void inThongTin() {
        System.out.println("id: " + id + "Khối Lượng: " + khoiLuong + "Màu sắc: " + mauSac);
    }

}