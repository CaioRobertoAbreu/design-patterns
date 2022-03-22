package br.com.caio.patterns.comportamental.strategy.worker.strategies.move;

public class CarMoveImpl implements MoveStrategy {

    @Override
    public void walk() {
        System.out.println("Andando de HB20");
    }
}
