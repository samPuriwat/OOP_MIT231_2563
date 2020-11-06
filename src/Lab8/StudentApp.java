package Lab8;

public class StudentApp {
    public static void main(String[] args) {

        Person p = new Person("Puriwat Lertkrai",
                34, "Male");

        Student std1 = new Student("Jutaporn Lerktrai",
                31,
                "Female");


        System.out.println(p.toString());
        System.out.println(std1.toString());

        std1.setSid("111111111111");
        std1.setMajor("MIT");

        System.out.println(std1.toString());

        System.out.println(std1.getName());



    }//main
}//class
