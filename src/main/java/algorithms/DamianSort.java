package algorithms;

public class DamianSort {
//TODO entra un array de integers  y sale ordenado
//    despues hacer otro mejor


    public int[] sort(int[] array) {

        int min;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] <= min) {
                    min = array[j];
                    index = j;
                }
            }
            switchValues(array, i, index);
        }
        return array;
    }


    private void switchValues(int[] array, int i, int j) {
        int value = array[j];
        array[j] = array[i];
        array[i] = value;
    }
}
