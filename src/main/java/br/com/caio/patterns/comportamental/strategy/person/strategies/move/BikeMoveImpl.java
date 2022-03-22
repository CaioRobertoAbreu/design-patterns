package br.com.caio.patterns.comportamental.strategy.person.strategies.move;

public class BikeMoveImpl implements MoveStrategy {

    @Override
    public String walk() {
       return "Andando de bicicleta";
    }
}
