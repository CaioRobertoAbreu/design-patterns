package br.com.caio.patterns.comportamental.strategy.worker.strategies.work;

public class DeveloperWorkImpl implements WorkStrategy{

    @Override
    public void work() {
        System.out.println("Criando novas features...");
    }
}
