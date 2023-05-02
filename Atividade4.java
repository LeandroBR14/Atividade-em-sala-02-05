/*
Tarefa 4. Dados dois números inteiros quaisquer, retorne o número mais próximo a 10
*/

public class Atividade4 {
    public static void main(String[] args) {
        int close10_1 = close10(8, 13);
        int close10_2 = close10(13, 8);
        int close10_3 = close10(13, 7);

        System.out.println(close10_1);
        System.out.println(close10_2);
        System.out.println(close10_3);
    }

    public static int close10(int a, int b) {

        int distanciaA, distanciaB;
        distanciaA = a - 10;
        distanciaB = b - 10;

        if (a < 10) {
            distanciaA = -1 * distanciaA;
        }

        if (b < 10) {
            distanciaB = -1 * distanciaB;
        }

        if (distanciaA > distanciaB) {
            return b;
        } else {
            return a;
        }
    }
}