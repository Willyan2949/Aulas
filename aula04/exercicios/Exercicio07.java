package aula04.exercicios;

public class Exercicio07 {
    public static void main(String[] args) {
        boolean cond1 = true, cond2 = false, cond3 = true;
        System.out.println("cond1 && cond2 = " + (cond1 && cond2));
        System.out.println("cond1 && cond3 = " + (cond1 && cond3));
        System.out.println("cond1 || cond2 = " + (cond1 || cond2));
        System.out.println("cond2 || cond3 = " + (cond2 || cond3));
        System.out.println("cond1 && cond2 || cond3 = " + (cond1 && cond2 || cond3));
    }
}
