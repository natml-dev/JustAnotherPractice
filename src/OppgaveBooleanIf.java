
import static javax.swing.JOptionPane.*;

class Person {
   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age);//instead of this.age = age, use setter with validation
    }

    public boolean canBuyAlcohol() {
        // якщо вік невалідний — нічого більше не друкуємо:
        if (age == -1) {
            System.out.println(name + "'s age is invalid");
            return false;
        }
        // звичайна логіка:
        if (age < 18) {
            System.out.println(name + " can't buy alcohol, too young");
            return false;
        } else {
            System.out.println(name + " old enough to buy alcohol");
            return true;
        }

    }
 // getter:
     public String getName() {
        return name;
     }
// setter:
    public void setName(String name) {
       this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 130 ) {
            this.age = age;
        } else {
            this.age = -1; //сторожове значення
        }
    }


}

    public class OppgaveBooleanIf {
        public static void main(String[] args) {

            Person boy = new Person("Lucas", -10);
            Person girl = new Person("Elisabeth", 19);

            boy.canBuyAlcohol();
            girl.canBuyAlcohol();

        }
    }

