public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else  {
            System.out.println("Filme infantil que vale a pena assistir");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar pelo filme");
        }
    }
}
