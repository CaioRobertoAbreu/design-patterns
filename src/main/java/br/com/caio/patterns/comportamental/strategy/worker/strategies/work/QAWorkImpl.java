package br.com.caio.patterns.comportamental.strategy.worker.strategies.work;

public class QAWorkImpl implements WorkStrategy{

    @Override
    public void work() {
        System.out.println("Verificando bugs...");
    }
}
