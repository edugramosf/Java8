import java.util.*;
import java.util.stream.Collectors;
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
        cursos.stream().map(Curso::getAlunos).filter(alunos -> alunos > 100).forEach(System.out::println);

        int sum = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();

        System.out.println("Total de alunos dos cursos: " + sum);
        System.out.println();

        cursos.stream().map(s -> s.getNome()).forEach(s -> System.out.println(s));
        System.out.println("______________________________________");
        cursos.stream().map(Curso::getNome).forEach(System.out::println);
        System.out.println("______________________________________");


//        cursos.stream()
//                .map(Curso::getAlunos)
//                .filter(alunos -> alunos > 100)
//                .forEach(System.out::println);

//        cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 100)
//                .findAny()
//                .ifPresent(curso -> System.out.println(curso.getNome()));

//        cursos = cursos.stream()
//                .filter(curso -> curso.getAlunos() >= 100)
//                .collect(Collectors.toList());

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));
        System.out.println("______________________________________");


        cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average()
                .ifPresent(System.out::println);


        System.out.println();
        System.out.println("______________________________________");

        cursos.stream().forEach(curso -> System.out.println(curso.getNome()));

        System.out.println();
        System.out.println("______________________________________");

        List<Curso> cursosFiltrados = cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .collect(Collectors.toList());

        cursosFiltrados.forEach(curso -> System.out.println(curso.getAlunos()));

    }
}
