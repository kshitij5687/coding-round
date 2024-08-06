public class binarysearch {

    public static void main(String[] args){
        int[] array = {2,3,4,5,6,7,8};
        int target = 5;
        int result = binary(array, target);
        if( result == -1){
            System.out.println("Element is not found in the array");
        }
        else{
            System.out.println("Element is present in the array");
        }
    }

    public static int binary(int [] array, int target){
        int left = 0;
        int right = array.length -1;

        while(left<=right){
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if(array[mid] < target){
                left = mid + 1;
            }
            if(array[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }
}