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

    /**
     * Método principal para demonstração das funcionalidades
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== DEMONSTRAÇÃO DA CALCULADORA ===");
        System.out.println("Soma: 10 + 5 = " + calc.somar(10, 5));
        System.out.println("Subtração: 10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: 10 * 5 = " + calc.multiplicar(10, 5));
        System.out.println("Divisão: 10 / 5 = " + calc.dividir(10, 5));

        // Exemplo de tratamento de exceção
        try {
            calc.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
