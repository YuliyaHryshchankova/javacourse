package com.company.lecturetwo.homework.util;

import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;

import java.util.Random;

/**
 * utility class NominationHelper provides methods for nominating awards until one of the limit is reached
 */

public class NominationHelper {

    private final static String NOMINEE_NAME = "Nominee name is ";
    private final static String LIMIT_TYPE_AMOUNT = ". Limit type is by award amount.";
    private final static String AMOUNT_RECEIVED_AWARDS = " Amount of received awards is ";
    private final static String LIMIT_TYPE_QUANTITY = ". Limit type is by award quantity.";
    private final static String NUMBER_RECEIVED_AWARDS = " Number of received awards is ";

    //private static Random random = new Random();

    /**
     * публичный метод receiveAward, принимающий объект класса Award
     *
     * @param award
     */
    public static void receiveAward(AwardVO award) {
        Random random = new Random();
        double soli = award.getSoli();
        int value = award.getValue();
        //если задано soli, то пересчитываем value и выводим запись об этом
        if (soli > 0 && soli != 1) {
            double newValue = value * soli;
            System.out.println("Recalculated award value is " + newValue + ".\n" + "Soli value is " + soli + ".");
            //оббъявление переменной difference
            double difference;
            //если soli < 1, то считаем потерю и выводим в консоль
            if (soli < 1) {
                difference = (1 - soli) * 100;
                System.out.println("Award value reduced by " + difference + "%");
            } else {
                //если soli > 1, то считаем, на сколько увеличилась value и выводим разницу в консоль
                difference = (soli - 1) * 100;
                System.out.println("Award value increased by " + difference + "%");

            }

        } else {
            //вывод значения аварды на консоль
            System.out.println("Award value is " + value + ".\n" + "There is no recalculation.");
        }

        System.out.println("-----------");
    }


    /**
     * 3.2 Nominator дает авадру Nominee пока не достигнет nominatorAwardAmountLimit
     *
     * @param nominator
     * @param nominee
     */
    public static void doNominateUntilNominatorAwardAmountLimitReached(NominatorVO nominator, NomineeVO nominee) {

        Random random = new Random();

        int sum = 0;
        do {
            //объявление временной переменной, которая будет использоваться только в do while
            int value = 100 + random.nextInt(50);
            double soli = random.nextDouble();
            if (sum + value <= nominator.getNominatorAwardAmountLimit()) {
                nominator.nominate(nominee, new AwardVO(value, soli));
            } else break;
            //sum = sum + value
            sum += value;
        }
        while (sum < nominator.getNominatorAwardAmountLimit());

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);
    }


    /**
     * 3.1 Nominator дает авадру Nominee пока не достигнет nominatorAwardQuantityLimit
     */
    public static void doNominateUntilNominatorAwardQuantityLimitReached(NominatorVO nominator, NomineeVO nominee) {
        Random random = new Random();
        int counter = 0;
        while (counter < nominator.getNominatorAwardQuantityLimit()) {
            //nominator.nominate(nominee1, new AwardVO(80);
            nominator.nominate(nominee, new AwardVO(100 + random.nextInt(50)));
            counter++;

        }

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + counter);

    }


    /**
     * 3.3 Nominator дает авадру Nominee пока не достигнет nomineeAwardQuantityLimit
     */
    public static void doNominateUntilNomineeAwardQuantityLimitReached(NominatorVO nominator, NomineeVO nominee) {
        Random random = new Random();
        int i;
        for (i = 0; i < nominee.getNomineeAwardQuantityLimit(); i++) {
            nominator.nominate(nominee, new AwardVO(100 + random.nextInt(50)));
        }

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + i);

    }


    /**
     * 3.4 Nominator дает авадру Nominee пока не достигнет nomineeAwardAmountLimit
     */

    public static void doNominateUntilNomineeAwardAmountLimitReached(NominatorVO nominator, NomineeVO nominee) {
        Random random = new Random();
        int sum = 0;
        int value = 100 + random.nextInt(50);
        while (sum < nominee.getNomineeAwardAmountLimit()) {
            nominator.nominate(nominee, new AwardVO(100 + random.nextInt(50)));
            if (sum + value > nominee.getNomineeAwardAmountLimit()) {
                break;
            }
            sum += value;

            System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);

        }

    }


}

