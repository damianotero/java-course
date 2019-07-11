package algorithms;

public class DamianSortEficient {


    public int[] sort(int[] array) {

        int min;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length ; j++) {
                if (array[j] <= min) {
                    min = array[j];
                    counter = j;
                }
            }
            switchValues(array, i, counter);
        }
        return array;
    }



    private void switchValues(int[] array, int i, int j) {
        int value = array[j];
        array[j] = array[i];
        array[i] = value;
    }
}

