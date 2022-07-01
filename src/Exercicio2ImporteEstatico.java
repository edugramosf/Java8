import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Exercicio2ImporteEstatico {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort((comparing(s -> s.length())));
        palavras.sort((comparing(String::length)));
        System.out.println(palavras);
    }
}
