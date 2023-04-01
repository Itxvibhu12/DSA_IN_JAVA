public class Search_in_Range {
    public static void main(String[] args) {
        int arr []= {1,15,-8,78,42,6,89,20};
        int target = 42;
        System.out.println(SearchInRange(arr , target ,1,5));
    }

    static int SearchInRange(int [] arr , int target , int start , int end ){
        if (arr.length == 0 ){
            return -1;
        }
        for (int i = start ; i < end; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
