import java.util.*;

public class Random12 {
    public static void main(String[] args) {
        int maxRange;
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter maximum range: ");
        maxRange = SC.nextInt();
        for (int loop = 1; loop <= 5; loop++) {
            System.out.println("\n" + rand.nextInt(maxRange));
        }
    }
}
