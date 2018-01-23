package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.util.NominationHelper;
import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;


/**
 *
 */
public class NominatorTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        NominatorVO nominator = new NominatorVO("Tom");
        NomineeVO nominee1 = new NomineeVO("Dave");
        NomineeVO nominee2 = new NomineeVO("Alex");
        NomineeVO nominee3 = new NomineeVO("Kris");

        // ------ Dave awards

        NominationHelper.nominate(nominee1, new AwardVO(45, 0.75));
        NominationHelper.nominate(nominee1, new AwardVO(70, 1.03));

        // ------ Alex awards

        AwardVO alexAward1 = new AwardVO(150);
        AwardVO alexAward2 = new AwardVO(100);
        AwardVO alexAward3 = new AwardVO(75);

        NominationHelper.nominate(nominee2, alexAward1);
        NominationHelper.nominate(nominee2, alexAward2);
        NominationHelper.nominate(nominee2, alexAward3);

        double alexQuantity1 = NominationHelper.calculateQuantity(alexAward1.getValue(), 3);
        double alexQuantity2 = NominationHelper.calculateQuantity(alexAward2.getValue(), 3);
        double alexQuantity3 = NominationHelper.calculateQuantity(alexAward3.getValue(), 3);

        NominationHelper.nominate(nominee2, new AwardVO(320, 1.40));

        // ----- Kris awards ---------
        NominationHelper.nominate(nominee3, new AwardVO(100, 0.23));
        NominationHelper.nominate(nominee3, new AwardVO(25, 1.5));

        System.out.println("Quantity of Alex's award1 is " + alexQuantity1);
        System.out.println("Quantity of Alex's award2 is " + alexQuantity2);
        System.out.println("Quantity of Alex's award3 is " + alexQuantity3);

        System.out.println("Quantity of Alex's award1 is " + (alexQuantity1 > alexQuantity2 ? "greater than" : (alexQuantity1 == alexQuantity2) ? "equal to" : "less than") + " quantity of Alex's award2.");
        System.out.println("Quantity of Alex's award1 is" + ((alexQuantity2 != alexQuantity1)  ? " not equal" : " equal") + " to award2 and award3.");
        System.out.println("Quantity of Alex's award1 is" + ((alexQuantity1 > alexQuantity2) && (alexQuantity1 > alexQuantity3) ? " the biggest." : " not the biggest."));
        if (alexQuantity1 > alexQuantity2 || alexQuantity1 > alexQuantity3){
            System.out.println("Quantity of Alex's award1 is not the smallest.");
        }

    }

}
