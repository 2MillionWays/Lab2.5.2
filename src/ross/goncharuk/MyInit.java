package ross.goncharuk;

import java.util.Arrays;

public class MyInit {
    /*in 2.5.3 changing the field "arr" to static won't change the result as
    arr will be initialized at non-static block. Intellij Idea will suggest changing non-static block to static*/
    private static int [] arr;
    {
        arr = new int[10];
        for(int i = 0;i<=9;i++){
            arr[i]=(int) (10 * Math.random());
        }
    }
    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        MyInit arrOne = new MyInit();
        MyInit arrTwo = new MyInit();

        arrOne.printArray();
        arrTwo.printArray();
    }
}
