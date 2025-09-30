/*Lag et program som leser inn tre desimaltall.
Programmet skal så summere disse tallene og vise summen i System.out.

Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn.
Vis så dette resultatet via 1) Meldingsboks og 2) System.out.
 */
import static javax.swing.JOptionPane.*;
public class Oppgave3 {
    public static void main(String[] args) {
        String inputTall1 = showInputDialog(null, "Tall 1: ");
        String inputTall2 = showInputDialog(null, "Tall 2: ");
        String inputTall3 = showInputDialog(null, "Tall 3: ");

        double tall1 = Double.parseDouble(inputTall1);
        double tall2 = Double.parseDouble(inputTall2);
        double tall3 = Double.parseDouble(inputTall3);

        double summa = tall1 + tall2 + tall3;
        double gjennomsnitte = summa / 3;


        showMessageDialog(null, "gjennomsnittet av "  + tall1 + ", " +
                tall2 + ", " + tall3+ " er: " + gjennomsnitte);
    }
}
