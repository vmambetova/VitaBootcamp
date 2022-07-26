package com.bootcampexcersise.module2.activity;

public class FindInArray {
    public static void main(String[] args) {
       /* int[] nums = {100, 1, 4, 15};
        int result = nums[0];
        // Find smallest in an array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        System.out.println("Smallest in array is "+result);
        result = nums[0];*/

        //TODO Find largest in an array
        int[] numbers = {1001, 241, 4424, 3415};
        int array = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > array) {
                array = numbers[i];
            }
        }
        System.out.println("Largest in array is "+array);

    }



}
