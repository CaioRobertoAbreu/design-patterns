package br.com.caio.patterns.comportamental.strategy.person.strategies.food;

public class VaggieFoodImpl  implements FoodStrategy {

    @Override
    public String food() {
        return "Vegetariano";
    }
}
