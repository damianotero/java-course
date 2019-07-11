package algorithms;

public class QuickSort {

    public QuickSort() {
    }

    public int[] sort(int[] data, int low, int high, int pivot) {



        int left = low;
        int right = high;


        while (left <= right) {

            while (data[left] < data[pivot]) {
                left++;
            }
            while (data[right] > data[pivot]) {
                right--;
            }

                switchValues(data, left, right);
                left++;
                right--;
            if (left>right)
            switchValues(data,pivot ,right);
        }
        sort(data,0,pivot-1, pivot);
        sort(data, pivot+1,data.length,pivot);

        return data;

//        while (left!=right) {
//            while (data[left] < pivot) {
//                left++;
//
//            }
//            while (data[right] > pivot) {
//                right--;
//            }
//            switchValues(data, right, left);
//        }
//        switchValues(data, pivot, right);


    }

    private void switchValues(int[] array, int i, int j) {
        int value = array[j];
        array[j] = array[i];
        array[i] = value;
    }
}
