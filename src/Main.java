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

  }
  
  

}

