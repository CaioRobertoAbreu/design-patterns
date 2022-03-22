package br.com.caio.patterns.comportamental.strategy.worker.worker;

import br.com.caio.patterns.comportamental.strategy.worker.strategies.food.MeatFoodImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.food.VaggieFoodImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.move.AirlineMoveImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.move.CarMoveImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.work.DeveloperWorkImpl;
import br.com.caio.patterns.comportamental.strategy.worker.strategies.work.QAWorkImpl;

public class Tester implements Worker{

    private String name;

    public Tester(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        new QAWorkImpl().work();
    }

    @Override
    public void eat() {
        new VaggieFoodImpl().food();
    }

    @Override
    public void move() {
        new CarMoveImpl().walk();
    }
}
