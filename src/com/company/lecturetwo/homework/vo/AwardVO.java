package com.company.lecturetwo.homework.vo;

public class AwardVO {

    //статический блок инициализации
    static {
        System.out.println("Class AwardVO initialized");
    }

    //приватное финальное целочисленное поле value
    private final int value;
    private double soli;

    //конструктор
    public AwardVO(final int value) {
        this.value = value;
    }

    public AwardVO(final int value, double soli) {
        this.value = value;
        this.soli = soli;
    }

    //публичный геттер поля value
    public int getValue() {
        return value;
    }
    //публичный геттер поля soli
    public double getSoli() {
        return soli;
    }
    //сеттер поля soli
    public void setSoli(double soli) {
        this.soli = soli;
    }
}