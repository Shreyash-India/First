package First;
import java.util.Arrays;
public class UniqueDigits {
    public static void main(String[] args) {

        //448684554
        int num = 443455848, k = -1, count = 0, var = -1, n = 0;
        int number = num;

        for (; number != 0; number /= 10, ++n) {
            /* count no of digits */}

        int arr[] = new int[n];
        while (num > 0) {  //Extracting Digits
            arr[++k] = num % 10;
            num = num / 10;
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (var == arr[i]) // Ignoring Duplicates
                continue;

            else {
                for (int j = i + 1; j < n; j++) { //modified O(N2)
                    if (arr[i] == arr[j]) {
                        var = arr[j];
                        count++;
                    }
                }
            }
        }
        System.out.printf("Number of Unique Digits is : %s" ,n-count);
    }
}
