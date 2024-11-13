import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TarefaOnlineColecaoParte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos nomes separados por vírgula
        System.out.println("Digite os nomes separados por vírgula:");
        String input = scanner.nextLine();

        // Criando uma coleção ArrayList e adicionando os nomes
        ArrayList<String> nomes = new ArrayList<>();
        for (String nome : input.split(",")) {
            nomes.add(nome.trim());
        }

        // Ordenando os nomes em ordem alfabética
        Collections.sort(nomes);

        // Imprimindo os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
     
    
    