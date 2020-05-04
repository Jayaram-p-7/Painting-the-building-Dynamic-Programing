
import java.util.*;

public class Partition {
    static Integer min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Integer cost = 0;
        Integer n = 4, t = 2, k = 1, dk = 1;
        Integer[] arr = new Integer[]{0, 0, 0, 2};
        Integer[][] c = {{100, 20}, {30, 59}, {71, 81}, {9, 200}};
        find(arr, 0, t, k, c, cost, dk);
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    private static void find(Integer[] arr, int i, Integer t, Integer k, Integer[][] c, Integer cost, Integer dk) {
        if (i == arr.length - 1) {
            if (arr[i] == 0) {
                Integer prev = dk;
                for (int j = 1; j <= t; j++) {
                    arr[i] = j;
                    if (arr[i - 1] != arr[i]) dk += 1;
                    if (dk == k) {
                        cost += c[i][j - 1];
                        if (min > cost) min = cost;
                    }
                    dk = prev;
                }
                arr[i] = 0;
            } else {
                if (arr[i - 1] != arr[i]) dk += 1;
                if (dk == k) {
                    if (min > cost) min = cost;
                }
            }
            return;
        } else {
            if (arr[i] == 0) {
                Integer prev = dk;
                for (int j = 1; j <= t; j++) {
                    arr[i] = j;
                    if (i != 0) {
                        if (arr[i - 1] != arr[i]) dk += 1;
                    }
                    if (dk <= k) {
                        cost += c[i][j - 1];
                        find(arr, i + 1, t, k, c, cost, dk);
                        cost -= c[i][j - 1];
                    }
                    dk = prev;
                }
                arr[i] = 0;
            } else {
                if (i != 0) {
                    if (arr[i - 1] != arr[i]) dk += 1;
                }
                find(arr, i + 1, t, k, c, cost, dk);
            }
        }
    }
}


