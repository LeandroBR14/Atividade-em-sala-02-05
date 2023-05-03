/*
Tarefa 2. Dado dois valores inteiros, retornar a sua soma. A menos que os dois valores sejam os mesmos, então retorne o dobro de sua soma.
*/

public class Atividade2 {
    public static void main(String[] args) {
        int soma1 = sumDouble(1, 2);
        int soma2 = sumDouble(3, 2);
        int soma3 = sumDouble(2, 2);

        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(soma3);
    }

    public static int sumDouble(int a, int b) {
        int soma = a + b;
        if (a == b) {
            soma = 2 * soma;

        } else { 
        }
        return soma;

    }
}