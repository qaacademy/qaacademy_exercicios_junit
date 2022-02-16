package qaacademy_exercicios_junit.medium;

import javax.swing.JOptionPane;

public class Exercicio09_medium {
    public void recebeImprimeNomeNumeroAlunos() {

        String[] alunosVetor = new String[5];
        int[] numeroAlunosVetor = new int[5];
        int i = 0;

        while (i < 5) {
            alunosVetor[i] = recebeAluno();
            numeroAlunosVetor[i] = recebeNumeroAluno();
            i++;
        } // fim primeiro enquanto
        imprimeNomeNumero(alunosVetor, numeroAlunosVetor);
    }// fim main

    private void imprimeNomeNumero(String [] vetorNomes, int [] vetorNumeros) {
        int i = 0;
        while (i < 5) {
            System.out.println("Nome do Aluno: " + vetorNomes[i] + " - " + "Numero do aluno:" + vetorNumeros[i]);
            i++;
        }
    }

    private int recebeNumeroAluno() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o número do Aluno"));
    }

    private String recebeAluno() {
        return JOptionPane.showInputDialog("Digite o nome do Aluno");
    }

}// fim Classe