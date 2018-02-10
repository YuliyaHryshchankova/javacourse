package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.util.NominationHelper;
import com.company.lecturetwo.homework.vo.AwardVO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

        //list of awards
        List<AwardVO> awardList = new ArrayList<>();

        //populationg list of awards
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, 1));
        awardList.add(new AwardVO(100, AwardVO.TYPE_CASH, 2));
        awardList.add(new AwardVO(150, AwardVO.TYPE_NON_CASH, 3));
        awardList.add(new AwardVO(75, AwardVO.TYPE_CASH, 4));
        awardList.add(new AwardVO(50, AwardVO.TYPE_NON_CASH, 5));
        awardList.add(new AwardVO(80, AwardVO.TYPE_CASH, 6));
        awardList.add(new AwardVO(250, AwardVO.TYPE_CASH, 7));
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, 8));
        awardList.add(new AwardVO(100, AwardVO.TYPE_NON_CASH, 9));
        awardList.add(new AwardVO(175, AwardVO.TYPE_CASH, 10));
        awardList.add(new AwardVO(0, AwardVO.TYPE_THANK_YOU, 11));
        awardList.add(new AwardVO(50, AwardVO.TYPE_CASH, 12));
        awardList.add(new AwardVO(100, AwardVO.TYPE_CASH, 13));
        awardList.add(new AwardVO(0, AwardVO.TYPE_THANK_YOU, 14));
        awardList.add(new AwardVO(75, AwardVO.TYPE_NON_CASH, 15));

        /**
         *  prints the list of awards of cash type
         */
        System.out.println("The list of awards of cash type:");
        NominationHelper.printAwards(awardList, AwardVO.TYPE_CASH);
        System.out.println("---------------------");

        /**
         *  prints the list of awards of non_cash type
         */
        System.out.println("The list of awards of non_cash type:");
        NominationHelper.printAwards(awardList, AwardVO.TYPE_NON_CASH);
        System.out.println("---------------------");

        /**
         *  prints the list of awards of thank_you type
         */
        System.out.println("The list of awards of thank_you type:");
        NominationHelper.printAwards(awardList, AwardVO.TYPE_THANK_YOU);
        System.out.println("---------------------");


        //create set of awards
        HashSet<String> awardTypes = new HashSet<>();

        //populate the set of awards
        awardTypes.add(AwardVO.TYPE_CASH);
        awardTypes.add(AwardVO.TYPE_NON_CASH);
        awardTypes.add(AwardVO.TYPE_THANK_YOU);

        System.out.println("Set of award types: " + awardTypes);

    }

}
