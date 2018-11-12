package ru.zotkina.tasks.qen;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * В класс продукт добавить поле int count – количество.
 * Создать 2 класса имплементирующих интерфейс Comparator.
 * Первый реализует метод сравнения по полю name, второй - count.
 * Произвести сортировку: в начале по кол-ву, затем по названию.
 * @author Karina Zotkina
 * @version 1.0 05 Nov 2018
 */

final class Product {

    private static final int A = 15; //кол-во ноутбуков
    private static final int A1 = 4; //кол-во телевизоров
    private static final int A2 = 4; //кол-во телефонов
    private static final int A3 = 10; //кол-во микрофонов
    private static final int A4 = 12; //кол-во клавиатур
    private static final int A5 = 8; //кол-во планшетов
    private  final String name;
    private final int count;


    private Product(final int a, final String n) {
        count = a;
        name = n;
    }

    int getCount() {
        return count;
    }

    String getName() {
        return name;
    }

    public static void main(final String[] args) {
        Comparator<Product> productComparator = new ProductCountComparator().thenComparing(new ProductNameComparator());
        TreeSet<Product> goods = new TreeSet<>(productComparator);
        System.out.println("Сортировка по количеству: ");
        goods.add(new Product(A, "Ноутбук"));
        goods.add(new Product(A1, "Телевизор"));
        goods.add(new Product(A2, "Телефон"));
        goods.add(new Product(A3, "Микрофон"));
        goods.add(new Product(A4, "Клавиатура"));
        goods.add(new Product(A5, "Планшет"));

        for (Product p : goods) {
            System.out.println(p.getCount() + " " + p.getName());
        }

        System.out.println("---");
        System.out.println("Сортировка по названию: ");
        Comparator<Product> productComparator1 = new ProductNameComparator();
        TreeSet<Product> goods1 = new TreeSet<>(productComparator1);
        goods1.add(new Product(A, "Ноутбук"));
        goods1.add(new Product(A1, "Телевизор"));
        goods1.add(new Product(A2, "Телефон"));
        goods1.add(new Product(A3, "Микрофон"));
        goods1.add(new Product(A4, "Клавиатура"));
        goods1.add(new Product(A5, "Планшет"));

        for (Product p : goods1) {
            System.out.println(p.getCount() + " " + p.getName());
        }
    }
}

