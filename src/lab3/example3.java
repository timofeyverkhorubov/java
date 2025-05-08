package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("¬ведите количество чисел в последовательности ‘ибоначчи (желательно чтоб число было болше 2)");
        int num = in.nextInt();

        int[] nums = new int[num];
        nums[0]  = 1;
        nums[1] = 1;

        for (int i = 2; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

    }
}
