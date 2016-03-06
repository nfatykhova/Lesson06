package ru.levelp;

/**
 * Created by natalie on 04.03.16.
 */

public class MyArrayList {

    private int[] values; // инкапсуляция - запретить доступ к массиву: private
    // privat - доступ возможен только внутри класса, в котором объявлено
    // теперь никто не может ничего сделать кроме как через наши методы

    /*
    ООП:
    полиморфизм
    инкапсуляция - сокрытие данных во избежании ошибок
    наследование
    + абстракция - умение построить правильную архитектуру

    пишем методы, абстрагируясь от задачи!!!

     */

    public void add(int value) {

        if (values == null) {
            values = new int[1];
            values[0] = value;
        } else {
            int[] temp = new int[values.length + 1];
            for (int i = 0; i < values.length; i++) {
                temp[i] = values[i];
            }
            temp[temp.length - 1] = value;
            values = temp;
        }
    }

    public int get(int index) {
        // отдает n-ный эл-т из массива
        if (values == null) {
            System.err.println("Error: ArrayList is empty");
        }
        return values[index];
    }

    public int size() {

        if (values == null) {
            return 0;
        }
        return values.length;
    }

    public int remove(int index) {
        // удаляет n-ный эл-т из массива - уменьшает размер массива
        // return значение удаленного эл-та

        if (values == null) {
            return 0;
        }

        int del = values[index];

        int[] temp = new int[values.length - 1];

        if (index < values.length - 1) {

            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }

            for (int i = index; i < values.length - 1; i++) {
                temp[i] = values[i + 1];
            }

        } else if (index == values.length - 1) {
            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }
        }
        values = temp;
        return del;
    }


    public void insert(int index, int value) {
        // добавляет по индексу, остальное сдвигает

        if (values == null) {
            values = new int[1];
            values[0] = value;
        } else {

            int[] temp = new int[values.length + 1];

            for (int i = 0; i < index; i++) {
                temp[i] = values[i];
            }
            for (int i = index; i < values.length; i++) {
                temp[i + 1] = values[i];
            }
            temp[index] = value;
            values = temp;
        }

    }

    public void clear() {

        int[] temp = new int[0];
        values = temp;
    }
}

