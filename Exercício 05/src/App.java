import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Scanner newArraySize = new Scanner(System.in);
        // System.out.println("Digite o tamanho do seu primeiro array");
        // int arraySize = newArraySize.nextInt();

        // if (arraySize > 0) {
        //     ArrayList<String> array01 = new ArrayList<String>();

        //     for (int cont = 0; cont < arraySize; cont++) {
        //         Scanner newStringArray = new Scanner(System.in);
        //         System.out.println("Digite uma palavra para o seu array01");
        //         String stringArray = newStringArray.nextLine();
        //         array01.add(stringArray);
        //     }
        // }
        // Scanner newArraySize02 = new Scanner(System.in);
        // System.out.println("Digite o tamanho do seu segundo array");
        // int arraySize02 = newArraySize02.nextInt();

        // if (arraySize02 > 0) {
        //     ArrayList<String> array02 = new ArrayList<String>();

        //     for (int cont = 0; cont < arraySize02; cont++) {
        //         Scanner newStringArray = new Scanner(System.in);
        //         System.out.println("Digite uma palavra para o seu array02");
        //         String stringArray = newStringArray.nextLine();
        //         array02.add(stringArray);
        //     }
        // }

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        ArrayList<String> cars02 = new ArrayList<String>();
        cars02.add("Volvo");
        cars02.add("BMW");
        cars02.add("Fiat");
        cars02.add("Ferrari");

        int cont02 = 0;

        for(int cont = 0; cont < cars.size(); cont++){
            while(cont02 < cars02.size()){
                if(cars.get(cont) == cars02.get(cont02)) {
                    System.out.println(cars02.get((cont02)));
                }
                cont02++;
            }
            cont02 = 0;
        }
    }
}
