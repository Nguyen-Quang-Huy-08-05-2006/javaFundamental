public class Main {
    public static void main(String[] args) {
        // Primitive
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Primitive:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("----------------------");

        // Reference
        Student s1 = new Student("Nguyen Van A");
        Student s2 = s1;

        s2.ten = "Tran Thi B";

        System.out.println("Reference:");
        System.out.println("s1.ten = " + s1.ten);
        System.out.println("s2.ten = " + s2.ten);
        System.out.println("----------------------");
    }
}
