package ross.goncharuk;

import java.util.Arrays;

public class MyInit {

    /*in 2.5.3 changing the field "arr" to static won't change the result as
    arr will be initialized at non-static block, yet Intellij Idea will suggest changing non-static block to static*/
    private static int [] arr;

    /*in 2.5.4 changing initialization block to static won't change the result as
    static block will be initialized right after declaring int[] arr*/
    static {
        arr = new int[10];
        for(int i = 0;i<=9;i++){
            arr[i]=(int) (10 * Math.random());
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }
}
