import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void checkSame(Person person1, Person person2) throws SameNameException {
        if (person1.getName().equals(person2.getName())) {
            throw new SameNameException();
        }
    }

    public static void main(String[] args) {
        Scanner takeName1 = new Scanner(System.in);
        Scanner takeNumber1 = new Scanner(System.in);
        Scanner takeName2 = new Scanner(System.in);
        Scanner takeNumber2 = new Scanner(System.in);

        try {
            System.out.println("Hi there! Please give me a name.");
            String name1 = takeName1.nextLine();
            System.out.println("Now give me a number associated with that name");
            double number1 = takeNumber1.nextDouble();
            System.out.println("Let's get something to compare that too! Please give me another name");
            String name2 = takeName2.nextLine();
            System.out.println("Now give me a number.");
            double number2 = takeNumber2.nextDouble();
            Person person1 = new Person(name1, number1);
            Person person2 = new Person(name2, number2);
            checkSame(person1, person2);
            System.out.println(person1.compareTo(person2));
        } catch (InputMismatchException e) {
            System.out.println("I'm afraid that wasn't a number.");
        } catch (SameNameException e) {
            System.out.println("Those are the same person");
        } catch (Exception e) {
            System.out.println("Something went wrong :(");
        }

        finally {
            System.out.println("Goodbye!");
        }

    }
}
