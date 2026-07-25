public class PersonalInformation {
    String name;
    int age;
    String city;
    String qualification;

    public PersonalInformation(String name, int age, String city, String qualification) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.qualification = qualification;
    }

    public void DisplayDetails() {
        System.out.println("---------------------------");
        System.out.println("Personal Information");
        System.out.println("---------------------------");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("City          : " + city);
        System.out.println("Qualification : " + qualification);
        System.out.println("---------------------------");
    }

}

class Main {
    public static void main(String[] args) {
        PersonalInformation person = new PersonalInformation("John Doe", 30, "New York", "Bachelor's Degree");
        person.DisplayDetails();

        // Update details
        PersonalInformation updatedPerson = new PersonalInformation("Prathamesh Raut", 24, "Sangli", "Master's Degree");
        updatedPerson.DisplayDetails();

    }
}
