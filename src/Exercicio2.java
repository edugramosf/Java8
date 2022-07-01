import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort((Comparator.comparing(s -> s.length())));
        palavras.sort((Comparator.comparing(String::length)));
        System.out.println(palavras);
        }



    }
