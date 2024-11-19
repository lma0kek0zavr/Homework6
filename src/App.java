import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Задача №1

        int[] intArr = new int[]{1, 2, 3};

        float[] floatArr = {1.57F, 7.654F, 9.986F};

        boolean[] boolArr = {true, false, true};

        //Задача №2

        if (intArr.length >= 1) {
            System.out.print(intArr[0]);
        }
        for(int i = 1; i <= intArr.length - 1; i++) { 
            System.out.print(", " + intArr[i]);
        }

        System.out.println();

        if (floatArr.length >= 1) {
            System.out.print(floatArr[0]);
        }
        for(int i = 1; i <= floatArr.length - 1; i++) { 
            System.out.print(", " + floatArr[i]);
        }

        System.out.println();

        if (boolArr.length >= 1) {
            System.out.print(boolArr[0]);
        }
        for(int i = 1; i <= boolArr.length - 1; i++) { 
            System.out.print(", " + boolArr[i]);
        }

        System.out.println("\n------------------");

        //Задача №3

        if (intArr.length >= 1) {
            System.out.print(intArr[intArr.length - 1]);
        }
        for(int i = intArr.length - 2; i >= 0; i--) { 
            System.out.print(", " + intArr[i]);
        }

        System.out.println();

        if (floatArr.length >= 1) {
            System.out.print(floatArr[floatArr.length - 1]);
        }
        for(int i = floatArr.length - 2; i >= 0; i--) { 
            System.out.print(", " + floatArr[i]);
        }

        System.out.println();

        if (boolArr.length >= 1) {
            System.out.print(boolArr[boolArr.length - 1]);
        }
        for(int i = boolArr.length - 2; i >= 0; i--) { 
            System.out.print(", " + boolArr[i]);
        }

        System.out.println("\n------------------");

        //Задача №4

        System.out.println(Arrays.toString(intArr));

        for(int i = 0; i < intArr.length; i++) { 
            if (intArr[i] % 2 != 0) { 
                intArr[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArr));
    } 
}
