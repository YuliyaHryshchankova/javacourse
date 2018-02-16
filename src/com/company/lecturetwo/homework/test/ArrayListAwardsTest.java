package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.exc.AwardException;
import com.company.lecturetwo.homework.util.NominationHelper;
import com.company.lecturetwo.homework.vo.AwardVO;

import java.util.*;

/**
 * class ArrayListAwardsTest - Lecture 11
 */
public class ArrayListAwardsTest {

    /**
     * Main method that contains tests for collections
     *
     * @param args
     */
    public static void main(String[] args) {

        //set of ids
        Set<Integer> ids = new HashSet<>();
        for (int i = 1; i < 100; i++) {
            ids.add(i);
        }

        //iterator - iterates through the elements of collection
        Iterator<Integer> iter = ids.iterator();

        //list of award
        List<AwardVO> awardList = new ArrayList<>();

        //populating list of awards
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(100, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(150, AwardVO.TYPE_NON_CASH, iter.next()));
        awardList.add(new AwardVO(75, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(50, AwardVO.TYPE_NON_CASH, iter.next()));
        awardList.add(new AwardVO(80, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(250, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(100, AwardVO.TYPE_NON_CASH, iter.next()));
        awardList.add(new AwardVO(175, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(0, AwardVO.TYPE_THANK_YOU, iter.next()));
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(100, AwardVO.TYPE_CASH, iter.next()));
        awardList.add(new AwardVO(0, AwardVO.TYPE_THANK_YOU, iter.next()));
        awardList.add(new AwardVO(75, AwardVO.TYPE_NON_CASH, iter.next()));

        /**
         *  prints the list of awards of cash type
         */
        System.out.println("The list of awards of cash type:");
        try {
            NominationHelper.printAwards(awardList, AwardVO.TYPE_CASH);
        } catch (AwardException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------");

        /**
         *  prints the list of awards of non_cash type
         */
        System.out.println("The list of awards of non_cash type:");
        try {
            NominationHelper.printAwards(awardList, AwardVO.TYPE_NON_CASH);
        } catch (AwardException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------");

        /**
         *  prints the list of awards of thank_you type
         */
        System.out.println("The list of awards of thank_you type:");
        try {
            NominationHelper.printAwards(awardList, AwardVO.TYPE_THANK_YOU);
        } catch (AwardException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------");

        //attempt to print awards of invalid type
        System.out.println("Attempt to print awards of invalid type");
        try {
            NominationHelper.printAwards(awardList, "Digital");
        } catch (AwardException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------");

        //create set of awards
        HashSet<String> awardTypes = new HashSet<>();

        //populate the set of awards
        awardTypes.add(AwardVO.TYPE_CASH);
        awardTypes.add(AwardVO.TYPE_NON_CASH);
        awardTypes.add(AwardVO.TYPE_THANK_YOU);

        System.out.println("Set of award types: " + awardTypes);

        //iterates list of awards and compare 0th element. Prints a message in case awards are equal.
        for (AwardVO award : awardList) {
            if (award.equals(awardList.get(0))) {
                System.out.println(award + " equals 1st award");
            }
        }

      /*  //attempt to call equals with not supported object type. Throws exception.
        //try-catch block to handle exception. Program doesn;t stop executing in case exception thrown
        try {
            awardList.get(0).equals("wide");
        } catch (AwardException e) {
            e.printStackTrace();
        }
*/
    }

}
