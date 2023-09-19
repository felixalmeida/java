public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        double saldo = 26.0;
        double valorSaque = 15.0;

        if (valorSaque < saldo)
            saldo = saldo - valorSaque;
        
            System.out.println("Saldo atual: " + saldo);
    }
}
