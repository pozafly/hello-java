package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));  // [1, 2, 3, 0, 0]

        // 배열에서 index로 값을 찾거나 넣는 것은 무척 빠름
        arr[2] = 10;
        System.out.println(arr[2]);

        // 배열 검색: O(n)
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " 찾음");
                break;
            }
        }
    }
}
