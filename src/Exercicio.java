import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Exercicio {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        palavras.forEach(new Consumer<String>(){
            public void accept(String palavra) {
                System.out.println(palavra);
            }
        });

        palavras.forEach(s -> System.out.println(s));

        palavras.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;
            }
        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort((s1, s2) -> s1.length() - s2.length());

//        Não funciona porque Object não é uma interface funcional.
//        Object o = s -> System.out.println(s);


    }



}
