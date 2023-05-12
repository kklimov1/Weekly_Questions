import java.util.Arrays;

public class Med2Arrays {
    public static double findMedianArrays (Integer[] arr1, Integer[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i=0; i<arr1.length; i++) {
            newArr[i] = arr1[i];
        }
        for (int i=arr1.length; i<arr1.length+arr2.length; i++) {
            newArr[i]=arr2[i-arr1.length];
        }
        mergeSort(newArr, newArr.length);
        Arrays.stream(newArr).forEach(System.out::println);
        int middle = newArr.length/2;
        double median=0;
        if ((arr1.length+arr2.length)%2 == 0) {
            median = (newArr[middle-1] + newArr[middle]) /2.;
        }
        else {
            median = newArr[middle];
        }
        return median;
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
