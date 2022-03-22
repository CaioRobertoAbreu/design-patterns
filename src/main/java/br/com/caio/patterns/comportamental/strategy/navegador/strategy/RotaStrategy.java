package br.com.caio.patterns.comportamental.strategy.navegador.strategy;

@FunctionalInterface
public interface RotaStrategy {

    void calculaRota(int a, int b);
}
