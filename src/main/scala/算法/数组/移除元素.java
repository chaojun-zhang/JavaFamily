package 算法.数组;

public class 移除元素 {

    public static int del(int[] a,int b ){
        int slow = 0;
        for (int fast =0 ;fast < a.length; fast ++){
            if (a[fast] != b ){
                a[slow++] = a[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(del(new int[]{1, 2, 3, 2, 4, 5, 2, 8}, 2));
    }
}
