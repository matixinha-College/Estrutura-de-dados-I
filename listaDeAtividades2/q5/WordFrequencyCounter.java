package listaDeAtividades2.q5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class WordFrequency implements Serializable {
    String word;
    int frequency;
    WordFrequency next;

    WordFrequency(String word) {
        this.word = word;
        this.frequency = 1;
        this.next = null;
    }
}

public class WordFrequencyCounter {
    private WordFrequency head;

    WordFrequencyCounter() {
        this.head = null;
    }

    void countWords(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (head == null) {
                head = new WordFrequency(word);
            } else {
                WordFrequency current = head;
                while (current != null) {
                    if (current.word.equals(word)) {
                        current.frequency++;
                        break;
                    }
                    if (current.next == null) {
                        current.next = new WordFrequency(word);
                        break;
                    }
                    current = current.next;
                }
            }
        }
    }

    void saveToFileText(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            WordFrequency current = head;
            while (current != null) {
                writer.println(current.word + ": " + current.frequency);
                current = current.next;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void saveToFileBinary(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(head);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void loadFromFileText(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void loadFromFileBinary(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            head = (WordFrequency) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
