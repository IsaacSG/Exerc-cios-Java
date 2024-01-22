import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        fillHolidaysList();
        getHolidays();
        isDateHoliday("01-01-2024");
        isDateHoliday("02-01-2024");
    }

    static List<Holiday> holidays = new ArrayList<>();

    public static void getHolidays() {
        for (Holiday h : holidays) {
            System.out.println(h.getDate() + ": " + h.getName());
        }
    }

    public static void isDateHoliday(String date) {
        for (Holiday h : holidays) {
            if (h.getDate().equals(date)) {
                System.out.println("Dia " + h.getDate() + " é " + h.getName() + "!");
                return;
            }
        }
        System.out.println("Dia " + date + " não é feriado");
    }

    public static void fillHolidaysList() {
        holidays.clear();
        holidays.add(new Holiday("Confraternização Mundial", "01-01-2024"));
        holidays.add(new Holiday("Carnaval", "12-02-2024"));
        holidays.add(new Holiday("Carnaval", "13-02-2024"));
        holidays.add(new Holiday("Sexta-feira Santa", "29-03-2024"));
        holidays.add(new Holiday("Tiradentes", "21-04-2024"));
        holidays.add(new Holiday("Dia do Trabalho", "01-05-2024"));
        holidays.add(new Holiday("Corpus Christi", "30-05-2024"));
        holidays.add(new Holiday("Independência do Brasil", "07-09-2024"));
        holidays.add(new Holiday("Nossa Senhora Aparecida", "12-10-2024"));
        holidays.add(new Holiday("Finados", "02-11-2024"));
        holidays.add(new Holiday("Proclamação da República", "15-11-2024"));
        holidays.add(new Holiday("Dia Nacional de Zumbi e da Consciência Negra", "20-11-2024"));
        holidays.add(new Holiday("Natal", "25-12-2024"));
    }

}