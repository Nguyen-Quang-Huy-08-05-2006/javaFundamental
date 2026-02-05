public class Person {
    protected String fullName;
    protected int age;

    public Person() {
        fullName = "";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display() {
        System.out.println("Ho ten: " + fullName);
        System.out.println("Tuoi: " + age);
    }
}
