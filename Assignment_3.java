package Softnerve;

public class Assignment_3 {
    public static void main(String[] args) {

        //int arr[] = {5,1,6};
        int arr[] = {1,3};

        int size = arr.length;
        int bits = 0;
        for (int i = 0; i < size; ++i)
        {
            bits |= arr[i];
        }
        int ans = bits * (int)Math.pow(2, size-1);
        System.out.println(ans);
    }
}
