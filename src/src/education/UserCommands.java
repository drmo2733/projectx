package src.education;

public interface UserCommands {
    String EXIT = "0";
    String ADD_LESSON = "1";
    String ADD_STUDENT = "2";
    String PRINT_STUDENTS = "3";
    String PRINT_STUDENTS_BY_LESSON = "4";
    String PRINT_LESSONS = "5";
    String DELETE_LESSON_BY_NAME = "6";
    String DELETE_STUDENT_BY_EMAIL = "7";
    String CHANGE_STUDENTS_PHONE_NUMBER = "8";
    String LOGOUT = "9";

    String LOGIN = "1";
    String REGISTER = "2";



    static void printCommands() {
        System.out.println("\u001B[31m" + "please input " + LOGIN + " for sign in");
        System.out.println("please input " + REGISTER + " for registration");
        System.out.println("please input " + EXIT + " for EXIT" + "\u001B[31m");
    }

    static void printUserCommands() {
        System.out.println("\u001B[31m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("please input " + LOGOUT + " for  LOGOUT" + "\u001B[31m");

    }

    static void printAdminCommands() {
        System.out.println("\u001B[31m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email");
        System.out.println("please input " + CHANGE_STUDENTS_PHONE_NUMBER + " for CHANGE PHONE NUMBER");
        System.out.println("please input " + LOGOUT + " for  LOGOUT" + "\u001B[31m");
    }
}
