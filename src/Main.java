import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int[] arrInt = new int[]{1, 2, 3};
        float[] arrFl = {1.57f, 7.654f, 9.986f};
        char[] arrCh = {'1', 'A', '3'};
        System.out.println(Arrays.toString(arrInt));
        System.out.println(Arrays.toString(arrFl));
        System.out.println(Arrays.toString(arrCh));

        System.out.println();

        // Задача 2
        System.out.println("Задача 2");

        for (int index = 0; index < arrInt.length; index++) {
            if (index == arrInt.length - 1) {
                System.out.println(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ", ");
        }

        for (int index = 0; index < arrFl.length; index++) {
            if (index == arrFl.length - 1) {
                System.out.println(arrFl[index]);
                break;
            }
            System.out.print(arrFl[index] + ", ");
        }

        for (int index = 0; index < arrCh.length; index++) {
            if (index == arrCh.length - 1) {
                System.out.println(arrCh[index]);
                break;
            }
            System.out.print(arrCh[index] + ", ");
        }

        System.out.println();

        // Задача 3
        System.out.println("Задача 3");

        for (int index = arrInt.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrInt[index]);
                break;
            }
            System.out.print(arrInt[index] + ", ");
        }

        for (int index = arrFl.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrFl[index]);
                break;
            }
            System.out.print(arrFl[index] + ", ");
        }

        for (int index = arrCh.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(arrCh[index]);
                break;
            }
            System.out.print(arrCh[index] + ", ");
        }

        System.out.println();

        // Задача 4
        System.out.println("Задача 4");

        for (int index = 0; index < arrInt.length; index++) {
            int add = arrInt[index];

            if (add % 2 != 0) {
                add += 1;
            }

            if (index != arrInt.length - 1) {
                System.out.print(add + ", ");
            } else {
                System.out.println(add);
            }
        }



    }
}
