package br.com.caio.patterns.comportamental.strategy.worker.worker;

import br.com.caio.patterns.comportamental.strategy.worker.strategies.food.MeatFoodImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.food.VaggieFoodImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.move.AirlineMoveImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.move.BikeMoveImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.work.DeveloperWorkImpl;

public class DeveloperHipster implements Worker{

    private String name;

    public DeveloperHipster(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        new DeveloperWorkImpl().work();
    }

    @Override
    public void eat() {
        new VaggieFoodImpl().food();
    }

    @Override
    public void move() {
        new BikeMoveImpl().walk();
    }
}
