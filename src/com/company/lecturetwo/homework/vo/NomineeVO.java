package com.company.lecturetwo.homework.vo;

public class NomineeVO {

    //статический блок инициализации
    static {
        System.out.println("Class NomineeVO initialized");
    }

    //приватное строкое поле name
    private String name;

    //конструктор
    public NomineeVO(String name) {
        this.name = name;
    }

    //публичный метод receiveAward, принимающий объект класса Award
    public void receiveAward(AwardVO award) {
        double soli = award.getSoli();
        int value = award.getValue();
        //
        if (soli > 0 && soli != 1) {
            double newValue = value * soli;
            System.out.println("Recalculated award value is " + newValue + ".\n" + "Soli value is " + soli + ".");

            double difference;
            if (soli < 1) {
                difference = (1 - soli) * 100;
                System.out.println("Award value reduced by " + difference + "%");
            } else {
                difference = (soli - 1) * 100;
                System.out.println("Award value increased by " + difference + "%");

            }

        } else {
            //вывод значения аварды на консоль
            System.out.println("Award value is " + value + ".\n" + "There is no recalculation.");
        }

        System.out.println("-----------");
    }

    public String getName() {
        return name;
    }
}
