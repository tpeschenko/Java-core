package org.task2;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 1, 1, 1};
        System.out.println(Task2.quantityEvenElements(numbers));
        System.out.println(Task2.differenceBetweenMaxAndMin(numbers));
        System.out.println(Task2.meetElementsZero(numbers));

    }

    public static int quantityEvenElements(int [] numbers){
        int count = 0;
        for (int i : numbers) {
            if(i % 2 == 0){
                count += 1;
            }
        }
        System.out.print("Количество честных элементов в массиве равно: ");
        return count;
    }
    public static int differenceBetweenMaxAndMin(int[] numbers){
        if (numbers.length != 0) {
            int min = numbers[0];
            int arrayLength = numbers.length;
            for (int i = 1; i < arrayLength; i++) {
                if(numbers[i] < min){
                    min = numbers[i];
                }
            }
            int max = numbers[0];
            for (int i = 1; i < arrayLength; i++) {
                if(numbers[i] > max){
                    max = numbers[i];
                }
            }
            int difference = max - min;
            System.out.print("Разница между Max и Min элементами равно: ");
            return difference;
        }else {
            System.out.print("Количество элементов массива: ");
            return 0;
        }

    }
    public static boolean meetElementsZero(int[] numbers){
        int arrayLength = numbers.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            if(numbers[i] == 0 && numbers[i + 1] == 0){
                return true;
            }
        }
        return false;
    }


}
