package kiemtragiuaki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListAppleTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<Apple> apple = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=======MENU=======");
        System.out.println("1/Nhập thêm táo.");
        System.out.println("2/Tìm táo theo màu.");
        System.out.println("3/In danh sách táo.");
        System.out.println("4/Kết thúc.");
        System.out.println("Bạn chọn chức năng?");
        int LuaChon = sc.nextInt();
        switch (LuaChon) {
        case 1:
            nhap();
            break;
        case 2:
            xuat();
            break;
        case 3:
            timTaoTheoMau();
            break;
        default:
            break;
        }
    }

    public static void nhap() {
        System.out.println("Nhập số táo cần thêm:");
        int n = sc.nextInt();
        Apple ap = new Apple();
        for (int i = 0; i < n; i++) {
            ap.nhapThongTin();
            apple.add(ap);

        }

    }

    public static void xuat() {
        for (Apple ap : apple) {
            ap.inThongTin();
        }
    }

    public static void timTaoTheoMau() {
        System.out.println("Nhập màu cần tìm: ");
        String mau = sc.nextLine();
        for (Apple ap : apple) {
            if (mau.equals(apple.mauSac)) {
                apple.inThongTin();
            }
        }
    }

}
