package qaacademy_exercicios_junit.easy;

import javax.swing.JOptionPane;

public class Exercicio05_easy {// inicio classe

    public int soma(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int soma;
        soma = primeiroNumero + segundoNumero + terceiroNumero;
        return soma;
    }

    public int subtracao(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int subtracao;
        subtracao = primeiroNumero - segundoNumero - terceiroNumero;
        return subtracao;
    }

    public int multiplicacao(int primeiroNumero, int segundoNumero, int terceiroNumero) {
        int multiplicacao;
        multiplicacao = primeiroNumero * segundoNumero * terceiroNumero;
        return multiplicacao;
    }

    public int media(int soma) {
        int media;
        media = soma / 3;
        return media;

    }
}// fim classe