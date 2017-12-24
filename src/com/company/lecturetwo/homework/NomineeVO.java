package com.company.lecturetwo.homework;

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
        //вывод значения аварды на консоль
        System.out.println("Award value is " + award.getValue());
    }

    public String getName() {
        return name;
    }
}
