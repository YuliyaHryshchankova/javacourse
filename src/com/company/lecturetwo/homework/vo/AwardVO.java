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
    private int value;
    private double soli;
    private Enum type;
    private long id;

    /**
     * @param value
     */
    //конструкторы
    public AwardVO(final int value) {
        this.value = value;
    }

    /**
     * @param value
     * @param soli
     */
    public AwardVO(final int value, double soli) {
        this.value = value;
        this.soli = soli;
    }

    /**
     * Constructor - creates an award with the specified value, type and id.
     *
     * @param value - award value
     * @param type  - award type from the fixed list
     * @param id    -  award id
     */
    public AwardVO(int value, Enum type, long id) {
        this.value = value;
        this.type = type;
        this.id = id;
    }

    /**
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
     * @return
     */
    //публичный геттер поля soli
    public double getSoli() {
        return soli;
    }

    /**
     * @param soli
     */
    //сеттер поля soli
    public void setSoli(double soli) {
        this.soli = soli;
    }


    public void setType(Enum type) {
        this.type = type;
    }

    public Enum getType() {
        return type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}