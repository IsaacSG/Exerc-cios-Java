import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner newNumber = new Scanner(System.in);
        System.out.println("Digite o número que vc quer a tabuada");
        int num = newNumber.nextInt();

        System.out.println("Tabela de multiplicação de " + num);

        for(int cont = 1; cont<=10; cont++){
            int multiplicacao = num*cont;
            System.out.println(num + " x " + cont + " = " + multiplicacao);
        }
    }
}
