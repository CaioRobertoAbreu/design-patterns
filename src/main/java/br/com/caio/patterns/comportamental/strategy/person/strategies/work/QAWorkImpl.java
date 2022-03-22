package br.com.caio.patterns.comportamental.strategy.person.strategies.work;

public class QAWorkImpl implements WorkStrategy {

    @Override
    public String work() {
        return "Verificando bugs...";
    }
}
