import java.util.*;

public class Lab404 {

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Enter a word: ");
            String w = sc.nextLine();

            if (w.equalsIgnoreCase("stop")) break;

            words.add(w);
        }

        System.out.println("\nWords you entered:");


        for (String s : words) {
            System.out.print(s + " ");
        }
    }



