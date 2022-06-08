public class Main {
    public static void main(String[] args) {
    // Задание 1
        byte carYear = 2;
        short people = 1000;
        int table = 555555;
        long stars = 123456789L;
        float sugarWeight = 3.7f;
        double potatoWeight = 10.55;
        char bar = 35;
        boolean carIsNew = carYear < 1;

    // Задание 2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float weightOfAllBoxers = boxerWeight1 + boxerWeight2;
        float weightDifferenceOfBoxers = boxerWeight2 - boxerWeight1;
        System.out.println ("Общий вес боксеров составляет: " + weightOfAllBoxers + " кг");
        System.out.println ("Разница в весе боксеров составляет: " + weightDifferenceOfBoxers + " кг");

    // Задание 3
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte freshEggWeight = 70;
        int sportBreakfastWeightInGrams = bananaWeight * 5 + milkWeight * 2 + iceCreamWeight * 2 + freshEggWeight * 4;
        float sportBreakfastWeightInKilograms = sportBreakfastWeightInGrams / 1000f;
        System.out.println ("Вес спортивного завтрака состовляет: " + sportBreakfastWeightInGrams + " грамм. Или " + sportBreakfastWeightInKilograms + " килограмм.");

    // Задание 4
        short loseWeightInKilograms = 7;
        int loseWeightInGrams = loseWeightInKilograms * 1000;
        int needDaysFor250Grams = loseWeightInGrams / 250;
        int needDaysFor500Grams = loseWeightInGrams / 500;
        int averageNumberOfDays = (needDaysFor250Grams + needDaysFor500Grams) / 2;
        System.out.println ("Если спортсмен худеет по 250 грамм нужно " + needDaysFor250Grams + " дней, а если худеет по 500 грамм то нужно " + needDaysFor500Grams + " дней. Среднее же количество дней равно: " + averageNumberOfDays);

    // Задание 5
        int mashaSalaryNow = 67760;
        int mashaAnnualIncomeNow = mashaSalaryNow * 12;
        int denisSalaryNow = 83690;
        int denisAnnualIncomeNow = denisSalaryNow * 12;
        int kristinaSalaryNow = 76230;
        int kristinaAnnualIncomeNow = kristinaSalaryNow * 12;
        float mashaSalaryAfter = mashaSalaryNow * 1.1f;
        float mashaAnnualIncomeAfter = mashaSalaryAfter * 12f;
        float denisSalaryAfter = denisSalaryNow * 1.1f;
        float denisAnnualIncomeAfter = denisSalaryAfter * 12f;
        float kristinaSalaryAfter = kristinaSalaryNow * 1.1f;
        float kristinaAnnualIncomeAfter = kristinaSalaryAfter * 12f;
        float mashaAnnualDifference = mashaAnnualIncomeAfter - mashaAnnualIncomeNow;
        float denisAnnualDifference = denisAnnualIncomeAfter - denisAnnualIncomeNow;
        float kristinaAnnualDifference = kristinaAnnualIncomeAfter - kristinaAnnualIncomeNow;
        System.out.println ("Маша теперь получает " + mashaSalaryAfter + " рублей. Годовой доход вырос на " + mashaAnnualDifference + " рублей.");
        System.out.println ("Денис теперь получает " + denisSalaryAfter + " рублей. Годовой доход вырос на " + denisAnnualDifference + " рублей.");
        System.out.println ("Кристина теперь получает " + kristinaSalaryAfter + " рублей. Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");




    }
}