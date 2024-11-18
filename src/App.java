public class App {
    public static void main(String[] args) throws Exception {
        
        //Задача №1

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i);
        }

        //Задача №2

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Задача №3

        for (int i = 0; i <= 17; i += 2) { 
            System.out.println(i);
        }

        //Задача №4

        for(int i = 10; i >= -10; i--) { 
            System.out.println(i);
        }

        //Задача №5

        for (int i = 1904; i <= 2096; i += 4) { 
            System.out.printf("\n%d год является високосным", i);
        }

        //Задача №6

        for (int i = 7; i <= 98; i += 7) {
            System.out.printf("%c%d%c", ' ', i, ' ');
        }

        //Задача №7

        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%c%d%c", ' ', i, ' ');
        }

        //Задача №8

        int savingSum = 29000;

        int totalSavings = 0;

        for (int i = 1; i <= 12; i++) { 
            totalSavings += savingSum;

            System.out.printf("\nМесяц %d, сумма накоплений равна %d рублей", i, totalSavings);
        }

        //Задача №9

        int savingSum_2 = 29000;

        int totalSavings_2 = 0;

        float percentage = 1.01F;

        for (int i = 1; i <= 12; i++) { 
            totalSavings_2 += savingSum_2;

            totalSavings_2 *= percentage;

            System.out.printf("\nМесяц %d, сумма накоплений равна %d рублей", i, totalSavings_2);
        }

        //Задача №10

        for(int i = 1; i <= 10; i++) { 
            System.out.printf("\n2 * %d = %d", i, i * 2);
        }
    }
}
