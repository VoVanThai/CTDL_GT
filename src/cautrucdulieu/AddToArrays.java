package cautrucdulieu;

public class AddToArrays {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 9};
        int newElement = 1;
        int n = a.length;
        int[] newArrays = new int[n + 1];
        for(int i = 0; i < n; i++)
            newArrays[i] = a[i];
        System.out.println("In mảng cũ:");
            for(int x : a)
                System.out.println(x);
        newArrays[n] = newElement;
        System.out.println("In mảng mới:");
        for(int x : newArrays)
            System.out.println(x);
    }
}
