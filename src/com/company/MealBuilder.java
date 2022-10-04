package com.company;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItems(new VegBurger());
        meal.addItems(new Coke());
        return meal;
    }

    public Meal prepareChickenMeal(){
        Meal meal = new Meal();
        meal.addItems(new ChickBurger());
        meal.addItems(new Pepsi());
        return meal;
    }
    public Meal prepareCheaseMeal(){
        Meal meal = new Meal();
        meal.addItems(new CheaseBurger());
        meal.addItems(new Fanta());
        return meal;
    }
}
