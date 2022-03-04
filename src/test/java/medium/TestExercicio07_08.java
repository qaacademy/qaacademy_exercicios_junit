package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.medium.Exercicio07_08_medium;

public class TestExercicio07_08 {

    static Exercicio07_08_medium ex7;
    static String[] vetorMesesEsperado;

    @BeforeClass
    public static void before() {
        ex7 = new Exercicio07_08_medium();
        vetorMesesEsperado = new String[12];
        vetorMesesEsperado[0] = "Janeiro";
        vetorMesesEsperado[1] = "Fevereiro";
        vetorMesesEsperado[2] = "Março";
        vetorMesesEsperado[3] = "Abril";
        vetorMesesEsperado[4] = "Maio";
        vetorMesesEsperado[5] = "Junho";
        vetorMesesEsperado[6] = "Julho";
        vetorMesesEsperado[7] = "Agosto";
        vetorMesesEsperado[8] = "Setembro";
        vetorMesesEsperado[9] = "Outubro";
        vetorMesesEsperado[10] = "Novembro";
        vetorMesesEsperado[11] = "Dezembro";
    }

    @Test
    public void testeVetorMeses() {
       Assert.assertArrayEquals(vetorMesesEsperado, ex7.criaVetorMeses());
    }

    @Test
    public void testeImprimeVetorMeses() {
      ex7.imprimeValoresVetor(vetorMesesEsperado);
    }

}
