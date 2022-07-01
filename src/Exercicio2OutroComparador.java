import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Exercicio2OutroComparador {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(palavras);
    }
}
