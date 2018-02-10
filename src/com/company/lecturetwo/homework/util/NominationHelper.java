package com.company.lecturetwo.homework.util;

import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;
import com.company.lecturetwo.homework.vo.PersonVO;

import java.util.List;
import java.util.Random;

/**
 * utility class NominationHelper provides methods for nominating awards until one of the limit is reached
 */
public class NominationHelper {

    /**
     * объявление констант. Объявляют в классе в начале
     */
    private final static String NOMINEE_NAME = "Nominee name is ";
    private final static String LIMIT_TYPE_AMOUNT = ". Limit type is by award amount.";
    private final static String AMOUNT_RECEIVED_AWARDS = " Amount of received awards is ";
    private final static String LIMIT_TYPE_QUANTITY = ". Limit type is by award quantity.";
    private final static String NUMBER_RECEIVED_AWARDS = " Number of received awards is ";
    private final static int Z_MIN = -5;
    private final static int Z_MAX = 5;
    //double принято писать с точкой
    private final static double C_MIN = -2.0;
    private final static double C_MAX = 2.0;
    private static String limitName = "";

    //private static Random random = new Random();

    /**
     * public method nominate, который принимает объекты классов NomineeVO и AwardVO
     *
     * @param nominee
     * @param award
     */
    public static void nominate(PersonVO nominee, AwardVO award) {

        //вывод на консоль кому и какого размера выдана аварда
        System.out.println(nominee.getName() + " received " + award.getValue());

        //вызов метода receiveAward параметра nominee
        receiveAward(award);
    }

    /**
     * public method receiveAward, принимающий объект класса Award
     *
     * @param award
     */
    public static void receiveAward(AwardVO award) {
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
     * 3.1 Nominator дает авадру Nominee пока не достигнет nominatorAwardQuantityLimit
     *
     * @param nominator - nominator of the award
     * @param nominee   - nominee of the award
     * @param award     - award for nomination
     */
    public static void doNominateUntilNominatorAwardQuantityLimitReached(PersonVO nominator, PersonVO nominee, AwardVO award) {
        Random random = new Random();
        int counter = 0;
        int newAwardValue = award.getValue() + random.nextInt(50);
        award.setValue(newAwardValue);
        //AwardVO newAward = new AwardVO(newAwardValue);
        //award.setValue(499);
        while (!nominator.isLimitReached(counter, nominator.getAwardQuantityLimit())) {
            //while (counter < nominator.getAwardQuantityLimit()) {
            //nominator.nominate(nominee1, new AwardVO(80);
            //nominate(nominee, new AwardVO(100 + random.nextInt(50)));
            nominate(nominee, award);
            counter++;
            limitName = "NominatorAwardQuantityLimit";
        }

        switchCaseExample5(counter, limitName);

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + counter);

    }

    /**
     * 3.2 Nominator дает авадру Nominee пока не достигнет nominatorAwardAmountLimit
     *
     * @param nominator -  nominator of the award
     * @param nominee   - nominee of the award
     * @param award     - award for nomination
     */
    public static void doNominateUntilNominatorAwardAmountLimitReached(PersonVO nominator, PersonVO nominee, AwardVO award) {

        Random random = new Random();

        int sum = 0;
        do {
            //объявление временной переменной, которая будет использоваться только в do while
            //int value = 100 + random.nextInt(50);
            double soli = random.nextDouble();
            int newAwardValue = award.getValue() + random.nextInt(50);
            award.setValue(newAwardValue);
            //if (sum + value <= nominator.getAwardAmountLimit()) {
            if (sum + award.getValue() <= nominator.getAwardAmountLimit()) {
                nominate(nominee, award);
                //nominate(nominee, new AwardVO(value, soli));
            } else break;
            //sum = sum + value
            sum += award.getValue();
            //sum += value;
            limitName = "NominatorAwardAmountLimit";
        }
        //while (sum < nominator.getAwardAmountLimit());
        while (!nominator.isLimitReached(sum, nominator.getAwardAmountLimit()));

        switchCaseExample5(sum, limitName);

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);
    }

    /**
     * 3.3 Nominator дает авадру Nominee пока не достигнет nomineeAwardQuantityLimit
     *
     * @param nominator - nominator of the award
     * @param nominee   - nominee of the award
     * @param award     - award for nomination
     */
    public static void doNominateUntilNomineeAwardQuantityLimitReached(PersonVO nominator, PersonVO nominee, AwardVO award) {
        Random random = new Random();
        int i;
        int newAwardValue = award.getValue() + random.nextInt(50);
        award.setValue(newAwardValue);
        //for (i = 0; i < nominee.getAwardQuantityLimit(); i++) {
        for (i = 0; !nominee.isLimitReached(i, nominee.getAwardQuantityLimit()); i++) {
            //nominate(nominee, new AwardVO(100 + random.nextInt(50)));
            nominate(nominee, award);
            limitName = "NomineeAwardQuantityLimit";
        }

        switchCaseExample5(i, limitName);

        System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + i);

    }

    /**
     * 3.4 Nominator дает авадру Nominee пока не достигнет nomineeAwardAmountLimit
     *
     * @param nominator - nominator of the award
     * @param nominee   - nominee of the award
     * @param award     - award for nomination
     */
    public static void doNominateUntilNomineeAwardAmountLimitReached(PersonVO nominator, PersonVO nominee, AwardVO award) {
        Random random = new Random();
        int sum = 0;
        int value = 100 + random.nextInt(50);
        int newAwardValue = award.getValue() + random.nextInt(50);
        award.setValue(newAwardValue);
        //while (sum < nominee.getAwardAmountLimit()) {
        while (!nominee.isLimitReached(sum, nominee.getAwardAmountLimit())) {
            nominate(nominee, award);
            //nominate(nominee, new AwardVO(100 + random.nextInt(50)));
            if (sum + value > nominee.getAwardAmountLimit()) {
                break;
            }
            sum += value;
            limitName = "NomineeAwardAmountLimit";
            switchCaseExample5(sum, limitName);
            System.out.println(NOMINEE_NAME + nominee.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);

        }

    }

    /**
     * Method to calculate quantity parameter for each award without soli of each recipients using the formula:
     * quantity = ((Z^2*(P)*(1-P))/(C^2)) / (1 + ((((Z^2*(P)*(1-P ))/(C^2))-1)/population))
     * where:
     * C = a random decimal i.e. 5% = 0.05. We use this range: -2...2
     * population = total count of employee's awards without soli
     * Z = a random whole number i.e. 3. We use this range: -5...5
     * P = award value;
     *
     * @param value      - chosen award value for nomination
     * @param population - total count of employee's awards without soli
     * @return quantity parameter
     */
    public static double calculateQuantity(int value, int population) {
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

    /**
     * Switch case example
     *
     * @param current
     * @param limitname
     */
    public static void switchCaseExample5(int current, String limitname) {
        switch (limitname) {
            case "NominatorAwardQuantityLimit": {
                System.out.println("NominatorAwardQuantityLimit: " + current);
                break;
            }
            case "NominatorAwardAmountLimit": {
                System.out.println("NominatorAwardAmountLimit: " + current);
                break;
            }
            case "NomineeAwardQuantityLimit": {
                System.out.println("NomineeAwardQuantityLimit: " + current);
                break;
            }
            case "NomineeAwardAmountLimit": {
                System.out.println("NomineeAwardAmountLimit: " + current);
                break;
            }
            default: {
                System.out.println("default");
            }
        }
    }

    public static void printAwards(List<AwardVO> awards, String type) {
        //перебираем все объекты типа AwardVO из листа awards. award - промежуточная переменная для обращения к текущему объекту
        for (AwardVO award : awards) {
            if (award.getType().equals(type)) {
                System.out.println(award);
            }

        }
    }

}

