import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

//        Comparator<String> comparador = new ComparadorPorTamanho();
//        //Collections.sort(palavras);
//        palavras.sort(comparador);

//        palavras.sort((s1, s2) -> {
//                if (s1.length() < s2.length())
//                    return -1;
//                if (s1.length() > s2.length())
//                    return 1;
//                return 0;
//            }
//        });

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

//        Comparator<String> comparador = new ComparadorPorTamanho();
//        //Collections.sort(palavras);
//        palavras.sort(comparador);
//
//        System.out.println(palavras);

//        for (String p : palavras) {
//            System.out.println(p);
//        }

//        palavras.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//    }

//        palavras.forEach((String s) -> {
//                System.out.println(s);
//            }
//        );

//        palavras.forEach(s -> {
//                    System.out.println(s);
//        });
//        Consumer<String> impressor = s -> System.out.println(s);
//        palavras.forEach(impressor);

        palavras.forEach(s -> System.out.println(s));
    }
}



class ComparadorPorTamanho implements Comparator<String> {

    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;

    }
}


