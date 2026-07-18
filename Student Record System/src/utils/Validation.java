package utils;

public class Validation {

    public static boolean isValidAge(int age) {
        return age >= 16 && age <= 60;
    }

    public static boolean isValidGPA(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }

    public static boolean isValidStudentId(String id) {
        return id != null && !id.trim().isEmpty();
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}