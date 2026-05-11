import java.util.ArrayList;
import java.util.Scanner;

public class Lst {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        String entrada = "";

        System.out.println("Gerenciador de Tarefas");
        System.out.println("Digite suas tarefas (ou 'fim' para encerrar):");

        while (true) {
            System.out.print("> ");
            entrada = leitor.nextLine();

            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            tarefas.add(entrada);
        }

        System.out.println("\nSuas Tarefas do Dia");

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }

        leitor.close();
    }
}