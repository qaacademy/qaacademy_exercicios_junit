package qaacademy_exercicios_junit.easy;
import javax.swing.JOptionPane;

public class Exercicio10_2_easy {

    public double calcularValorJuros(double valorInvestimento) {
        double valorJuros = 0.0, taxaJuros = 0.05, ano = 1;
        valorInvestimento = 1000.00;

        while (ano <= 10) {
            valorJuros = valorJuros + (valorInvestimento * taxaJuros);
            ano = ano + 1;
        }

        return valorJuros;
    }

}
