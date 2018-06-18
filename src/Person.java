public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) throws IncorectAgeException, NameUnderfinendException {
        if(!validationWord(firstName))
            throw new NameUnderfinendException();
        else
            this.firstName = firstName;
        if (!validationWord(lastName))
            throw new NameUnderfinendException();
        else
            this.lastName = lastName;
        if (!validationAge(age))
            throw new IncorectAgeException();
        else
            this.age = age;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    private boolean validationWord (String word){
        if (word == null)
            return false;
        if (word.length() < 3)
            return false;
        return true;
    }

    private boolean validationAge(int age){
        if (age < 1)
            return false;
        return true;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
