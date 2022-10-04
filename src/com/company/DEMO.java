package com.company;

public class DEMO {
    public static void main(String[] args) {
        MealBuilder mealbuilder = new MealBuilder();

        Meal vegMeal = mealbuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cots: " + vegMeal.getCost());

        Meal cheaseMeal = mealbuilder.prepareCheaseMeal();
        System.out.println("Chease Meal");
        cheaseMeal.showItems();
        System.out.println("Total cots: " + cheaseMeal.getCost());

    }
}
