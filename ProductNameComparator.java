package ru.zotkina.tasks.qen;

import java.io.Serializable;
import java.util.Comparator;

class ProductNameComparator implements Comparator<Product>, Serializable {

    public int compare(final Product a, final Product b) {
        return a.getName().compareTo(b.getName());
    }
}
