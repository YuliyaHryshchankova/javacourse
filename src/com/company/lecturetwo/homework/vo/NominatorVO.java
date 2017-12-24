package com.company.lecturetwo.homework.vo;

public class NominatorVO {

    //статический блок инициализации
    static {
        System.out.println("Class NominatorVO initialized");
    }

    //приватное строкое поле name
    private String name;

    //конструктор
    public NominatorVO(String name) {
        this.name = name;
    }

    //публичный метод nominate, который принимает объекты классов NomineeVO и AwardVO
    public void nominate(NomineeVO nominee, AwardVO award) {

        //вывод на консоль кому и какого размера выдана аварда
        System.out.println(nominee.getName() + " received " + award.getValue());

        //вызов метода receiveAward параметра nominee
        nominee.receiveAward(award);
    }

}
