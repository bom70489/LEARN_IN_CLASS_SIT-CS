public class StudentTest {
    public static void main(String[] args) {
        Student bom = new Student("Pakapol", 18, 100);
        System.out.println(bom.displayInfo());
        System.out.println(bom.getName());
        System.out.println(bom.getAge());
        System.out.println(bom.getScore());
    }
}
