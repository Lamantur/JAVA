
//(Дополнительное) Реализовать алгоритм сортировки слиянием
import java.util.Arrays;

public class HW1 {
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String args[]) {
        int[] sortArr = { 5, 8, 14, 100, 0, 6789876, 351351, 857865780, -100, 77887, 6, 841, 6, 86, 46, 84, 6, 854, 64,
                854, 64, 8, 416, 41, 6, 41, 658, 416, 541, 6, 5416, 5, 416, 541, 65, 41, 65, 416, 8546, 0, 416, 8, 1468,
                541, 685, 416, 8541, 68, 41, 6, 505, 6, 0, 95, 9, 59, 59, 5, 1, 1, 1, 1, 1, 15, 15, 11, 1, 2, 1, 21, 2,
                12, 1, 35, 13, 51, 3, 1, 321, 2, 3, 32, 2, 1, 32, 12, 3, 21, 31, 21, 3, 21, 31, 321, 3515, 13, 0, 513,
                15, 21, 3, 3513, 151, 1, 32, 3, 51, 3, 135, 13351, 35, 3513, 0, 51351, 351, 35135, 1351, 0 };
        System.out.println(Arrays.toString(mergeSort(sortArr)));
    }
}