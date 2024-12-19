public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Enrolados");

        int anoDeLancamento = 2010;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;


        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println("Média das notas: " + media);
        String sinopse;
        sinopse = """
                  Filme infantil da Disney
                  Muito bom!
                  """;
        System.out.println(sinopse);

        int classificacao =  (int) (media/2);
        System.out.println(classificacao);


    }
}


