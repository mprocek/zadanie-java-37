import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        do {
            loop = true;
            try {
                System.out.println("Imię: ");
                String firstName = scan.nextLine();
                System.out.println("Nazwisko: ");
                String lastName = scan.nextLine();
                System.out.println("Wiek: ");
                int age = scan.nextInt();
                System.out.println("PESEL: ");
                scan.nextLine();
                String pesel = scan.nextLine();
                Person person = new Person(firstName, lastName, age, pesel);
                System.out.println(person.toString());
            } catch (NameUnderfinendException e) {
                System.out.println(e.getMessage());
                loop = false;
            } catch (IncorectAgeException e) {
                System.out.println(e.getMessage());
                loop = false;
            }
        } while (!loop);
    }
}
