package Softnerve;
public class Assignment_1 {
            public static void main (String[] args) {
                int[] a = {7, 10, 4, 10, 6, 5, 2};
                int n = a.length;

                int right_element =  a[n-1];

                System.out.print(right_element + " ");
                for (int i = n-2; i >= 0; i--)
                {
                    if (right_element < a[i])
                    {
                        right_element = a[i];
                        System.out.print(right_element + " ");
                    }
                }
            }
}
