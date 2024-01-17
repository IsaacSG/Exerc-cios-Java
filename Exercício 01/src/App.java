import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner newNumber = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = newNumber.nextInt();

        if(num % 2 == 0) {
            if(num > -1) {
                System.out.println("O número " + num + " é par e positivo");
            }else {
                System.out.println("O número " + num + " é par e negativo");
            }
        }else {
            if(num > -1) {
                System.out.println("O número " + num + " é impar e positivo");
            }else {
                System.out.println("O número " + num + " é impar e negativo");
            }
        }
    }
}
 