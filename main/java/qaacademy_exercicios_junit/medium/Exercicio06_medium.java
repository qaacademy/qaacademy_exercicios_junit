package qaacademy_exercicios_junit.medium;

import javax.swing.JOptionPane;

public class Exercicio06_medium {

    public int calculaFatorial(int fatorial) {
        int i;
        i = fatorial;
        while (i > 1) {// até i = 2
            fatorial = fatorial * (i - 1);
            i--;
        } // fecha while
        return fatorial;
    }// fecha calculoFatorial
}// fecha classe
