import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 26);
        LocalDate olimpiadasLosAngeles = LocalDate.of(2028, Month.JULY, 21);

        int anos = olimpiadasParis.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, olimpiadasParis);
        System.out.println(periodo.getDays());

//        LocalDate olimpiadasLosAngeles = olimpiadasParis.plusYears(4);

        System.out.println(olimpiadasLosAngeles);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = olimpiadasLosAngeles.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime intervalo = LocalTime.of(15, 30);
        System.out.println(intervalo);



    }
}
