import java.util.ArrayList;
import java.util.Scanner;

public class Convidados {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        System.out.println("Cadastro de Convidados");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome do " + i + "º convidado: ");
            String nome = leitor.nextLine();
            lista.add(nome);
        }

        System.out.println("\n Lista Final de Convidados");

        for (String convidado : lista) {
            System.out.println("- " + convidado);
        }

        System.out.println("\nTotal de convidados: " + lista.size());

        leitor.close();
    }
}