package com.epam.homework7;

import java.util.Comparator;

public class CompareShapeByColor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String figure1 = ((Shape) o1).getColor();
        String figure2 = ((Shape) o2).getColor();
        return figure1.compareTo(figure2);
    }


}
