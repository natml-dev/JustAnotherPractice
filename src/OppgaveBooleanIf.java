
import static javax.swing.JOptionPane.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean canBuyAlcohol() {
        if (age < 18) {
            System.out.println(name + " can't buy alcohol, too young");
            return false;
        } else {
            System.out.println(name + " old enough to buy alcohol");
            return true;
        }

    }
}

    public class OppgaveBooleanIf {
        public static void main(String[] args) {

            Person boy = new Person("Lucas", 16);
            Person girl = new Person("Elisabeth", 19);

            boy.canBuyAlcohol();
            girl.canBuyAlcohol();

        }
    }

