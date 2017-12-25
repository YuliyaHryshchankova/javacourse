package com.company.lecturetwo.homework.vo;

public class NominatorVO {

    //статический блок инициализации
    static {
        System.out.println("Class NominatorVO initialized");
    }

    //приватное строкое поле name
    private String name;
    //максимальное кол-во авард, которые может дать nominator
    private int nominatorAwardQuantityLimit;
    //сумма, которую может дать nominator
    private double nominatorAwardAmountLimit;

    //конструкторы
    public NominatorVO(String name) {
        this.name = name;
    }
    public NominatorVO(String name, int nominatorAwardQuantityLimit, double nominatorAwardAmountLimit) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    //публичный метод nominate, который принимает объекты классов NomineeVO и AwardVO
    public void nominate(NomineeVO nominee, AwardVO award) {

        //вывод на консоль кому и какого размера выдана аварда
        System.out.println(nominee.getName() + " received " + award.getValue());

        //вызов метода receiveAward параметра nominee
        nominee.receiveAward(award);
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
}
