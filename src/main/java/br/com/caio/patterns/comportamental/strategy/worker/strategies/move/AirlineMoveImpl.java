package br.com.caio.patterns.comportamental.strategy.worker.strategies.move;

public class AirlineMoveImpl implements MoveStrategy {

    @Override
    public void walk() {
        System.out.println("Voando de avião particular");
    }
}
