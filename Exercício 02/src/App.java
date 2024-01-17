import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner newNumber = new Scanner(System.in);
        System.out.println("Digite o tamanho da sua sequência Fibonacci");
        int num = newNumber.nextInt();

        if(num > 0) {
            ArrayList<Integer> fibonacci = new ArrayList<Integer>();
            for(int cont = 0 ;cont < num ; cont++){
                if(fibonacci.size() > 1){
                    int num01 = fibonacci.get(cont-2);
                    int num02 = fibonacci.get(cont-1);
                    System.out.println("Esse é o num01 *" +num01);
                    System.out.println("Esse é o num02 *" +num02);
                    int soma = num01+num02;
                    System.out.println("Esse é a soma" +soma);
                    fibonacci.add(soma);
                }else {
                    fibonacci.add(cont);
                }
            }
            System.out.println(fibonacci);
        }
    }
}
