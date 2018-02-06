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
    protected boolean hasGivePrivilege;
    protected boolean hasReceivePrivilege;

    /**
     * переопределяем дефолтный конструктор и вызываем из него параметризированный, т.е. создается Person с именем Default
     */
    public PersonVO() {
        this("Default");

        System.out.println("PersonVO object created using default constructor");
    }

    /**
     * Person constructor with name parameter
     *
     * @param name - user name
     */
    public PersonVO(String name) {
        this.name = name;

        System.out.println("PersonVO object created using constructor (String)");

    }

    /**
     * Getter for name геттеры и сеттеры для awardQuantityLimit, awardValueLimit, name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for awardQuantityLimit
     *
     * @return awardQuantityLimit
     */
    public int getAwardQuantityLimit() {
        return awardQuantityLimit;
    }

    /**
     * Setter for awardQuantityLimit
     *
     * @param awardQuantityLimit - limit for award quantity
     */
    public void setAwardQuantityLimit(int awardQuantityLimit) {
        this.awardQuantityLimit = awardQuantityLimit;
    }

    /**
     * Getter for awardAmountLimit
     *
     * @return awardAmountLimit
     */
    public double getAwardAmountLimit() {
        return awardAmountLimit;
    }

    /**
     * Setter for awardAmountLimit
     *
     * @param awardAmountLimit - limit for awards amount
     */
    public void setAwardAmountLimit(double awardAmountLimit) {
        this.awardAmountLimit = awardAmountLimit;
    }

    /**
     * Method that provides Person name
     */
    public void printPersonName() {
        System.out.println(name);
    }

    /**
     * @param printLength
     */
    public void printPersonName(boolean printLength) {
        if (printLength) {
            System.out.println(name + "(" + name.length() + ")");
        } else {
            printPersonName();

        }
    }


}
