package qaacademy_exercicios_junit.easy;
import javax.swing.JOptionPane;

public class Exercicio10_1_easy {

    public static void main(String[] args) {
        double valorJuros, taxaJuros = 0.05, valorInvestimento, valorTotal;
        valorInvestimento = 1000.00;
        valorJuros = (10 * taxaJuros) * valorInvestimento;
        valorTotal = valorJuros + valorInvestimento;

        System.out.println("Valor Investido: R$ "+ valorInvestimento);
        System.out.println("Valor Juros: R$ "+ valorJuros);
        System.out.println("Valor Total com Juros: R$ "+ valorTotal);
    }

}
