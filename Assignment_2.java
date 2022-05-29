package Softnerve;

public class Assignment_2 {
    public static void main(String[] args) {

        //int[] price = {7, 1, 5, 3, 6, 4};
        int[] price={7,6,4,3,1};
        int answer = 0;
        int n=price.length;
        int max = Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            answer = Math.max(answer, price[i] - max);
            max = Math.min(max,price[i]);
        }
        System.out.println(answer);
    }
}
