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

}
