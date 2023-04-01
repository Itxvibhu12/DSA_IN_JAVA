import java.util.Arrays;

public class Find_element_Elelemt_2D_Array {
    public static void main(String[] args) {
        int arr [][] = {
                {20,30,50,60,40},
                {85,98,40,68},
                {48,66,89},
                {62,83,12},
        };

        int target= 66;
        int ans [] = Search(arr,target); // format ofo return value {row , col}
        System.out.println(Arrays.toString(ans));


    }

    static int [] Search (int arr [][], int target){
        for (int row = 0 ; row < arr.length;row++){
            for (int col = 0 ; col < arr[row].length ; col++){
                if (arr[row] [col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int []{-1,-1};
    }
}
