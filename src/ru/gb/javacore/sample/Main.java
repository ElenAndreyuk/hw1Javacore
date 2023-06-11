package ru.gb.javacore.sample;

import ru.gb.javacore.regular.Decorator;
import ru.gb.javacore.regular.RandomNumber;
/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 * */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {

        System.out.println(Decorator.decorate(RandomNumber.getRandom(1000)));
        System.out.println(Decorator.decorate(RandomNumber.getRandom(100)));
        System.out.println(Decorator.decorate(RandomNumber.getRandom(10)));
    }
}
