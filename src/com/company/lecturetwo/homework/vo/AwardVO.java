package com.company.lecturetwo.homework.vo;

import com.company.lecturetwo.homework.exc.AwardException;

/**
 *
 */
public class AwardVO {

    //статический блок инициализации
    static {
        System.out.println("Class AwardVO initialized");
    }

    //award types
    public static final String TYPE_CASH = "cash";
    public static final String TYPE_NON_CASH = "non_cash";
    public static final String TYPE_THANK_YOU = "thank_you";

    /**
     *
     */
    private int value;
    private double soli;
    private String type;
    private int id;

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
    public AwardVO(int value, String type, int id) {
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


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Overrides Object's toString for better reading
     *
     * @return string representation of AwardVO. E.g. Award[id: 1, type: cash, value: 50]
     */
    @Override
    public String toString() {
        return "Award[id: " + id + ", type: " + type + ", value: " + value + "]";
    }

    /**
     * overrides standard hashCode to return award id
     *
     * @return award id
     */
    @Override
    public int hashCode() {
        return id;
    }

    /**
     * Overrides Object's equals method to compare awards by type and value
     *
     * @param obj - AwardVO to compare with
     * @return 'true' if awards are equal, 'false' otherwise
     */
    @Override
    public boolean equals(Object obj) {
        //instanceof - оператор проверки объекта на принадлежность класса
        if (!( obj instanceof AwardVO)) {
            throw new AwardException("AwardVO objects supported only");
        }
        return this.type.equals(((AwardVO) obj).getType()) && this.value == ((AwardVO) obj).getValue();
    }
}