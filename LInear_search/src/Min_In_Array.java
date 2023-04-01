public class Min_In_Array {
    public static void main(String[] args) {
        int arr[] = {12,85,60,40,21,60};
        System.out.println(Min_value(arr));
    }

    // Find Min Value in the elements of an Array
    static int Min_value(int arr [] ){
        int ans = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
