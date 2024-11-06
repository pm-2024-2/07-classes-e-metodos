class Main { // escopo {}

  public static void main(String[] args) {
    System.out.println("pronto");
    // array de inteiros
    int[] idades = {12, 76, 6, 87, 32};
    
    try {
      int m = Estatistica.max(idades);
      // Estatistica // Módulo
      System.out.println(m);
    } catch (IllegalArgumentException excecao) {
      System.err.println("Problema: " + excecao.getMessage());
    }

    int min = Estatistica.min(idades);
    System.out.println(min);
    System.out.println(Estatistica.min(idades));

    System.out.println(Estatistica.media(idades));

    // o método valida é private, é inacessível
    // Estatistica.valida(idades);
    
    // mediana
    // {4, 5, 8, 10, 12} = 8
    // {4, 5, 8, 10, 12, 14} = 9
    int[] valores = {8, 10, 12, 4, 5};
    int mediana = Estatistica.mediana(valores);
    System.out.println(mediana); // 8
  }
  
  

}

