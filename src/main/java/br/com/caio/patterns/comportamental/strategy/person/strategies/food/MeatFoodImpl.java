package br.com.caio.patterns.comportamental.strategy.person.strategies.food;

public class MeatFoodImpl implements FoodStrategy {

    @Override
    public String food() {
       return "Carnívoro";
    }
}
