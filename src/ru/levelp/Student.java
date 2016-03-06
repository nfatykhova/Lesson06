package ru.levelp;

/**
 * Created by natalie on 06.03.16.
 */

public class Student {

    // (!) при создании класса все поля в нем делать сразу PRIVATE

    public static final int FROM_RUS = 0; // публичные константы
    public static final int FROM_KAZ = 1;
    public static final int FROM_BEL = 2;

    private String name;
    private int age;
    private boolean isFullTime;
    private double avr;
    private int from; // 0 - рф / 1 - казахстан / 2- белоруссия

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isFullTime == true) System.out.println("Fulltime: yes");
        else if (isFullTime == false) System.out.println("Fulltime: no");
        System.out.println("Average score: "+ avr);
    }

    // get возвращает значение
    // set устанавливает

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setFrom(int newFrom) {
        from = newFrom;
    }

}
