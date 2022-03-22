package br.com.caio.patterns.comportamental.strategy.person;

import br.com.caio.patterns.comportamental.strategy.person.strategies.food.FoodStrategy;
import br.com.caio.patterns.comportamental.strategy.person.strategies.move.MoveStrategy;
import br.com.caio.patterns.comportamental.strategy.person.strategies.work.WorkStrategy;

public class Person {

    private String name;
    private WorkStrategy ocupation;
    private FoodStrategy food;
    private MoveStrategy transportation;

    public Person(String name, WorkStrategy ocupation, FoodStrategy food, MoveStrategy transportation) {
        this.name = name;
        this.ocupation = ocupation;
        this.food = food;
        this.transportation = transportation;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ocupation=" + ocupation.work() +
                ", food=" + food.food() +
                ", transportation=" + transportation.walk() +
                '}';
    }
}
