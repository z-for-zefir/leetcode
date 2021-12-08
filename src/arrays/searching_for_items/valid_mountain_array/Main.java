package arrays.searching_for_items.valid_mountain_array;

/*
* Given an array of integers arr, return true if and only if it is a valid mountain array.

* Recall that arr is a mountain array if and only if:
*
* arr.length >= 3
* There exists some i with 0 < i < arr.length - 1 such that:
* arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
* arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
* */

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1};
        //int[] arr = new int[] {3, 5, 5};
        //int[] arr = new int[] {0, 3, 2, 1};

        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        return false;
    }
}
