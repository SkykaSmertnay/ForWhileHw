public class Main {
    public static void main(String[] args) {
        //Задание №1
        System.out.println("\nЗадание №1");
        int bank = 0;
        int month = 1;

        while (bank < 2_469_000){
            bank = bank + 15000;
            System.out.println("Месяц " + month + " сумма накоплений равна " + bank + " рублей");
            month++;
        }
        //Задание №2
        System.out.println("\nЗадание №2");
        int j=0;
        while (j < 10){
            j++;
            System.out.print(j + " ");

        }
        System.out.println();

        for (;j >= 1 ; j--){
            System.out.print(j + " ");
        }
        //Задание №3
        System.out.println("\nЗадание №3");
        int populationY = 12_000_000;
        int birthPer1000 = 17;
        int deathPer1000 = 8;
        int populationGrowthPer1000 = birthPer1000 - deathPer1000;
        int totalPopulationGrowth = populationY / 1000 * populationGrowthPer1000;
        int year = 0;
        while (year != 10){
            populationY = populationY + totalPopulationGrowth;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + populationY);
        }
        //Задание №4
        System.out.println("\nЗадание №4");
        int bank1 = 15000;
        int monthCounter1 = 0;
        while (bank1 <= 12_000_000){
            bank1 = (int) (bank1 * 1.07);
            monthCounter1++;
            System.out.println("Месяц " + monthCounter1 + " наколения состовляют " + bank1 + " рублей");
        }
        //Задание №5
        System.out.println("\nЗадание №5");
        int bank2 = 15000;
        int monthCounter2 = 0;
        while (bank2 <= 12_000_000){
            bank2 = (int) (bank2 * 1.07);
            monthCounter2++;
            if (monthCounter2 % 6 == 0) {
                System.out.println("Месяц " + monthCounter2 + " наколения состовляют " + bank2 + " рублей");
            }
        }
        //Задание №6
        System.out.println("\nЗадание №6");
        int bank3 = 15000;
        int monthCounter3 = 0;
        while (monthCounter3 <= 108 ) {
            bank3 = (int) (bank3 * 1.07);
            monthCounter3++;
            if (monthCounter3 % 6 == 0) {
                System.out.println("Месяц " + monthCounter3 + " наколения состовляют " + bank3 + " рублей");
            }
        }
        //Задание №7
        System.out.println("\nЗадание №7");
        int friday = 6;
        int dayToday = 1;
        while (dayToday < 31) {
            if (dayToday == friday) {
                System.out.println("Сегодня пятница " + friday + "-e число");
                friday = friday + 7;
            }
            dayToday++;
        }
        //Задание №8
        System.out.println("\nЗадание №8");
        int cometYear = 79;
        int startYear = 1825;
        int endYear = 2125;
        int year1 = startYear;
        while (year1 < endYear) {
            if (year1 % cometYear == 0){
                System.out.println(year1);
            }
            year1++;
        }

    }
}