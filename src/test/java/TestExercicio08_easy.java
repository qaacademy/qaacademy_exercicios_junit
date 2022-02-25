import java.text.DecimalFormat;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import qaacademy_exercicios_junit.easy.Exercicio08_easy;

public class TestExercicio08_easy {
    static Exercicio08_easy exercicio08_easy;
    static DecimalFormat decimalFormat;

    @BeforeClass
    public static void before() {
        exercicio08_easy = new Exercicio08_easy();
        decimalFormat = new DecimalFormat("#,###.00");
    }

    @Test
    public void testeSalarioPrimeiraFaixaIR() {

        String valorEsperado = "0.0";
        Double valorAtual = exercicio08_easy.calculaImpostoDeRenda(1903.98);
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }

    @Test
    public void testeSalarioSegundaFaixaIr() {
        String valorEsperado = "0.0";
        Double valorAtual = exercicio08_easy.calculaImpostoDeRenda(1903.99);
        Assert.assertEquals(valorEsperado, valorAtual.toString());
    }

    @Test
    public void testeSalarioSegundaFaixaIrSegundaCondicao() {

        String valorEsperado = "69,20";
        String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(2826.65));
        Assert.assertEquals(valorEsperado, valorAtual);
    }


        @Test
        public void testeSalarioTerceiraFaixaIrPrimeiraCondicao() {
    
            String valorEsperado = "69,20";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(2826.66));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioTerceiraFaixaIrSegundaCondicao() {
    
            String valorEsperado = "207,86";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(3751.05));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioQuartaFaixaIrPrimeiraCondicao() {
            String valorEsperado = "207,86";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(3751.06));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioQuartaFaixaIrSegundaCondicao() {
    
            String valorEsperado = "413,42";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(4664.68));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioQuintaFaixaIr() {

            String valorEsperado = "413,43";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaImpostoDeRenda(4664.69));
            Assert.assertEquals(valorEsperado, valorAtual);
        }

        @Test
        public void testeSalarioLiquido() {

            String valorEsperado = "1.992,80";
            String valorAtual = decimalFormat.format(exercicio08_easy.calculaSalarioLiquido(2000.00, exercicio08_easy.calculaImpostoDeRenda(2000.00)));
            Assert.assertEquals(valorEsperado, valorAtual);
        }



}
