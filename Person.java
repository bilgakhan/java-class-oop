public class Person {
    private String name;
    private int age;
    private String gender;
    private String occupation;

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }
}