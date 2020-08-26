package geekbrains.homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        firstArray();
        secondArray();
        thirdArray();
        fourthArray();
        fifthArray();
    }

    //1 задание
    public static void firstArray() {
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2 задание
    public static void secondArray() {
        int[] arr2 = new int[8];
        for (int i = 0, j = 0; i < arr2.length; i++, j += 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));
    }

    //3 задание
    public static void thirdArray() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            int elementArray = arr3[i];
            if (elementArray < 6) {
                arr3[i] = elementArray *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    //4 задание
    public static void fourthArray() {
        int counter = 1;
        int[][] arr4 = new int[10][10];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, k = arr4[j].length - 1; j < arr4[i].length; j++, k--) {
                arr4[i][j] = 0;
                if (i == j) {
                    arr4[i][j] = counter;
                } else if (k == i) {
                    arr4[i][j] = counter;
                }
                System.out.printf("%3s", arr4[i][j]);
            }
            System.out.println();
        }
    }

    //5 задание
    public static void fifthArray() {
        int[] arr5 = new int[10];
        int maxNumb = arr5[0];
        Random random = new Random();
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr5));
        System.out.println("Максимальное число: " + maxArray(arr5));
        System.out.println("Минимальное число: " + minArray(arr5));
    }

    //максимальное значение
    public static int maxArray(int[] arr5) {
        int maxNumb = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > maxNumb) {
                maxNumb = arr5[i];
            }
        }
        return maxNumb;
    }

    //минимальное значение
    public static int minArray(int[] arr5) {
        int minNumb = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < minNumb) {
                minNumb = arr5[i];
            }
        }
        return minNumb;
    }
}


