package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;

import java.util.Random;

public class NominatorTest {

    //объявление констант. Объявляют в классе в начале
    public final static int Z_MIN = -5;
    public final static int Z_MAX = 5;
    //double принято писать с точкой
    public final static double C_MIN = -2.0;
    public final static double C_MAX = 2.0;

    public static void main(String[] args) {
        NominatorVO nominator = new NominatorVO("Tom");
        NomineeVO nominee1 = new NomineeVO("Dave");
        NomineeVO nominee2 = new NomineeVO("Alex");
        NomineeVO nominee3 = new NomineeVO("Kris");

        // ------ Dave awards

        nominator.nominate(nominee1, new AwardVO(45, 0.75));
        nominator.nominate(nominee1, new AwardVO(70, 1.03));

        // ------ Alex awards

        AwardVO alexAward1 = new AwardVO(150);
        AwardVO alexAward2 = new AwardVO(100);
        AwardVO alexAward3 = new AwardVO(75);

        nominator.nominate(nominee2, alexAward1);
        nominator.nominate(nominee2, alexAward2);
        nominator.nominate(nominee2, alexAward3);

        double alexQuantity1 = calculateQuantity(alexAward1.getValue(), 3);
        double alexQuantity2 = calculateQuantity(alexAward2.getValue(), 3);
        double alexQuantity3 = calculateQuantity(alexAward3.getValue(), 3);

        nominator.nominate(nominee2, new AwardVO(320, 1.40));

        // ----- Kris awards ---------
        nominator.nominate(nominee3, new AwardVO(100, 0.23));
        nominator.nominate(nominee3, new AwardVO(25, 1.5));

        System.out.println("Quantity of Alex's award1 is " + alexQuantity1);
        System.out.println("Quantity of Alex's award2 is " + alexQuantity2);
        System.out.println("Quantity of Alex's award3 is " + alexQuantity3);

        System.out.println("Quantity of Alex's award1 is " + (alexQuantity1 > alexQuantity2 ? "greater than" : (alexQuantity1 == alexQuantity2) ? "equal to" : "less than") + " quantity of Alex's award2.");

    }

    //статический метод раcчета quantity
    static double calculateQuantity(int value, int population) {
        //объявление переменных для расчета quantity
        Random random = new Random();
        //https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range
        double c = C_MIN + (C_MAX - C_MIN) * random.nextDouble();
        int z = Z_MIN + random.nextInt(Z_MAX - Z_MIN);
        //все статические методы можно вызывать из класса, не создавая объекта, т.к. они принадлежат всему классу
        //Math.pow(z, 2) - возведение в квадрат объекта z
        double a = (Math.pow(z, 2) * value * (1 - value)) / Math.pow(c, 2);
        double quantity = a / (1 + ((a - 1) / population));
        return quantity;

    }

}
