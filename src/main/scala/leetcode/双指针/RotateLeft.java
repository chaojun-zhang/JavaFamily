package leetcode.双指针;

public class RotateLeft {

    public static String apply(String s, int k){
        if (k==0){
            return s;
        }
        char[] chr= s.toCharArray();
        reverse(chr,0,k-1);
        reverse(chr,k,s.length()-1);
        reverse(chr,0,s.length()-1);
        return new String(chr);
    }

    public static void reverse(char[] chr,int low,int high){
        while (low<=high){
            char tmp = chr[low];
            chr[low] = chr[high];
            chr[high]= tmp;
            low ++;
            high--;
        }
    }

    public static void main(String[] args) {
        System.out.println(RotateLeft.apply("abcd" , 2));

    }
}
