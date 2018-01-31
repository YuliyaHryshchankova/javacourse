package com.company.lecturetwo.homework.vo;

/**
 * class NomineeVO
 */
public class NomineeVO extends PersonVO {
    //extends - значит, что мы наследуем класс PersonVO, то есть используем поля

    //статический блок инициализации
    static {
        System.out.println("Class NomineeVO initialized");
    }

    /**
     *
     */
    private double quantity;
    //Все переменные в классе обычно private, если не дано другое.

    /**
     * @param name
     */
    //конструкторы(используется для создания объектов данного класса NomineeVO)
    public NomineeVO(String name) {
        //вызов конструктора родительского класса
        super(name);
        //this.name = name;

        System.out.println("NomineeVO object created using constructor (String)");

    }

    /**
     * @param name
     * @param awardQuantityLimit
     * @param awardAmountLimit
     */
    public NomineeVO(String name, int awardQuantityLimit, double awardAmountLimit) {
        super(name);
        //this.name = name;
        this.awardQuantityLimit = awardQuantityLimit;
        this.awardAmountLimit = awardAmountLimit;

        System.out.println("NomineeVO object created using constructor (String, int, double)");

    }

    /**
     * Method from interface
     */
    public boolean isLimitReached(double currentValue, double limit) {
        System.out.println("Executed from Nominee");
        return currentValue >= limit;

      }

    /**
     * @return
     */
    //геттеры для quantity
    public double getQuantity() {
        return quantity;
    }


}
