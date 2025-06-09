package br.puc.calculadora;

/**
 * Classe Calculadora - Implementa as quatro operações básicas matemáticas
 */
public class Calculadora {

    /**
     * Realiza a operação de adição entre dois números
     */
    public double somar(double a, double b) {
        return a + b;
    }

    /**
     * Realiza a operação de subtração entre dois números
     */
    public double subtrair(double a, double b) {
        return a - b;
    }

    /**
     * Realiza a operação de multiplicação entre dois números
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Realiza a operação de divisão entre dois números
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }