package test;

import java.util.Arrays;


class algoritm {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 7, 1, 9, 13, 11, 15, 2, 8, 4, 6, 14, 10, 12};
        int b;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for (int a = 0; a < numbers.length - 1; a++) {
                if (numbers[a] > numbers[a + 1]) {
                    statusSort = false;
                    b = numbers[a];
                    numbers[a] = numbers[a + 1];
                    numbers[a + 1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}