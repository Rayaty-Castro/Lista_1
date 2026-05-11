import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Precos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Double> listaPrecos = new ArrayList<>();

        System.out.println("Controle de Preços");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º preço: R$ ");
            double preco = leitor.nextDouble();
            listaPrecos.add(preco);
        }

        double maior = Collections.max(listaPrecos);
        double menor = Collections.min(listaPrecos);

        System.out.println("\nResumo de Preços");
        System.out.println("Lista de preços digitados: " + listaPrecos);
        System.out.printf("O maior preço encontrado foi: R$ %.2f%n", maior);
        System.out.printf("O menor preço encontrado foi: R$ %.2f%n", menor);

        leitor.close();
    }
}
