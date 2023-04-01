import java.util.Scanner;

public class find_element_in_Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the array Elements : ");
        int target = in.nextInt();
        System.out.println(LinearSearch(arr,target));

        boolean ans = LinearSearch2(arr , target);
        System.out.println(ans);

    }

    static int LinearSearch(int arr [] , int target ){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i]== target){
                return i;
            }

        }
        return -1;
    }

    static boolean LinearSearch2(int [] arr , int item ){
        if (arr.length == 0){
            return false;
        }
        for (int i = 0 ; i < arr.length;i++){
            if (arr[i]== item){
                return true;
            }
        }
        return false;
    }
}
