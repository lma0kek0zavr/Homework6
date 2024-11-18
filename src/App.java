
public class App {
    public static void main(String[] args) throws Exception {
        //Задача №1

        int initialSum = 0;

        int requiredSum = 2459000;

        int amountOfSavings = 15000;

        int months = 0;

        while (initialSum < requiredSum) {
            initialSum += amountOfSavings;
            months++;
        }

        System.out.printf("Месяц %d сумма накоплений равна %d", months, initialSum);

        //Задача №2

        int toGreatest = 1;

        int toSmallest = 10;

        while (toGreatest <= 10) {
            System.out.printf("%c%d%c", ' ', toGreatest, ' ');
            toGreatest++;
        }

        System.out.println("\n");

        for (; toSmallest >= 1; toSmallest--) {
            System.out.printf("%c%d%c", ' ', toSmallest, ' ');
        }

        //Задача №3

        int nationalPopulation = 12000000;

        int birthRate = 17;

        int deathRate = 8;

        int years = 0;

        int populationGrowth = birthRate - deathRate;

        for (int i = 0; i <= 10; i++) {
            nationalPopulation += (nationalPopulation * populationGrowth / 1000);

            years++;

            System.out.printf("\nГод %d численность населения составляет %d", years, (int)nationalPopulation);
        }

        //Задача №4

        int initialDepositAmout = 15000;

        int targetDepositAmout = 12000000;

        float depositRate = 0.07f;

        for(int i = 0; initialDepositAmout <= targetDepositAmout; i++) { 
            initialDepositAmout += initialDepositAmout * depositRate;

            System.out.printf("\nМесяц %d сумма накоплений равна %d", i, (int)initialDepositAmout);
        }

        //Задача №5

        int initialDepositAmout2 = 15000;

        int targetDepositAmout2 = 12000000;

        float depositRate2 = 0.07f;

        for(int i = 0; initialDepositAmout2 <= targetDepositAmout2; i++) { 
            initialDepositAmout2 += initialDepositAmout2 * depositRate2;

            if (i % 6 == 0 && i != 0) {
                System.out.printf("\nМесяц %d сумма накоплений равна %d", i, (int)initialDepositAmout2);
            }
        }

        //Задача №6

        int initialDepositAmout3 = 15000;

        float depositRate3 = 0.07f;

        int monthsInYears = 12 * 9;

        for(int i = 0; i <= monthsInYears; i++) { 
            initialDepositAmout3 += initialDepositAmout3 * depositRate3;

            if (i % 6 == 0 && i != 0) {
                System.out.printf("\nМесяц %d сумма накоплений равна %d", i, (int)initialDepositAmout3);
            }
        }

        //Задача №7

        int reportingDay = 5;

        for (int i = 1; i <= 31; i++) {
            if (reportingDay % 5 == 0 && reportingDay <= 31) {
                System.out.printf("\n Сегодня пятница %d-е число. Необходимо подготовить отчет", reportingDay);
            }  

            reportingDay++;
        }

        //Задача №8

        int initialYear = 2024;

        int pastYears = initialYear - 200;

        int nextYears = initialYear + 100;

        for (int i = pastYears; i <= nextYears; i++) { 
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    } 
}
