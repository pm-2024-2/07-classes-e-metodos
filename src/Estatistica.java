import java.util.Arrays;

class Estatistica { // ESCOPO dos métodos abaixo
// líder técnico, arquiteta de software, senior engineer
    static int media(int[] inteiros) {
        Estatistica.valida(inteiros);

        int soma = 0;
        for (var i = 0; i < inteiros.length; i++) {
            soma += inteiros[i];
        }
        return soma / inteiros.length;
    }

    static int max(int[] inteiros) {
        valida(inteiros);

        int max = inteiros[0];
        for (var i = 1; i < inteiros.length; i++) {
            if (inteiros[i] > max) {
                max = inteiros[i];
            }
        }
        return max;
    }

    static int min(int[] inteiros) {
        valida(inteiros);

        int min = inteiros[0];
        for (var i = 1; i < inteiros.length; i++) {
            if (inteiros[i] < min) {
                min = inteiros[i];
            }
        }
        return min;
    }

    // void: não retorno de valor
    // private: visível apenas dentro
    // do próprio módulo (classe)
    private static void valida(int[] inteiros) {
        if (inteiros.length == 0) {
            throw new IllegalArgumentException("o array está vazio");
        }
    }

    static int mediana(int[] valores) {
        valida(valores);
        Arrays.sort(valores);
        return valores[valores.length / 2];
    }
}
