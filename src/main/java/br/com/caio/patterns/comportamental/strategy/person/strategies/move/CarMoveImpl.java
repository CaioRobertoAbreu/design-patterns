package br.com.caio.patterns.comportamental.strategy.person.strategies.move;

public class CarMoveImpl implements MoveStrategy {

    @Override
    public String walk() {
        return "Andando de HB20";
    }
}
