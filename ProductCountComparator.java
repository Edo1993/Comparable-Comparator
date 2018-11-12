package ru.zotkina.tasks.qen;

import java.io.Serializable;
import java.util.Comparator;

class ProductCountComparator implements Comparator<Product>, Serializable {

    public int compare(final Product a, final Product b) {
        return Integer.compare(a.getCount(), b.getCount());
    }
}
