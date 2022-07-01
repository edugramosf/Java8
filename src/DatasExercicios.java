import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatasExercicios {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(hoje.format(formatter));

        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        System.out.println(dataFutura.format(formatter));

        Period periodo = Period.between(hoje, dataFutura);
        System.out.println(periodo.getYears() + " anos.");
    }
}
