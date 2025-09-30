import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {
  String alderInput = showInputDialog(null, "What's your age?");
  int alder = Integer.parseInt(alderInput);
  showMessageDialog (null, "You are " + alder + " years old");

    }
}