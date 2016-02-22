package ross.goncharuk;

import java.util.Arrays;

public class MyInit {

    /*in 2.5.3 changing the field "arr" to static will change the result as
    arr will belong to class and creating each object will re-write arr*/
    private static int [] arr;

    /*in 2.5.4 changing initialization block to static because static blocks
    should work with static fields*/
    static {
        arr = new int[10];
        for(int i = 0;i<=9;i++){
            arr[i]=(int) (100 * Math.random());
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }
}
