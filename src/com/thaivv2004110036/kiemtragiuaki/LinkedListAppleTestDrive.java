import java.util.List;
import java.util.LinkedList;

public class LinkedListAppleTestDrive {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<Apple> apple = new LinkedList<>();
        System.out.println("=======MENU=======");
        System.out.println("1/Thêm táo đầu danh sách.");
        System.out.println("2/Thêm táo cuối danh sách.");
        System.out.println("3/In danh sách.");
        System.out.println("4/Tìm táo theo id.");
        System.out.println("5/Xóa 1 trái táo ở cuối Danh sách.");
        System.out.println("6/Kết thúc.");
        System.out.println("Bạn chọn chức năng?");
        int LuaChon = sc.nextInt();
        switch (LuaChon) {
        case 1:
            apple.addFirst(apple.nhapThongTin());
            break;
        case 2:
            apple.addLast(apple.nhapThongTin());
            break;
        case 3:
            xuat();
            break;
        case 4:
            apple.getLast();
            break;
        case 5:
            apple.removeLast();
            break;

        default:
            break;
        }
    }

    public static void xuat() {
        for (Apple ap : apple) {
            ap.inThongTin();
        }
    }

}
