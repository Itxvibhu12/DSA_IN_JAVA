public class Find_no_digits_is_Even_or_not {
    public static void main(String[] args) {
      int[] arr = {12 , 345,6,2,7896};
        System.out.println(findNumbers(arr));

        System.out.println(No_of_digits(-12589));

        // this is the way of optomising the find number of digits code
        System.out.println(noOFDigits2(-81253));

    }
// this function is used for to calculate how many even no is contains
    static int findNumbers(int [] nums){
        int count = 0 ;
        for (int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
// check is this number is contain even digits or not
    static boolean even(int nums){
        int evenNUMber = No_of_digits(nums);
        /*
        if (evenNUMber % 2 == 0){
            return true;
        } */

        return evenNUMber % 2 ==0;

    }
// this function is used to find the number of digits
    static int No_of_digits(int num ){
        int count = 0;

        if (num < 0){
            // then make the number in a positive number
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }
        while (num > 0){
            count++;
            num = num / 10; // this is use for find the last digits of a number or you can use num=/10;

        }
        return count;
    }


    // to find no of digits in optimise way

    static  int noOFDigits2(int num){
        if (num < 0 ){
            // then make negative number to positive number
            num = num *-1;
        }
        if (num ==0 ){
            return 1;
        }
        return (int)(Math.log10(num)) +1 ;
    }
}
