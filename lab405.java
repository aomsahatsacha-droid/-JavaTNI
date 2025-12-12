import java.util.Scanner;

public class Lab405 {

}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // เคลียร์ buffer ทุกกรณี
        try {
            if (System.in.available() > 0) {
                sc.nextLine();
            }
        } catch (Exception e) {}

        System.out.print("Input some sentence: ");
        String rawSentence = sc.nextLine();  // ต้องหยุดให้พิมพ์แน่นอน

        String fixedSentence = rawSentence;

        if (!fixedSentence.endsWith(".")) {
            fixedSentence = fixedSentence + ".";
        }

        System.out.println("The sentence must end with full stop point: " + rawSentence);
        System.out.println("The sentence must end with full stop point: " + fixedSentence);
        System.out.println();

        String[] words = fixedSentence.split(" ");
        for (String w : words) {
            System.out.println(w);
        }
    }
