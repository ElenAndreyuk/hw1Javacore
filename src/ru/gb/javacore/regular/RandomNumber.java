package ru.gb.javacore.regular;

import java.util.Random;
/**
 * Класс выдает случайное число.
 * */
public class RandomNumber {
    /**
     * Метод возвращает случайное целое число в заданном диапазоне.
     * @param b - крайнее значение диапазона.
     * @return - случайное целое число.
     */
    public static int getRandom(int b){
        int a = new Random().nextInt(b);
        return a;
    }
}
