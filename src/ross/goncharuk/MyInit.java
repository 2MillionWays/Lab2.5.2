package ross.goncharuk;

import java.util.Arrays;

public class MyInit {
    private int [] arr;
    {
        arr = new int[10];
        arr[0] = (int) (10 * Math.random());
        arr[1] = (int) (10 * Math.random());
        arr[2] = (int) (10 * Math.random());
        arr[3] = (int) (10 * Math.random());
        arr[4] = (int) (10 * Math.random());
        arr[5] = (int) (10 * Math.random());
        arr[6] = (int) (10 * Math.random());
        arr[7] = (int) (10 * Math.random());
        arr[8] = (int) (10 * Math.random());
        arr[9] = (int) (10 * Math.random());
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
