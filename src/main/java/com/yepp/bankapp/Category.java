package com.yepp.bankapp;

public class Category {
    static CATEGORY_TYPE type = null;
    static float CO2Percentage = 0;

    public float calculateCO2() {
        return switch (type) {
            case GROCERIES -> 0;
            case RENT -> 1;
            case SAVING -> 2;
            case PERSONAL -> 3;
            case INSURANCE -> 4;
            case TRANSPORTATION -> 5;
        };
    }

    Category(CATEGORY_TYPE type, float CO2Percentage) {
        Category.type = type;
        Category.CO2Percentage = CO2Percentage;
    }

}

enum CATEGORY_TYPE {
    GROCERIES, RENT, TRANSPORTATION, INSURANCE, SAVING, PERSONAL
}