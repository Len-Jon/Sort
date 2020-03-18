package SORT;

public abstract class SWAP {
    public static void swap(int [] arr , int a , int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
