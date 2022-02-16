package qaacademy_exercicios_junit.easy;

import javax.swing.JOptionPane;

public class Exercicio09_easy {

    public void calculaTabuada(int numeroDigitado) {
        int i = 1, resultado;
        while (i <= 10) {
            resultado = numeroDigitado * i;
            System.out.println(numeroDigitado + " X " + i + " = " + resultado);
            i++; // soma do i +1 pra entrar em loop infinito
        }
    }

}// fim da classe
