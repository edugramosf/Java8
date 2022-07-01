import java.util.ArrayList;
import java.util.List;

public class Exercicio2MethodReferenceNoLugarDeForEach {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.forEach(s -> System.out.println(s));
        System.out.println("------------------------");
        palavras.forEach(System.out::println);

    }
}
