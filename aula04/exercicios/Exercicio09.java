package aula04.exercicios;

public class Exercicio09 {
    public static void main(String[] args) {
        float f = 12.78f;
        long l = (long) f;   // casting explícito
        double d = l;        // casting implícito
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("double: " + d);
    }
}
