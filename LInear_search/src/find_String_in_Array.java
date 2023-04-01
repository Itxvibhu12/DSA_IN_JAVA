import java.lang.reflect.Array;
import java.util.Arrays;

public class find_String_in_Array {
    public static void main(String[] args) {
        String name = "Vikram";
        char item = 'a';
        System.out.println(LineratSearch(name , item));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean LineratSearch(String name  , char item){
        if (name.length() == 0){
            return  false;
        }
        for (int i =0 ; i < name.length();i++){
            if (item == name.charAt(i)){
                return  true;


            }
        }
        return false;
    }

    // this is used for print the String into character
    static boolean LinearSearch(String str , char item){
        if (str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()){
            return true;
        }
        return false;
    }
}
