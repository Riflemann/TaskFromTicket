import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int a =0;
        int b=arr.length-1;
        int tmp;

        while (b > a) {
            tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
            a++;
            b--;
        }

        System.out.println(Arrays.toString(arr));



    }
}