public class Find_Max_In_2D_Array {
    public static void main(String[] args) {
        int arr [][] = {
                {20,30,50,60,40},
                {85,98,40,68},
                {48,66,89},
                {62,83,12},
        };
        System.out.println(max(arr));
    }

    static int max(int [][] arr){
        int max = Integer.MIN_VALUE;

        for (int [] ints : arr){
            for (int element : ints){
                if (element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
