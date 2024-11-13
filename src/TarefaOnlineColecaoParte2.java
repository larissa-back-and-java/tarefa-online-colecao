import java.util.ArrayList;
import java.util.Scanner;

public class TarefaOnlineColecaoParte2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos nomes com o formato "Nome-M" ou "Nome-F"
        System.out.println("Digite os nomes e sexos separados por vírgula (ex: Rodrigo-M, Luana-F):");
        String input = scanner.nextLine();
        
        // Separando os nomes e sexos usando o método split
        String[] entradas = input.split(",");
        
        ArrayList<String> masculino = new ArrayList<>();
        ArrayList<String> feminino = new ArrayList<>();
        
        for (String entrada : entradas) {
            entrada = entrada.trim();
            String[] partes = entrada.split("-");
            
            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();
            
            if (sexo.equals("M")) {
                masculino.add(nome);
            } else if (sexo.equals("F")) {
                feminino.add(nome);
            }
        }
        
        // Imprimindo os grupos
        System.out.println("\nGrupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        System.out.println("\nGrupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}