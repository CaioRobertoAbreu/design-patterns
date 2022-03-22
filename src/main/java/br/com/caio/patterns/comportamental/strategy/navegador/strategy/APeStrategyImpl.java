package br.com.caio.patterns.comportamental.strategy.navegador.strategy;

public class APeStrategyImpl implements RotaStrategy{

    @Override
    public void calculaRota(int a, int b) {
        System.out.println("Calculando rota a pe...");
    }
}
