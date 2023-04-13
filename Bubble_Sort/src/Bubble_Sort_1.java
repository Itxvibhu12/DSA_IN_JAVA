import java.util.Arrays;

public class Bubble_Sort_1 {
    public static void main(String[] args) {
        int [] arr = {1,4,7,2,5,8,3,6,9};
        bubble(arr);
        System.out.println(Arrays.toString(arr));




    }

    static void bubble(int [] arr){

        boolean swapped;
        // run the step n - 1 times
        for (int i = 0 ; i < arr.length; i++){
            swapped = false;
            // for each step , max item will come at the last respective index
            for (int j =  1 ; j < arr.length - i;j++){

                // swap if the item is smalleer than the previous item
                if (arr[j] < arr[j-1]){

                    // if condition is true then swap the element
                    int temp = arr[j];
                     arr[j] = arr[j - 1];
                    arr[j - 1 ] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for particular value of i , it means the array is stored hence stop the process
            if (!swapped ){
                break;
            }
        }

    }
}

