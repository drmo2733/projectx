package src.education;


import java.util.Scanner;

public class LessonStudentTest {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";
    private static final String CHANGE_STUDENTS_PHONE_NUMBER = "8";

    private static void printCommands() {
        System.out.println("\u001B[31m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email" + "\u001B[31m");
        System.out.println("please input " + CHANGE_STUDENTS_PHONE_NUMBER + " for change students number ");
    }

    public static void main(String[] args) {

        lessonStorage.add(new Lesson("java", 150,
                "Karen", 35000));
        lessonStorage.add(new Lesson("javaS", 180,
                "Hovo", 30000));
        lessonStorage.add(new Lesson("c++", 120,
                "Grish", 25000));

        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;
                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;
                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                case CHANGE_STUDENTS_PHONE_NUMBER:
                    changeStudentsPhoneNumber();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void changeStudentsPhoneNumber() {
        System.out.println("please choose student phonenumber");
        System.out.println("--------");
        studentStorage.print();
        System.out.println("--------");
        String phone = scanner.nextLine();
        Student student = studentStorage.getByPhone(phone);
        if (phone!=null){
            System.out.println("enter new number");
            String newPhone =scanner.nextLine();
            student.setPhone(newPhone);
        }else {
            System.err.println("phone is wrong");
        }

    }

    private static void deleteStudentByEmail() {
        System.out.println("please choose student by email");
        System.out.println("--------");
        studentStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student!=null){
            studentStorage.delete(student);
            System.out.println("Student is fired");
        }else {
            System.err.println("student with this email does not exists");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("please choose lesson by name");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.delete(lesson);
            System.out.println("LESSON IS DELETED");
        } else {
            System.err.println("Lesson with this name does not exists");
        }
    }

    private static void printStudentsByLesson() {
        printLessonList();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printByLesson(lesson);
        } else {
            System.err.println("Lesson does not exists");
        }

    }


    private static void printLessonList() {
        System.out.println("please choose lessons name");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
    }

    private static void addStudent() {
        System.out.println("please input student's name,surname,age,email,phone,lesson");
        String studentDataStr = scanner.nextLine();
        String[] studentData = studentDataStr.split(",");
        int age = Integer.parseInt(studentData[2]);
        String lessonName = studentData[5];
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            if (studentData.length == 6) {
                Student student = studentStorage.getByEmail(studentData[3]);
                if (student == null) {
                    Student newStudent = new Student(studentData[0], studentData[1], age,
                            studentData[3], studentData[4], lesson);
                    studentStorage.add(newStudent);
                    System.out.println("Thank you, student was added");
                }
            } else {
                System.err.println("Student already exists");
            }
        }
    }

    private static void addLesson() {
        System.out.println("please input lesson's name,duration,lecturerName,price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        int price = Integer.parseInt(lessonData[3]);
        int duration = Integer.parseInt(lessonData[1]);
        if (lessonData.length == 4) {
            Lesson lesson = new Lesson(lessonData[0], duration, lessonData[2], price);
            if (lessonStorage.getByName(lessonData[0]) != null) {
                System.err.println("Invalid name. Lesson with this name already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson was added");
            }
        } else {
            System.err.println("invalid data");
        }

    }

}
