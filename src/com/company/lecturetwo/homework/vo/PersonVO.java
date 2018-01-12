package com.company.lecturetwo.homework.vo;

/**
 * Parent class PersonVO
 */

public class PersonVO {

    //приватное строковое поле name.
    protected String name;

    //переопределяем дефолтный конструктор и вызываем из него параметризированный, т.е. создается Person с именем Default
    public PersonVO() {
        this("Default");

        System.out.println("PersonVO object created using default constructor");
    }

    //constructor
    public PersonVO(String name) {
        this.name = name;

        System.out.println("PersonVO object created using constructor (String)");

    }

    //getter
    public String getName() {
        return name;
    }
}
