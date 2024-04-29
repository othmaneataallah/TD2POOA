import java.util.Scanner;

public class TstPos {
    public static void main(String args[]) {
        System.out.println("\nDébut main.");
        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("\nDonnez un entier positif: ");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                new Positif(n);
                ok = true;
                sc.close();
            } catch (ErrConst e) {
                System.err.println(e);
            }
        }
        System.out.println("\nFin main.\n");
    }
}
