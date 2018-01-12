package com.company.lecturetwo.homework.vo;

import com.company.lecturetwo.homework.util.NominationHelper;

public class NominatorVO extends PersonVO {

    //статический блок инициализации
    static {
        System.out.println("Class NominatorVO initialized");
    }

    //максимальное кол-во авард, которые может дать nominator
    private int nominatorAwardQuantityLimit;
    //сумма, которую может дать nominator
    private double nominatorAwardAmountLimit;

    //конструкторы
    public NominatorVO(String name) {
        super(name);
        //this.name = name;

        System.out.println("NominatorVO object created using constructor (String)");

    }

    public NominatorVO(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit) {
        super(name);
        //this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;

        System.out.println("NominatorVO object created using constructor (String, int, double)");
    }

    //публичный метод nominate, который принимает объекты классов NomineeVO и AwardVO
    public void nominate(NomineeVO nominee, AwardVO award) {

        //вывод на консоль кому и какого размера выдана аварда
        System.out.println(nominee.getName() + " received " + award.getValue());

        //вызов метода receiveAward параметра nominee
        NominationHelper.receiveAward(award);
    }

    //геттеры и сеттеры для nomineeAwardQuantityLimit и nomineeAwardValueLimit
    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public double getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(double nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = this.nominatorAwardAmountLimit;
    }

    //переопределяем родительский метод getName (класс PersonVO)
    @Override
    public String getName() {
        return super.getName();
    }

}
