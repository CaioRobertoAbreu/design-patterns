package br.com.caio.patterns.comportamental.strategy.worker.strategies.food;

public class MeatFoodImpl implements FoodStrategy{

    @Override
    public void food() {
        System.out.println("Carnívoro");
    }
}
