import java.util.*;
public class problem {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2, 13, 1, 21};
        pair(arr);
    }
    static void pair(int[] arr) {
        Arrays.sort(arr);
        float mean = cmean(arr);
        float median = cmedian(arr);
        List<String> pair = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum < mean && sum > median) {
                    pair.add("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
        if (pair.isEmpty()) {
            System.out.println("()");
        } else {
            for (String pairs : pair) {
                System.out.println(pairs + " ");
            }
        }
    }
    static float cmean(int[] arr) {
        int sum = 0;
        int l = arr.length;
        for (int n : arr) {
            sum += n;
        }
        return (float) sum / l;
    }

    static float cmedian(int[] arr) {
        int l = arr.length;
        if (l % 2 == 0) {
            return (arr[l / 2 - 1] + arr[l / 2]) / 2.0f;
        } else {
            return arr[l / 2];
        }
    }
}
