package br.com.caio.patterns.comportamental.strategy.worker;

import br.com.caio.patterns.comportamental.strategy.worker.worker.Developer;
import br.com.caio.patterns.comportamental.strategy.worker.worker.DeveloperHipster;
import br.com.caio.patterns.comportamental.strategy.worker.worker.Tester;

public class Principal {

    public static void main(String[] args) {

        var dev = new Developer("Caio");
        var hip = new DeveloperHipster("Paulo Silveira");
        var qa = new Tester("Sandra");

        System.out.println("========================");
        System.out.println("       DEVELOPER        ");
        System.out.println("========================");
        dev.work();
        dev.eat();
        dev.move();

        System.out.println("========================");
        System.out.println("           QA           ");
        System.out.println("========================");
        qa.work();
        qa.eat();
        qa.move();

        System.out.println("========================");
        System.out.println("        HIPSTER         ");
        System.out.println("========================");
        hip.work();
        hip.eat();
        hip.move();


    }

}
