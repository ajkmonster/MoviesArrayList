import java.util.*;

public class MoviesArrayList {
    public static void main(String[] args) {
        String y;
        ArrayList<String> movies = new ArrayList<>();
        do {
            Scanner key = new Scanner(System.in);
            System.out.println("Please enter a movie or type Q to quit: ");
            y=key.next();
            if (!y.equalsIgnoreCase("q")) {
                movies.add(y);
            }
        } while (!y.equalsIgnoreCase("q"));
        System.out.println("Your movies are: ");
        Collections.sort(movies);
        for (String g: movies){
            System.out.print(g);
            System.out.println(" ");
        }
        System.out.println("Random movie you should watch: " +movies.get(3));
    }
}
