public class Main {
    public static void main(String[] args) {
        //Переменные второй урок
        //1.
        int x = 2;
        byte a = 4;
        short b = 6;
        long myNum = 10L;
        float floatNum = 3.3f;
        double doubleNum = 5.2;
        System.out.println("Значение переменной x с типом int равно " +x);
        System.out.println("Значение переменной a с типом byte равно " +a);
        System.out.println("Значение переменной b с типом short равно " +b);
        System.out.println("Значение переменной myNum с типом long равно " +myNum);
        System.out.println("Значение переменной floatNum с типом float равно " +floatNum);
        System.out.println("Значение переменной doubleNum с типом double равно " +doubleNum);

        //2
        double d = 27.12;
        long l =  987678965549L;
        float f = 2.786f;
        boolean truefalse = false;
        short i = 569;
        int z = -159;
        int w = 27897;
        byte s = 67;

        //3
        int classAnna = 27;
        int classLyudmila = 23;
        int classEkaterina = 30;
        int classSum = classAnna+classLyudmila+classEkaterina;
        int paper = 480;
        int paperPerPerson = paper/classSum;
        System.out.println("На каждого ученика рассчитано "+paperPerPerson+" листов бумаги.");

        //4
        int bottlesInTwoMins = 16;
        int bottlesInOneMin = bottlesInTwoMins/2;
        int bottlesInTwentyMins = bottlesInTwoMins*10;
        int minutesPerHour = 60;
        int hoursPerDay= 24;
        int minutesInOneDay= minutesPerHour*hoursPerDay;
        int bottlesInOneDay = bottlesInOneMin*minutesInOneDay;
        int bottlesInThreeDays = bottlesInOneDay*3;
        int bottlesInOneMonth = bottlesInOneDay*30;
        System.out.println("За 20 минут машина производит "+bottlesInTwentyMins+" бутылок.");
        System.out.println("За сутки  машина производит "+bottlesInOneDay+" бутылок.");
        System.out.println("За трое суток машина производит "+bottlesInThreeDays+" бутылок.");
        System.out.println("За месяц машина производит "+bottlesInOneMonth+" бутылок.");

        //5.
        int paintBottles = 120;
        int whiteBottlesForOneClass = 2;
        int brownBottlesForOneClass = 4;
        int bottlesForOneClass = whiteBottlesForOneClass+brownBottlesForOneClass;
        int howManyClasses = paintBottles/bottlesForOneClass;
        int howManyWhitePaint = howManyClasses*whiteBottlesForOneClass;
        int howManyBrownPaint = howManyClasses*brownBottlesForOneClass;
        System.out.println("В школе, где "+howManyClasses+" классов, нужно "+ howManyWhitePaint+" банок белой и " + howManyBrownPaint+
                " банок коричневой краски.");

        //6.
        int bananaWeightGramms=80;
        int milkWeightGrammsOneHundredMl=105;
        int iceCreamWeightGramms=100;
        int eggWeightGramms=70;

        int bananaRecept= bananaWeightGramms*5;
        int milkRecept= milkWeightGrammsOneHundredMl*2;
        int iceCreamRecept= iceCreamWeightGramms*2;
        int eggRecept= eggWeightGramms*4;

        int breakfastWeightGramms= bananaRecept+milkRecept+iceCreamRecept+eggRecept;
        double breakfastWeightKg=breakfastWeightGramms/(double)breakfastWeightGramms;
        System.out.println("Вес спортивного завтрака "+breakfastWeightKg+" кг.\n");

        //7.
        int looseWeightKg = 7;
        float looseWeightKgA = 0.25f;
        float looseWeightKgB = 0.5f;
        float howManyDaysA = looseWeightKg/looseWeightKgA;
        float howManyDaysB= looseWeightKg/looseWeightKgB;
        System.out.println("На похудение уйдет "+howManyDaysA+" дня");
        System.out.println("На похудение уйдет "+howManyDaysB+ " дня\n");

        //8.
        int salaryMasha= 67760;
        int salaryDenis= 83690;
        int salaryKristina= 76230;
        double salaryIncrease=0.1;
        double salaryIncreaseMasha= salaryMasha*salaryIncrease+salaryMasha;
        double salaryIncreaseDenis= salaryDenis*salaryIncrease+salaryDenis;
        double salaryIncreaseKristina= salaryKristina*salaryIncrease+salaryKristina;

        System.out.println("ЗП Маши после повышения "+salaryIncreaseMasha+" руб.");
        System.out.println("ЗП Дениса после повышения "+salaryIncreaseDenis+" руб.");
        System.out.println("ЗП Кристины после повышения "+salaryIncreaseKristina+" руб.\n");

        int oneYearIncomeMasha= salaryMasha*12;
        int oneYearIncomeDenis= salaryDenis*12;
        int oneYearIncomeKristina= salaryKristina*12;

        System.out.println("Годовой доход Маши до повышения "+oneYearIncomeMasha+" руб.");
        System.out.println("Годовой доход Дениса до повышения "+oneYearIncomeDenis+" руб.");
        System.out.println("Годовой доход Кристины до повышения "+oneYearIncomeKristina+" руб.\n");

        double oneYearIncomeIncreasedMasha= salaryIncreaseMasha*12;
        double oneYearIncomeIncreasedDenis= salaryIncreaseDenis*12;
        double oneYearIncomeIncreasedKristina= salaryIncreaseKristina*12;
        System.out.println();
        System.out.println("Годовой доход Маши после повышения "+oneYearIncomeIncreasedMasha+" руб.");
        System.out.println("Годовой доход Дениса после повышения "+oneYearIncomeIncreasedDenis+" руб.");
        System.out.println("Годовой доход Кристины после повышения "+oneYearIncomeIncreasedKristina+" руб.");

        double oneYearIncomeDifferenceMasha = oneYearIncomeIncreasedMasha-oneYearIncomeMasha;
        double oneYearIncomeDifferenceDenis = oneYearIncomeIncreasedDenis-oneYearIncomeDenis;
        double oneYearIncomeDifferenceKristina = oneYearIncomeIncreasedKristina-oneYearIncomeKristina;
        System.out.println("Годовой доход Маши вырос на "+oneYearIncomeDifferenceMasha+" рублей.");
        System.out.println("Годовой доход Дениса вырос на "+oneYearIncomeDifferenceDenis+" рублей.");
        System.out.println("Годовой доход Кристины вырос на "+oneYearIncomeDifferenceKristina+" рублей.");


    }
}