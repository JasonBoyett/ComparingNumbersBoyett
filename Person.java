public class Person {
    private String name;
    private double number;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return this.number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Person(String name, double number) {
        this.name = name;
        this.number = number;
    }

    public String compareTo(Person otherPerson) {
        if (this.number > otherPerson.number) {
            return this.name + " has a larger number than " + otherPerson.name + "\n" + this.number + " > "
                    + otherPerson.number;
        }
        if (this.number == otherPerson.number) {
            return this.name + " has the same number as " + otherPerson.name + "\n" + this.number + " = "
                    + otherPerson.number;
        } else {
            return this.name + " has a smaller number than " + otherPerson.name + "\n" + this.number + " < "
                    + otherPerson.number;
        }
    }
}