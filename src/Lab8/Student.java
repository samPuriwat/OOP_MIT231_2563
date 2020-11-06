package Lab8;

public class Student extends Person {
    //attributes
    private String sid;
    private String major;

    public Student(String name, int age, String gender) {
        super(name, age, gender);  // constructor of person class
    }

    public Student(String name, int age, String gender, String sid, String major) {
        super(name, age, gender);
        this.sid = sid;
        this.major = major;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }
}
