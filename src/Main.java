class Main { // escopo {}

  public static void main(String[] args) {
    System.out.println("pronto");
    // array de inteiros
    int[] idades = {12, 76, 6, 87, 32};

    // TODO: implementar amplitude
    int amplitude = Estatistica.amplitude(idades);
    // 81
    System.out.println(amplitude); // 81
    
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
    
    int[] valores = {8, 10, 12, 4, 5};
    int mediana = Estatistica.mediana(valores);
    System.out.println(mediana); // 8

    // {4, 5, 8, 10, 12, 14} = 9
    int[] valores2 = {4, 5, 8, 10, 12, 14};
    int mediana2 = Estatistica.mediana(valores2);
    // FIXME: fazer retornar 9
    System.out.println(mediana2); // deve dar 9


    // EXERCÍCIO ============================================================
    String curso = "TADS";
    String aluno = "ALUCARD";
    int semestre = 2;

    System.out.println("O(A) estudante " + aluno + " está matriculado(a) no " + semestre + "º semestre do curso " + curso);

    // TODO: implementar a classe Texto e método formatar.
    // Não pode usar o recurso de substring e replace do Java, apenas o básico de percorrer e concatenar strings.
    // Pode (e é recomendado) dividir a funcionalidade em métodos adicionais.
    String msg = Texto.formatar("O(A) estudante %% está matriculado(a) no %%º semestre do curso %%", aluno, semestre, curso);
    System.out.println(msg);

    // TODO: inverted string, ex.: tads -> sdat, não pode usar as classes prontas do Java.
    String reversed = Texto.inverter(aluno);
    System.out.println(reversed);
  }
}

