package qaacademy_exercicios_junit.medium;

import javax.swing.JOptionPane;

public class Exercicio02_medium {

    public double calculaInvestimentoJurosCompostos(double valorInvestimento) {

        double taxaJuros = 0.05, totalAtualizadoComJuros;
        int ano = 1, tempoInvestido = 10;
        totalAtualizadoComJuros = valorInvestimento;

        while (ano <= tempoInvestido) {
            totalAtualizadoComJuros = 
            (totalAtualizadoComJuros * taxaJuros) + totalAtualizadoComJuros;
            ano++;
        } // fim while
        
        return totalAtualizadoComJuros - valorInvestimento;

    }// fim 

    public double calculaValorTotalInvestimento(double valorInvestimento, double valorJuros) {
        return valorInvestimento + valorJuros;
    }
}// fim da classe
