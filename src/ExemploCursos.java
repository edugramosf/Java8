import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

public class ExemploCursos {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
        cursos.stream().map(Curso::getAlunos).filter(alunos -> alunos > 50).forEach(System.out::println);

        int sum = cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(Curso::getAlunos).sum();

        System.out.println("Total de alunos dos cursos: " + sum);
        System.out.println();

        cursos.stream().map(s -> s.getNome()).forEach(s -> System.out.println(s));
        System.out.println("______________________________________");
        cursos.stream().map(Curso::getNome).forEach(System.out::println);
        System.out.println("______________________________________");


        cursos.stream().map(Curso::getAlunos).filter(alunos -> alunos > 50).forEach(System.out::println);

    }
}
