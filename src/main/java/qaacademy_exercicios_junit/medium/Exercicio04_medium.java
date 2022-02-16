package qaacademy_exercicios_junit.medium;

public class Exercicio04_medium {

    public void multiplicacaoNumerosAteMil() {

        int i = 1, resultadoMultiplicacao = 1;

        while (i <= 1000) {
            resultadoMultiplicacao = resultadoMultiplicacao * i;
            System.out.println("O resultado da multiplicação é: " 
            + resultadoMultiplicacao);
            if (resultadoMultiplicacao >= 1000) {
                resultadoMultiplicacao = 1;
                System.out.println("Foi Zerado");
            }
            i++;
        } // fim while

    }// fim main
}// fim classe