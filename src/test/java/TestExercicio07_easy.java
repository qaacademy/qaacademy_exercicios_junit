import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio07_easy;

public class TestExercicio07_easy {
    static Exercicio07_easy exercicio07_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio07_easy = new Exercicio07_easy();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeSalarioPrimeiraFaixaInss() {

        String valorEsperado = "78,38";
        String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(1045.00));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixaInss() {

        String valorEsperado = "94,05";
        String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(1045.01));
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    @Test
    public void testeSalarioSegundaFaixaInssSegundaCondicao() {

        String valorEsperado = "188,06";
        String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(2089.60));
        Assert.assertEquals(valorEsperado, valorAtual);
    }


        @Test
        public void testeSalarioTerceiraFaixaInssPrimeiraCondicao() {
    
            String valorEsperado = "250,75";
            String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(2089.61));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioTerceiraFaixaInssSegundaCondicao() {
    
            String valorEsperado = "376,13";
            String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(3134.40));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        // 3134.41 && salario <= 6101.06
        @Test
        public void testeSalarioQuartaFaixaInssPrimeiraCondicao() {
    
            String valorEsperado = "438,82";
            String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(3134.41));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioQuartaFaixaInssSegundaCondicao() {
    
            String valorEsperado = "854,15";
            String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(6101.06));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioQuintaFaixaInss() {
    
            String valorEsperado = "854,15";
            String valorAtual = decimalFormat.format(exercicio07_easy.calculaInss(6101.07));
            Assert.assertEquals(valorEsperado, valorAtual);
        }



}
