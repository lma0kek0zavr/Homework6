

public class App {
    public static void main(String[] args) throws Exception {
       
        //Задача №1

        int[] arr1 = generateRandomArray();

        int sum = 0;

        for(int i : arr1) {
            sum += i;
        }

        System.out.printf("Сумма трат за месяц составила %d рублей", sum);

        System.out.println("\n---------------------------");

        //Задача №2

        int[] arr2 = generateRandomArray();

        int minValue = arr2[0];

        int maxValue = arr2[0];

        for(int i : arr2) {
            if(i < minValue) {
                minValue = i;
            }

            if(i > maxValue) {
                maxValue = i;
            }
        }

        System.out.printf("Минимальная сумма трат за неделю составила %d рублей. Максимальная сумма трат за неделю составила %d рублей", minValue, maxValue);

        System.out.println("\n---------------------------");

        //Задача №3

        int[] arr3 = generateRandomArray();

        int totalExpenses = 0;

        for(int i : arr3) {
            totalExpenses += i;
        }

        double averageExpenses = (double)(totalExpenses / arr3.length);

        System.out.printf("Средняя сумма трат за месяц составила %f рублей", averageExpenses);

        System.out.println("\n---------------------------");

        //Задача №4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = 0; i < reverseFullName.length / 2; i++) { 
            char temp = reverseFullName[i];

            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];

            reverseFullName[reverseFullName.length - i - 1] = temp;
        }

        for (char c : reverseFullName) {
            System.out.print(c);
        }
    } 

    public static int[] generateRandomArray() { 
        int[] arr = new int[5];

        java.util.Random random = new java.util.Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
}
