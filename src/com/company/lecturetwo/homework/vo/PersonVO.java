package com.company.lecturetwo.homework.vo;

import com.company.lecturetwo.homework.check.OperationsWithLimit;

/**
 * Parent class PersonVO
 */
public abstract class PersonVO implements OperationsWithLimit {

    /**
     *
     */
    protected String name;
    //максимальное кол-во авард, которые может получить\дать person
    protected int awardQuantityLimit;
    //сумма, которую может получить\дать person
    protected double awardAmountLimit;
    protected String hasGivePrivilege;
    protected String hasReceivePrivilege;

    /**
     * переопределяем дефолтный конструктор и вызываем из него параметризированный, т.е. создается Person с именем Default
     */
    public PersonVO() {
        this("Default");

        System.out.println("PersonVO object created using default constructor");
    }

    /**
     * constructor
     *
     * @param name
     */
    public PersonVO(String name) {
        this.name = name;

        System.out.println("PersonVO object created using constructor (String)");

    }

    /**
     * @param currentValue
     * @param limit
     * @return
     */
    public boolean isLimitReached(double currentValue, double limit) {
        return currentValue >= limit;

    }

    /**
     * геттеры и сеттеры для awardQuantityLimit, awardValueLimit, name
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public int getAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    public void setAwardQuantityLimit(int awardQuantityLimit) {
        this.awardQuantityLimit = awardQuantityLimit;
    }

    public double getAwardAmountLimit() {
        return awardAmountLimit;
    }

    public void setAwardAmountLimit(double awardAmountLimit) {
        this.awardAmountLimit = awardAmountLimit;
    }

}
