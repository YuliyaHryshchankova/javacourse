package com.company.lecturetwo.homework.test;

import com.company.lecturetwo.homework.vo.AwardVO;
import com.company.lecturetwo.homework.vo.NominatorVO;
import com.company.lecturetwo.homework.vo.NomineeVO;

import java.util.Random;

public class Lecture4Test {

    public static void main(String[] args) {

        Random random = new Random();

        NominatorVO nominator = new NominatorVO("Tom", 5, 500);
        NomineeVO nominee1 = new NomineeVO("Dave", 5, 500);

        //3.1 Nominator дает авадру Nominee пока не достигнет nominatorAwardQuantityLimit
        int counter = 0;
        while (counter < nominator.getNominatorAwardQuantityLimit()){
           //nominator.nominate(nominee1, new AwardVO(80);
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
            counter++;
        }

        System.out.println("Nominee name is " + nominee1.getName() + ". Limit type is by award quantity." + " Number of received awards is " + counter);

        //3.2 Nominator дает авадру Nominee пока не достигнет nominatorAwardAmountLimit
        int sum = 0;
        do {
            //объявление временной переменной, которая будет использоваться только в do while
            int value = 100 + random.nextInt(50);
            if (sum + value <= nominator.getNominatorAwardAmountLimit())
            {
            nominator.nominate(nominee1, new AwardVO(value));
            }
            else break;
            //sum = sum + value
            sum += value;
        }
        while(sum < nominator.getNominatorAwardAmountLimit());

        System.out.println("Nominee name is " + nominee1.getName() + ". Limit type is by award amount." + " Amount of received awards is " + sum);

        //3.3 Nominator дает авадру Nominee пока не достигнет nomineeAwardQuantityLimit
        int i;
        for (i = 0; i < nominee1.getNomineeAwardQuantityLimit(); i++) {
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
        }
        System.out.println("Nominee name is " + nominee1.getName() + ". Limit type is by award quantity." + " Number of recieved awards is " + i);

        //3.4 Nominator дает авадру Nominee пока не достигнет nomineeAwardAmountLimit
        //объявление нет, т.к выше объявили уже
        sum = 0;
        int value = 100 + random.nextInt(50);
        while (sum < nominee1.getNomineeAwardAmountLimit()) {
            nominator.nominate(nominee1, new AwardVO(100 + random.nextInt(50)));
            if (sum + value > nominee1.getNomineeAwardAmountLimit())
            {
                break;
            }
            sum += value;
        }

        System.out.println("Nominee name is " + nominee1.getName() + ". Limit type is by award amount." + " Amount of received awards is " + sum);

    }
}
