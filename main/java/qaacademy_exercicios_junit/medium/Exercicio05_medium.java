package qaacademy_exercicios_junit.medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

    public int verificaMenorNumero() {
        int numeroDigitado;
        int menorNumero = 0, i = 1;

        while (i <= 5) {
            numeroDigitado = lerNumeroDigitado();
            
            if (numeroDigitado < menorNumero || i == 1) {
                menorNumero = numeroDigitado;
            }
            i++;
        }
        return menorNumero;
    }

    private int lerNumeroDigitado() {

        String numeroDigitadoString = JOptionPane.showInputDialog("Digite um numero");
        int numeroDigitado = Integer.parseInt(numeroDigitadoString); 

        return numeroDigitado;
    }
}
