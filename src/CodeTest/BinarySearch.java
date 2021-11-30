public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8, 9 };
        binarySearch(arr, 8);
    }

    static int binarySearch(int[] arr, int x){
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int m = (l + (r - l)) / 2;
            if(arr[m] == x)
                return m;
            if(arr[m] < x)
                l = m + 1;
            else    
                r = m - 1;
        }
        return -1;
    }
}
