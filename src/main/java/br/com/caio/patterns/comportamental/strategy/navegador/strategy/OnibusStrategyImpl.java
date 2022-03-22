package br.com.caio.patterns.comportamental.strategy.navegador.strategy;

public class OnibusStrategyImpl implements RotaStrategy{

    @Override
    public void calculaRota(int a, int b) {
        System.out.println("Calculando rota de onibus...");
    }
}
