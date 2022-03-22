package br.com.caio.patterns.comportamental.strategy.worker.strategies.move;

public class BikeMoveImpl implements MoveStrategy {

    @Override
    public void walk() {
        System.out.println("Andando de bicicleta");
    }
}
