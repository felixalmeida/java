import java.util.Locale;
import java.util.Scanner;

public class ResultadoTernario {
           
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }

}