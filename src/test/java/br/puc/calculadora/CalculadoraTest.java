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

}
