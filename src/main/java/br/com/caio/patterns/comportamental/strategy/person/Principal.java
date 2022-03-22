package br.com.caio.patterns.comportamental.strategy.person;

import br.com.caio.patterns.comportamental.strategy.person.strategies.food.MeatFoodImpl;
import br.com.caio.patterns.comportamental.strategy.person.strategies.food.VaggieFoodImpl;
import br.com.caio.patterns.comportamental.strategy.person.strategies.move.BikeMoveImpl;
import br.com.caio.patterns.comportamental.strategy.person.strategies.move.CarMoveImpl;
import br.com.caio.patterns.comportamental.strategy.person.strategies.work.DeveloperWorkImpl;
import br.com.caio.patterns.comportamental.strategy.person.strategies.work.QAWorkImpl;

public class Principal {

    public static void main(String[] args) {

        var dev = new Person("Caio", new DeveloperWorkImpl(), new MeatFoodImpl(), new CarMoveImpl());
        var hip = new Person("Paulo Silveira", new DeveloperWorkImpl(), new VaggieFoodImpl(), new BikeMoveImpl());
        var qa = new Person("Sandra", new QAWorkImpl(), new VaggieFoodImpl(), new CarMoveImpl());

        System.out.println("========================");
        System.out.println("       DEVELOPER        ");
        System.out.println("========================");
        System.out.println(dev.toString());

        System.out.println("========================");
        System.out.println("           QA           ");
        System.out.println("========================");
        System.out.println(qa.toString());


        System.out.println("========================");
        System.out.println("        HIPSTER         ");
        System.out.println("========================");
        System.out.println(hip.toString());



    }

}
