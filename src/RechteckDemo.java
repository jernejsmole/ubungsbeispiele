public class RechteckDemo {
    public static void main(String[] args) {
        int breite = 2;
        int lange = 3;
        int umfang;
        int flaeche;

        umfang = 2 * breite + 2* lange;
        flaeche = breite * lange;

        System.out.println("Der Umafang ist " + umfang);
        System.out.println( "Die Flaeche ist " + flaeche);
    }
}
