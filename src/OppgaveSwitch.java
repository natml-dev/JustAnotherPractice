import static javax.swing.JOptionPane.*;


public class OppgaveSwitch {
    public static void main(String[] args) {

        String month = showInputDialog(null, " Write a month");

        switch (month) {
                case "June":
                case "July":
                case "Agust":
          showMessageDialog(null, "It is summer");
             break;
                 case "September":
                 case "October":
                 case "November":
                     showMessageDialog(null, "It is autumn");
                     break;

            case "December":
            case "January":
            case "February":
                showMessageDialog(null, "It is winter");
                break;

            case "March":
                case "April":
                    case "May":
                        showMessageDialog(null, "It is spring");
                        break;
            default:
                    showMessageDialog(null, "Error in input, name of the month is not valid");
                    break;
        }
    }
}
