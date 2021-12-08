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
        int[] arr = new int[]{1, 3 , 2};
        // int[] arr = new int[]{2, 1};
        //int[] arr = new int[] {3, 5, 5};
        //int[] arr = new int[] {0, 3, 2, 1};

        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        // лучше все было через while. while (up) ... потом while (down) ...
        if (arr.length < 3)
            return false;
        boolean goingUp = arr[0] < arr[1];
        boolean hasPeak = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
            if (goingUp) {
                if (arr[i] > arr[i + 1]) { // switch to going down, peak detected
                    goingUp = false;
                    hasPeak = true;
                }
            } else { // going down
                if (!hasPeak) // при спуске нет пика (необязательно, т.к. учитывается return-ом, но для большого массива укоротит время
                    break;
                // при спуске есть пик, не допустить повторный
                if (arr[i] < arr[i + 1])
                    return false;
            }

        }
        return hasPeak;
    }
}
