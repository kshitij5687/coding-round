public class quicksort {

    public static void quick(int[] array, int low, int high){
        if(low < high){
            int pivotIndex = divide(array, low, high);
            quick(array, low, pivotIndex);
            quick(array, pivotIndex + 1, high);
        }
    }

    public static int divide (int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++){
            if (array[j] <= pivot) {
                i++;
                swap(array,i,j);
            }
        }
        swap(array, i+1, high );
        return i + 1;
    }
    
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}