/*Oppgave 4 (litt vanskeligere)
Endre på programmet i oppgave 3 slik at du sikrer at det skrives inn tall og ikke vanlig tekst
i input-boksene. Bruk try og catch for å få dette til. Dersom det ikke skrives inn tall sett
input til 0. */

import static javax.swing.JOptionPane.*;
public class Oppgave4 {
    public static void main(String[] args) {
        String inputTall1 = showInputDialog(null, "Tall 1: ");
        String inputTall2 = showInputDialog(null, "Tall 2: ");
        String inputTall3 = showInputDialog(null, "Tall 3: ");
double tall1;
double tall2;
double tall3;

  try { tall1 = Double.parseDouble(inputTall1);
        tall2 = Double.parseDouble(inputTall2);
        tall3 = Double.parseDouble(inputTall3);
  }
  catch (Exception e) {
      showMessageDialog(null, "Inngi tall (skriv et nummer). Setter alle til 0.");
      tall1 = tall2 = tall3 = 0.0;
  }



        double summa = tall1 + tall2 + tall3;
        double gjennomsnitte = summa / 3;


        showMessageDialog(null, "gjennomsnittet av "  + tall1 + ", " +
                tall2 + ", " + tall3+ " er: " + gjennomsnitte);
    }
}
