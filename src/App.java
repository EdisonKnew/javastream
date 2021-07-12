import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = App.getRandomNumberUsingInts(0, 20);
         }
         IntStream stream = Arrays.stream(arr);
       
       // App.displayCroissant(stream);
       // App.displayFirst(stream);
        App.sommeSuperieur(stream,3);
        
        
    }

    public static int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
          .findFirst()
          .getAsInt();
    }

    public static void displayCroissant(IntStream stream){
        stream.sorted().forEach(System.out::println);
    }

    public static void displayFirst(IntStream stream){
       OptionalInt valeur = stream.sorted().findFirst();

       System.out.println(valeur.getAsInt());
    }

    public static void sommeSuperieur(IntStream stream,Integer min){
       Integer total = stream
       .filter(c -> c > min)
       .reduce(0, (subtotal, element) -> subtotal + element);
       System.out.println(total);
     }
}
