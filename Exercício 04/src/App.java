import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner newNumber = new Scanner(System.in);
        System.out.println("Digite o tamanho da sua pirâmide");
        int num = newNumber.nextInt();

        if(num > 0){
            ArrayList<Integer> piramide = new ArrayList<Integer>();

            for(int cont = 1; cont <= num; cont++){
                piramide.clear();
                for(int cont2 = cont; cont2 > 0; cont2--){
                    piramide.add(cont);
                }
                System.out.println(piramide);
            }
        }
    }
}
