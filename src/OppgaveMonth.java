/*Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:

Sommer : juni, juli, august
Høst : september, oktober, november
Vinter: desember, januar, februar,
Vår : mars, april, mai,
a) Lag først et program som løser det med if /else
b) Lag deretter et program som løser det med bruk av switch. */
import static javax.swing.JOptionPane.*;
public class OppgaveMonth {

    public static void main(String[] args) {
      String month = showInputDialog(null, "Write a month: ");
       if (month.equals("June") || month.equals("July") || month.equals("August")) {
           showMessageDialog(null, "It is summer");
       }
       else if (month.equals("September") || month.equals("October") || month.equals("November")) {
           showMessageDialog(null, "It is autumn");
       }
       else if (month.equals("December") || month.equals("January") || month.equals("February")) {
           showMessageDialog(null, "It is winter");
       }else if (month.equals("March") || month.equals("April") || month.equals("May")) {
           showMessageDialog(null, "It is spring");
       } else {
           showMessageDialog(null, "You haven't typed a valid month");
       }
    }
}
