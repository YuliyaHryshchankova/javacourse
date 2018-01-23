package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.util.NominationHelper;
import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;


/**
 *
 */
public class Lecture4Test {

    /**
     * @param args
     */
    public static void main(String[] args) {

        NominatorVO nominator = new NominatorVO("Tom", 5, 500);
        NomineeVO nominee1 = new NomineeVO("Dave", 5, 500);
        AwardVO award = new AwardVO(100);

        /**
         * 3.1 Nominator дает авадру Nominee пока не достигнет nominatorAwardQuantityLimit
         */
        NominationHelper.doNominateUntilNominatorAwardQuantityLimitReached(nominator, nominee1, award);

       award.setValue(100);

        /**
         * 3.2 Nominator дает авадру Nominee пока не достигнет nominatorAwardAmountLimit
         */
        NominationHelper.doNominateUntilNominatorAwardAmountLimitReached(nominator, nominee1, award);

        award.setValue(100);

        /**
         * 3.3 Nominator дает авадру Nominee пока не достигнет nomineeAwardQuantityLimit
         */
        NominationHelper.doNominateUntilNomineeAwardQuantityLimitReached(nominator, nominee1, award);

        award.setValue(100);

        /**
         * 3.4 Nominator дает авадру Nominee пока не достигнет nomineeAwardAmountLimit
         */
       NominationHelper.doNominateUntilNomineeAwardAmountLimitReached(nominator, nominee1, award);

    }

}
    /*public static void mainOLD(String[] args) {

        NominatorVO nominator = new NominatorVO("Tom", 5, 500);
        NomineeVO nominee1 = new NomineeVO("Dave", 5, 500);

        //String limitName = "";

        //3.1 Nominator дает авадру Nominee пока не достигнет nominatorAwardQuantityLimit

        //NominationHelper.doNominateUntilNominatorAwardQuantityLimitReached(nominator, nominee1);

        /*int counter = 0;
        while (counter < nominator.getNominatorAwardQuantityLimit()) {
            //nominator.nominate(nominee1, new AwardVO(80);
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
            counter++;
            limitName = "NominatorAwardQuantityLimit";
        }
        //switchCaseExample(counter, limitName);
        switchCaseExample5 (counter, limitName);

        System.out.println(NOMINEE_NAME + nominee1.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + counter);*/

        //3.2 Nominator дает авадру Nominee пока не достигнет nominatorAwardAmountLimit

        //NominationHelper.doNominateUntilNominatorAwardAmountLimitReached(nominator, nominee1);

       /*int sum = 0;
        do {
            //объявление временной переменной, которая будет использоваться только в do while
            int value = 100 + random.nextInt(50);
            if (sum + value <= nominator.getNominatorAwardAmountLimit()) {
                nominator.nominate(nominee1, new AwardVO(value));
            } else break;
            //sum = sum + value
            sum += value;
            limitName = "NominatorAwardAmountLimit";
        }
        while (sum < nominator.getNominatorAwardAmountLimit());

        //switchCaseExample2(sum, limitName);
        switchCaseExample5 (sum, limitName);
        System.out.println(NOMINEE_NAME + nominee1.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);*/

        //3.3 Nominator дает авадру Nominee пока не достигнет nomineeAwardQuantityLimit

        //NominationHelper.doNominateUntilNomineeAwardQuantityLimitReached(nominator, nominee1);

        /*int i;
        for (i = 0; i < nominee1.getNomineeAwardQuantityLimit(); i++) {
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
            limitName = "NomineeAwardQuantityLimit";
        }

        //switchCaseExample3(i, limitName);
        switchCaseExample5 (i, limitName);
        System.out.println(NOMINEE_NAME + nominee1.getName() + LIMIT_TYPE_QUANTITY + NUMBER_RECEIVED_AWARDS + i);*/

        //3.4 Nominator дает авадру Nominee пока не достигнет nomineeAwardAmountLimit
        //объявление нет, т.к выше объявили уже

        //NominationHelper.doNominateUntilNomineeAwardAmountLimitReached(nominator, nominee1);

        /*int sum = 0;
        int value = 100 + random.nextInt(50);
        while (sum < nominee1.getNomineeAwardAmountLimit()) {
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
            if (sum + value > nominee1.getNomineeAwardAmountLimit()) {
                break;
            }
            sum += value;
            limitName = "NomineeAwardAmountLimit";
        }

        //switchCaseExample4(sum, limitName);
        switchCaseExample5 (sum, limitName);
        System.out.println(NOMINEE_NAME + nominee1.getName() + LIMIT_TYPE_AMOUNT + AMOUNT_RECEIVED_AWARDS + sum);

    }*/

    /*  switchCaseExample();
    public static void switchCaseExample(int current, String limitname) {
        //  String s = "ab";
        switch (limitname) {
            case "NominatorAwardQuantityLimit": {
                System.out.println("NominatorAwardQuantityLimit: " + current);
                break;
            }
            default: {
                System.out.println("default");
            }
        }

    }

    public static void switchCaseExample2(int current, String limitname) {
        switch (limitname) {
            case "NominatorAwardAmountLimit": {
                System.out.println("NominatorAwardAmountLimit: " + current);
                break;
            }
            default: {
                System.out.println("default");
            }
        }

    }

    public static void switchCaseExample3(int current, String limitname) {
        switch (limitname) {
            case "NomineeAwardQuantityLimit": {
                System.out.println("NomineeAwardQuantityLimit: " + current);
                break;
            }
            default: {
                System.out.println("default");
            }
        }

    }

    public static void switchCaseExample4(int current, String limitname) {
        switch (limitname) {
            case "NomineeAwardAmountLimit": {
                System.out.println("NomineeAwardAmountLimit: " + current);
                break;
            }
            default: {
                System.out.println("default");
            }
        }

    }*/

    //все case  в один метод можно
    /*public static void switchCaseExample5(int current, String limitname) {
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
    }*/

