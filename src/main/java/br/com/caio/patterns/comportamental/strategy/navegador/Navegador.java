package br.com.caio.patterns.comportamental.strategy.navegador;

import br.com.caio.patterns.comportamental.strategy.navegador.strategy.RotaStrategy;

public class Navegador {

    private RotaStrategy rotaStrategy;

    //contrutor
    public Navegador(RotaStrategy rotaStrategy) {
        this.rotaStrategy = rotaStrategy;
    }

    public void calculaRota(int a, int b){

        rotaStrategy.calculaRota(a, b);
    }

    //Sem Strategy
    void calculaRota(int a, int b, String transporte){

        switch (transporte) {
            case "Carro" -> System.out.println("Carro...");
            case "Onibus" -> System.out.println("Carro...");
            case "A pe" -> System.out.println("a pe...");
            default -> throw new IllegalArgumentException();
        }
    }
}
