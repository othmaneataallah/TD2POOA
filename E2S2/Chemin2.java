public class Chemin2 {
    public static void main(String args[]) {
        f(true);
        System.out.println("Après f(true)");
        f(false);
        System.out.println("Après f(false)");
    }

    public static void f(boolean ret) {
        try {
            new A(1);
        } catch (Erreur e) {
            System.out.println("*** Dans f - Exception Erreur ***");
            if (ret)
                return;
        }
        System.out.println("Suite f");
    }
}
