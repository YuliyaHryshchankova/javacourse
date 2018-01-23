package com.company.lecturetwo.homework.vo;

/**
 *
 */
public class AwardVO {

    //статический блок инициализации
    static {
        System.out.println("Class AwardVO initialized");
    }

    /**
     *
     */
    //приватное финальное целочисленное поле value
    private  int value;
    private double soli;

    /**
     *
     * @param value
     */
    //конструкторы
    public AwardVO(final int value) {
        this.value = value;
    }

    /**
     *
     * @param value
     * @param soli
     */
    public AwardVO(final int value, double soli) {
        this.value = value;
        this.soli = soli;
    }

    /**
     *
     * @return
     */
    //публичный геттер поля value
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    //публичный геттер поля soli
    public double getSoli() {
        return soli;
    }

    /**
     *
     * @param soli
     */
    //сеттер поля soli
    public void setSoli(double soli) {
        this.soli = soli;
    }



}