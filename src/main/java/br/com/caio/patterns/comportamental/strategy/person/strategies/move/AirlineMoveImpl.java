package br.com.caio.patterns.comportamental.strategy.person.strategies.move;

public class AirlineMoveImpl implements MoveStrategy {

    @Override
    public String walk() {
        return "Voando de avião particular";
    }
}
