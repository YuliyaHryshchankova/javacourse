package com.company.lecturetwo.homework;

public class AwardVO {

    //статический блок инициализации
    static {
        System.out.println("Class AwardVO initialized");
    }

    //приватное финальное целочисленное поле value
    private final int value;

    //конструктор
    public AwardVO(final int value) {
        this.value = value;
    }

    //публичный геттер поля value
    public int getValue() {
        return value;
    }

}