package Day58.Practice.Dilnoza;

import java.util.ArrayList;
import java.util.Arrays;

public class MentoringTask1 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 0, 14};
        int[] ints = moveZeroes(arr);
        System.out.println(Arrays.toString(ints));
        ArrayList<Integer> list = removeZeros(arr);
        System.out.println(list);

    }
    static int[] moveZeroes(int[] arr){
        int index = 0;
        //0, 1, 0, 3, 0, 14
        //       [1 3 14]
        // index = 3
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i <arr.length ; i++) {
            arr[i] = 0;
        }
        return arr;
    }
    public static ArrayList<Integer> removeZeros(int[] arr){
        int counter=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                counter++;
            }else {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < counter; i++) {
            list.add(0);
        }
        //  System.out.println("list = " + list);
        return list;
    }
}
