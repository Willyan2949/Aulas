package aula04.exercicios;

public class Exercicio04 {
    public static void main(String[] args) {
        double decimal = 9.99;
        int inteiro = (int) decimal; // casting explícito (perde a parte fracionária)
        System.out.println("double: " + decimal);
        System.out.println("int: " + inteiro);
    }
}
