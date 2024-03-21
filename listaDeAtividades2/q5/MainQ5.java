package listaDeAtividades2.q5;

import java.io.*;

public class MainQ5 {
    public static void main(String[] args) {
        WordFrequencyCounter counter = new WordFrequencyCounter();

        // Ler o texto de um arquivo
        StringBuilder textBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("listaDeAtividades2/q5/input/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                textBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String text = textBuilder.toString();

        counter.countWords(text);

        // Salvar para arquivo de texto
        counter.saveToFileText("listaDeAtividades2/q5/output/word_frequency.txt");
        // Salvar para arquivo binário
        counter.saveToFileBinary("listaDeAtividades2/q5/output/word_frequency.bin");

        // Carregar do arquivo de texto
        System.out.println("Frequência das palavras a partir do arquivo de texto:");
        counter.loadFromFileText("listaDeAtividades2/q5/output/word_frequency.txt");

        // Carregar do arquivo binário
        System.out.println("\nFrequência das palavras a partir do arquivo binário:");
        counter.loadFromFileBinary("listaDeAtividades2/q5/output/word_frequency.bin");
    }
}
