import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        String homer = "Homer";
        String bart = "Bart";
        String lisa = "Lisa";
        String marge = "Marge";
        list.add(homer);
        list.add(bart);
        list.add(lisa);
        list.add(marge);
        PrintItinerary3(list);
    }

    public static void PrintItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }
}
