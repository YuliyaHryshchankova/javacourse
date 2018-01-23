package com.company.lecturetwo.homework.vo;

/**
 *
 */
public class NominatorVO extends PersonVO {

    //статический блок инициализации
    static {
        System.out.println("Class NominatorVO initialized");
    }

    /**
     * конструкторы
     * @param name
     */
    public NominatorVO(String name) {
        super(name);
        //this.name = name;

        System.out.println("NominatorVO object created using constructor (String)");

    }

    /**
     *
     * @param name
     * @param awardQuantityLimit
     * @param awardAmountLimit
     */
    public NominatorVO(String name, int awardQuantityLimit, double awardAmountLimit) {
        super(name);
        //this.name = name;
        this.awardQuantityLimit = awardQuantityLimit;
        this.awardAmountLimit = awardAmountLimit;

        System.out.println("NominatorVO object created using constructor (String, int, double)");
    }

    /**
     * переопределяем родительский метод getName (класс PersonVO)
      * @return
     */
    @Override
    public String getName() {
        return super.getName() + " nominator";
    }

}
