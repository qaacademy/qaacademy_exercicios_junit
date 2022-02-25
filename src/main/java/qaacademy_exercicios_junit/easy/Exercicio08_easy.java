package qaacademy_exercicios_junit.easy;

import javax.swing.JOptionPane;

public class Exercicio08_easy {

    public double calculaImpostoDeRenda(double salario) {

        double salarioLiquido = 0.0, impostoRenda = 0.0;

        if (salario <= 1903.98) {
            impostoRenda = 0.0;
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            impostoRenda = (salario * 0.075) - 142.80;
            if (impostoRenda <= 0) {
                impostoRenda = 0.0;
            }
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            impostoRenda = (salario * 0.15) - 354.8;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            impostoRenda = (salario * 0.225) - 636.13;
        }
        if (salario > 4664.68) {
            impostoRenda = (salario * 0.275) - 869.36;
        } // fim if

        return impostoRenda;

    }// fim

    public double calculaSalarioLiquido(double salario, double impostoDeRenda) {
        return salario - impostoDeRenda;
    }

}// Fim da classe
