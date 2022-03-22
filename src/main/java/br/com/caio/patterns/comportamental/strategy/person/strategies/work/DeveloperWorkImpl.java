package br.com.caio.patterns.comportamental.strategy.person.strategies.work;

public class DeveloperWorkImpl implements WorkStrategy {

    @Override
    public String work() {
        return "Criando novas features...";
    }
}
