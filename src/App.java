import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class App {
    @FunctionalInterface
    public interface DisplayPositifs {
    
        boolean displayPositif(int s);
    
    }

    public static void affichagePositif(int[] array, DisplayPositifs function) {
        for (int i = 0; i < array.length; i++) {
             Boolean superieur =  function.displayPositif(array[i]);
             if(superieur){
                 System.out.println(array[i]);
             }
        }
    }

    public static void main(String[] args) throws Exception {
        Membres membres = new Membres();
        membres.apres1991();
        membres.annee1995();
        membres.avant1990();
        membres.nomPrenomDesc();
        membres.genreF();
        membres.genreLower();
    }

    public static int getRandomNumber(int min, int max) {
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
