public class Main {

    public static void main(String[] args) {
        //Задание 1
        byte legs = 2;
        short centuria = 10;
        int cohort = 6;
        long l1 = 1_000_000_000L;
        float f1 = 1.5f;
        double d1 = 1_000.23;
        boolean legio = cohort == 6;
        char ch1 = 33;
        System.out.printf("out: %S %d %d %d %d %f %f %s %n", legio, legs, centuria, cohort, l1, f1, d1, ch1);

        //задание2
         double w1 = 78.2;
         double w2 = 82.7;
         double total = w1 + w2;
         var dif = w2 % w1;
         System.out.println("Общий вес боксеров - " + total + " Разница их весов составляет" + dif);

         //Задание3
        short b = 80;
        short m100 = 105;
        short ic = 100;
        short egg = 70;
        int allB = 5*b;
        int allM = 2*m100;
        int allIc = 2*ic;
        int allEgg = 4*egg;
        int weightG = allB + allM + allIc + allEgg;
        double weightKg = weightG/1000.0;
        System.out.println("Общий вес равен " + weightKg + " КГ");


        //Задание4
        int loseF = 500;
        int loseS = 250;
        int targetKg = 7;
        int TargetG = targetKg*1000;
        int daysF = TargetG/loseF;
        int daysS = TargetG/loseS;
        int average = (daysF + daysS)/2;
        System.out.println("Потребуется дней при сбрасывании 250 г.: " + daysS + ", потребуется дней при сбрасывании 500 г.: " + daysF + ". В среднем потребуется дней " + average);

        //Задание5
        int m = 67_760;
        int d = 83_690;
        int k = 76_230;
        double index = 0.1;
        double mi = m + m*index;
        double di = d + d*index;
        double ki = k + k*index;
        int mpy = m*12;
        int dpy = d*12;
        int kpy = k*12;
        double mipy = mi*12;
        double dipy = di*12;
        double kipy = ki*12;
        double diffm = mipy - mpy;
        double diffd = dipy - dpy;
        double diffk = kipy - kpy;
        System.out.println("Маша теперь получает " + mi + " рублей. Ее годовой доход вырос на " + diffm + " рублей.");
        System.out.println("Денис теперь получает " + di + " рублей. Его годовой доход вырос на " + diffd + " рублей.");
        System.out.println("Кристина теперь получает " + ki + " рублей. Ее годовой доход вырос на " + diffk + " рублей.");

     }
}