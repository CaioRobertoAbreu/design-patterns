package br.com.caio.patterns.comportamental.strategy.worker.strategies.food;

public class VaggieFoodImpl  implements FoodStrategy{

    @Override
    public void food() {
        System.out.println("Vegetariano");
    }
}
