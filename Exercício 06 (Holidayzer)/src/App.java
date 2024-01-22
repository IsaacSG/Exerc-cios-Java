import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Feriados feriado1 = new Feriados("Confraternização Mundial", "01-01-2024");
        Feriados feriado2 = new Feriados("Carnaval", "12-02-2024");
        Feriados feriado3 = new Feriados("Carnaval", "13-02-2024");
        Feriados feriado4 = new Feriados("Sexta-feira Santa", "29-03-2024");
        Feriados feriado5 = new Feriados("Tiradentes", "21-04-2024");
        Feriados feriado6 = new Feriados("Dia do Trabalho", "01-05-2024");
        Feriados feriado7 = new Feriados("Corpus Christi", "30-05-2024");
        Feriados feriado8 = new Feriados("Independência do Brasil", "07-09-2024");
        Feriados feriado9 = new Feriados("Nossa Senhora Aparecida", "12-10-2024");
        Feriados feriado10 = new Feriados("Finados", "02-11-2024");
        Feriados feriado11 = new Feriados("Proclamação da República", "15-11-2024");
        Feriados feriado12 = new Feriados("Dia Nacional de Zumbi e da Consciência Negra", "20-11-2024");
        Feriados feriado13 = new Feriados("Natal", "25-12-2024");


        Scanner newBoll = new Scanner(System.in);
        System.out.println("1 para ver os feriados ou 0 para outra opção");
        Integer boll = newBoll.nextInt();

        if(boll == 1){
            System.out.println(feriado1.getFeriado());
            System.out.println(feriado2.getFeriado());
            System.out.println(feriado3.getFeriado());
            System.out.println(feriado4.getFeriado());
            System.out.println(feriado5.getFeriado());
            System.out.println(feriado6.getFeriado());
            System.out.println(feriado7.getFeriado());
            System.out.println(feriado8.getFeriado());
            System.out.println(feriado9.getFeriado());
            System.out.println(feriado10.getFeriado());
            System.out.println(feriado11.getFeriado());
            System.out.println(feriado12.getFeriado());
            System.out.println(feriado13.getFeriado());
        }

        }
    }