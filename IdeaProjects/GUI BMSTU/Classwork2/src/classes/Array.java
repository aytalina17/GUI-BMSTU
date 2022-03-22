package classes;
import java.util.Arrays;

public class Array {
    int[] arr = new int[1000000000];

    public int[] addElement(int[] arr, int elementAdd) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if ((elementAdd >= arr[i]) && (elementAdd <= arr[i + 1])) {
                arr[i+1] = elementAdd;
                break;
            }
        }
        return arr;
    }
}

