package br.com.caio.patterns.comportamental.strategy.worker.worker;

import br.com.caio.patterns.comportamental.strategy.worker.strategies.food.MeatFoodImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.move.AirlineMoveImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.work.DeveloperWorkImpl;

public class Developer implements Worker{

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        new DeveloperWorkImpl().work();
    }

    @Override
    public void eat() {
        new MeatFoodImpl().food();
    }

    @Override
    public void move() {
        new AirlineMoveImpl().walk();
    }
}
