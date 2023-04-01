public class Max_Elelemt_Array {
    public static void main(String[] args) {
        int arr []= {15,52,10,12,60,90};

        System.out.println("Max Value of Array : "+max_Value(arr));

    }

    // assume array.length != 0
    // return min value in the array
    static int max_Value(int arr[] ) {
        int ans = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
