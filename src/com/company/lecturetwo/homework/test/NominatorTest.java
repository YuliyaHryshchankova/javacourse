package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;

public class NominatorTest {
    public static void main(String[] args) {
        NominatorVO nominator = new NominatorVO("Tom");
        NomineeVO nominee1 = new NomineeVO("Dave");
        NomineeVO nominee2 = new NomineeVO("Alex");
        NomineeVO nominee3 = new NomineeVO("Kris");

        nominator.nominate(nominee1, new AwardVO(45, 0.75));
        nominator.nominate(nominee1, new AwardVO(70, 1.03));
        nominator.nominate(nominee2, new AwardVO(150));
        nominator.nominate(nominee2, new AwardVO(320, 1.40));
        nominator.nominate(nominee3, new AwardVO(100, 0.23));
        nominator.nominate(nominee3, new AwardVO(25, 1.5));
    }


}
