package br.com.caio.patterns.comportamental.strategy.navegador;

import br.com.caio.patterns.comportamental.strategy.navegador.strategy.APeStrategyImpl;
import br.com.caio.patterns.comportamental.strategy.navegador.strategy.CarroStrategyImpl;

public class Principal {
    public static void main(String[] args) {

        var carro = new Navegador(new CarroStrategyImpl());
        var ape = new Navegador(new APeStrategyImpl());
        var skate = new Navegador((int a, int b) -> System.out.println("Calculando rota para skate"));

        carro.calculaRota(1, 20);
        ape.calculaRota(2, 5);
        skate.calculaRota(5, 10);
    }

}
