package com.company.lecturetwo.homework.vo;

import java.util.Random;

//extends - значит, что мы наследуем класс PersonVO, то есть используем поля
public class NomineeVO extends PersonVO {

    //статический блок инициализации
    static {
        System.out.println("Class NomineeVO initialized");
    }

    //Все переменные в классе обычно private, если не дано другое.
    private double quantity;
    //максимальное кол-во авард, которые может получить nominee
    private int nomineeAwardQuantityLimit;
    //сумма, которую может получить nominee
    private double nomineeAwardAmountLimit;

    //конструкторы(используется для создания объектов данного класса NomineeVO)
    public NomineeVO(String name) {
        //вызов конструктора родительского класса
        super(name);
        //this.name = name;

        System.out.println("NomineeVO object created using constructor (String)");

    }

    public NomineeVO(String name, int nomineeAwardQuantityLimit, double nomineeAwardAmountLimit) {
        super(name);
        //this.name = name;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;

        System.out.println("NomineeVO object created using constructor (String, int, double)");

    }


    //публичный метод receiveAward, принимающий объект класса Award
    /*public void receiveAward(AwardVO award) {
        double soli = award.getSoli();
        int value = award.getValue();
        //если задано soli, то пересчитываем value и выводим запись об этом
        if (soli > 0 && soli != 1) {
            double newValue = value * soli;
            System.out.println("Recalculated award value is " + newValue + ".\n" + "Soli value is " + soli + ".");
            //оббъявление переменной difference
            double difference;
            //если soli < 1, то считаем потерю и выводим в консоль
            if (soli < 1) {
                difference = (1 - soli) * 100;
                System.out.println("Award value reduced by " + difference + "%");
            } else {
                //если soli > 1, то считаем, на сколько увеличилась value и выводим разницу в консоль
                difference = (soli - 1) * 100;
                System.out.println("Award value increased by " + difference + "%");

            }

        } else {
            //вывод значения аварды на консоль
            System.out.println("Award value is " + value + ".\n" + "There is no recalculation.");
        }

        System.out.println("-----------");
    }*/

    //геттеры для quantity, name, nomineeAwardQuantityLimit и nomineeAwardAmountLimit. сеттеры для  nomineeAwardQuantityLimit и nomineeAwardAmountLimit.
    public double getQuantity() {
        return quantity;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public double getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(double nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

}
