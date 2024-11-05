class Estatistica { // ESCOPO dos métodos abaixo

    static int media(int[] inteiros) {
        int soma = 0;
        for (var i = 0; i < inteiros.length; i++) {
            soma += inteiros[i];
        }
        return soma / inteiros.length;
    }

    static int max(int[] inteiros) {
        // validação: guard clause
        if (inteiros.length == 0) {
            // throw => lançar
            throw new IllegalArgumentException("o array está vazio");
        }

        int max = inteiros[0];
        for (var i = 1; i < inteiros.length; i++) {
            if (inteiros[i] > max) {
                max = inteiros[i];
            }
        }
        return max;
    }

    static int min(int[] inteiros) {
        if (inteiros.length == 0) {
            throw new IllegalArgumentException("o array está vazio");
        }

        int min = inteiros[0];
        for (var i = 1; i < inteiros.length; i++) {
            if (inteiros[i] < min) {
                min = inteiros[i];
            }
        }
        return min;
    }
}
