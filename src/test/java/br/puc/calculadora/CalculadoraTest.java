package br.puc.calculadora;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de testes para a Calculadora
 * Utiliza JUnit 5 para testar todas as funcionalidades
 */
@DisplayName("Testes da Calculadora")
public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Nested
    @DisplayName("Testes de Adição")
    class TestesAdicao {

        @Test
        @DisplayName("Soma de números positivos")
        void testSomaPositivos() {
            assertEquals(8.0, calculadora.somar(5, 3), 0.001);
            assertEquals(15.0, calculadora.somar(10, 5), 0.001);
        }

        @Test
        @DisplayName("Soma de números negativos")
        void testSomaNegativos() {
            assertEquals(-8.0, calculadora.somar(-5, -3), 0.001);
            assertEquals(-15.0, calculadora.somar(-10, -5), 0.001);
        }

        @Test
        @DisplayName("Soma com zero")
        void testSomaComZero() {
            assertEquals(5.0, calculadora.somar(5, 0), 0.001);
            assertEquals(0.0, calculadora.somar(0, 0), 0.001);
            assertEquals(-5.0, calculadora.somar(-5, 0), 0.001);
        }

        @Test
        @DisplayName("Soma de positivo com negativo")
        void testSomaPositivoNegativo() {
            assertEquals(2.0, calculadora.somar(5, -3), 0.001);
            assertEquals(-2.0, calculadora.somar(-5, 3), 0.001);
        }
    }

    @Nested
    @DisplayName("Testes de Subtração")
    class TestesSubtracao {

        @Test
        @DisplayName("Subtração de números positivos")
        void testSubtracaoPositivos() {
            assertEquals(2.0, calculadora.subtrair(5, 3), 0.001);
            assertEquals(5.0, calculadora.subtrair(10, 5), 0.001);
        }

        @Test
        @DisplayName("Subtração de números negativos")
        void testSubtracaoNegativos() {
            assertEquals(-2.0, calculadora.subtrair(-5, -3), 0.001);
            assertEquals(-5.0, calculadora.subtrair(-10, -5), 0.001);
        }

        @Test
        @DisplayName("Subtração com zero")
        void testSubtracaoComZero() {
            assertEquals(5.0, calculadora.subtrair(5, 0), 0.001);
            assertEquals(0.0, calculadora.subtrair(0, 0), 0.001);
            assertEquals(-5.0, calculadora.subtrair(0, 5), 0.001);
        }

        @Test
        @DisplayName("Subtração de positivo com negativo")
        void testSubtracaoPositivoNegativo() {
            assertEquals(8.0, calculadora.subtrair(5, -3), 0.001);
            assertEquals(-8.0, calculadora.subtrair(-5, 3), 0.001);
        }

    }

    @Nested
    @DisplayName("Testes de Multiplicação")
    class TestesMultiplicacao {

        @Test
        @DisplayName("Multiplicação de números positivos")
        void testMultiplicacaoPositivos() {
            assertEquals(15.0, calculadora.multiplicar(5, 3), 0.001);
            assertEquals(50.0, calculadora.multiplicar(10, 5), 0.001);
        }

        @Test
        @DisplayName("Multiplicação de números negativos")
        void testMultiplicacaoNegativos() {
            assertEquals(15.0, calculadora.multiplicar(-5, -3), 0.001);
            assertEquals(50.0, calculadora.multiplicar(-10, -5), 0.001);
        }

        @Test
        @DisplayName("Multiplicação com zero")
        void testMultiplicacaoComZero() {
            assertEquals(0.0, calculadora.multiplicar(5, 0), 0.001);
            assertEquals(0.0, calculadora.multiplicar(0, 5), 0.001);
            assertEquals(0.0, calculadora.multiplicar(0, 0), 0.001);
        }

        @Test
        @DisplayName("Multiplicação de positivo com negativo")
        void testMultiplicacaoPositivoNegativo() {
            assertEquals(-15.0, calculadora.multiplicar(5, -3), 0.001);
            assertEquals(-15.0, calculadora.multiplicar(-5, 3), 0.001);
        }
    }

     @Nested
    @DisplayName("Testes de Divisão")
    class TestesDivisao {

        @Test
        @DisplayName("Divisão de números positivos")
        void testDivisaoPositivos() {
            assertEquals(2.0, calculadora.dividir(10, 5), 0.001);
            assertEquals(1.666, calculadora.dividir(5, 3), 0.001);
        }

        @Test
        @DisplayName("Divisão de números negativos")
        void testDivisaoNegativos() {
            assertEquals(2.0, calculadora.dividir(-10, -5), 0.001);
            assertEquals(1.666, calculadora.dividir(-5, -3), 0.001);
        }

        @Test
        @DisplayName("Divisão com zero no numerador")
        void testDivisaoZeroNumerador() {
            assertEquals(0.0, calculadora.dividir(0, 5), 0.001);
            assertEquals(0.0, calculadora.dividir(0, -5), 0.001);
        }

        @Test
        @DisplayName("Divisão de positivo com negativo")
        void testDivisaoPositivoNegativo() {
            assertEquals(-2.0, calculadora.dividir(10, -5), 0.001);
            assertEquals(-2.0, calculadora.dividir(-10, 5), 0.001);
        }

        @Test
        @DisplayName("Divisão por zero, deve lançar exceção")
        void testDivisaoPorZero() {
            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
                calculadora.dividir(10, 0);
            });
            assertEquals("Divisão por zero não é permitida", exception.getMessage());
        }

        @Test
        @DisplayName("Divisão por zero negativo deve lançar exceção")
        void testDivisaoPorZeroNegativo() {
            ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
                calculadora.dividir(-10, 0);
            });
            assertEquals("Divisão por zero não é permitida", exception.getMessage());
        }
    }

}
