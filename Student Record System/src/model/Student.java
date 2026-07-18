package model;
public class Student {

   
    private String studentId;
    private String name;
    private int age;
    private String course;
    private double gpa;

    
    public Student() {

    }

    
    public Student(String studentId, String name, int age, String course, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;
        this.gpa = gpa;
    }

  
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getGpa() {
        return gpa;
    }

    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

   
    @Override
    public String toString() {
        return "----------------------------------------\n"
                + "Student ID : " + studentId + "\n"
                + "Name       : " + name + "\n"
                + "Age        : " + age + "\n"
                + "Course     : " + course + "\n"
                + "GPA        : " + gpa + "\n"
                + "----------------------------------------";
    }
}