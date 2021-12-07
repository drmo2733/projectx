package src.education;


import src.education.model.Lesson;
import src.education.model.Student;
import src.education.model.User;
import src.education.storage.LessonStorage;
import src.education.storage.StudentStorage;
import src.education.storage.UserStorage;
import src.education.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands, UserCommands {

    static Scanner scanner = new Scanner(System.in);
    static StudentStorage studentStorage = new StudentStorage();
    static LessonStorage lessonStorage = new LessonStorage();
    static UserStorage userStorage = new UserStorage();
    static boolean isRun = true;

    public static void main(String[] args) throws ParseException {

        userStorage.add(new User("Valod", "Hakobyan",
                "valod@mail.com", "qwe123", "admin"));
        userStorage.add(new User("Hamlet", "Vardanyan",
                "hamlet@mail.com", "rty456", "user"));

        lessonStorage.add(new Lesson("java", 150,
                "Karen", 35000));
        lessonStorage.add(new Lesson("javaS", 180,
                "Hovo", 30000));
        lessonStorage.add(new Lesson("c++", 120,
                "Grish", 25000));

        studentStorage.add(new Student("Aram", "Aramyan", 22,
                "aram@mail.com", "033335544",
                DateUtil.stringToDate("18/01/1999"),
                new Lesson[]{lessonStorage.getByName("java")}));
        studentStorage.add(new Student("Gevorg", "Gevorgyan", 23,
                "gevorg@mail.com", "055888844",
                DateUtil.stringToDate("22/02/1998"),
                new Lesson[]{lessonStorage.getByName("javaS")}));
        studentStorage.add(new Student("Ashot", "Ashotyan", 25,
                "ashot@mail.com", "099663355",
                DateUtil.stringToDate("26/03/1996"),
                new Lesson[]{lessonStorage.getByName("c++")}));

        while (isRun) {
            UserCommands.printCommands();
            String userCommand = scanner.nextLine();
            switch (userCommand) {
                case UserCommands.EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    addUser();
                    break;
                default:
                    System.out.println("jhk");
                    break;
            }
        }
    }

    private static void addUser() {
        System.out.println("please input name, surname, email, password, type");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length == 5) {
            if (userData[4].equals("admin") || userData[4].equals("user")) {
                if (userStorage.getByEmail(userData[2]) == null &&
                        !userStorage.checkPassword(userData[3])) {
                    User user = new User(userData[0], userData[1], userData[2],
                            userData[3], userData[4]);
                    userStorage.add(user);
                    System.out.println("user is added successfully");
                } else {
                    System.err.println("credential already exists");
                }
            } else {
                System.err.println("invalid type");
            }
        } else {
            System.err.println("invalid data");
        }
    }

    private static void login() throws ParseException {
        System.out.println("please input email and password");
        String personalDataStr = scanner.nextLine();
        String[] personalData = personalDataStr.split(",");
        User user = userStorage.getByEmail(personalData[0]);
        if (user != null && user.getPassword().equals(personalData[1])) {
            if (user.getType().equals("admin")) {
                adminCase();
            } else {
                userCase();
            }
        } else {
            System.out.println("personaldata isn't correct");
        }
    }

    private static void userCase() throws ParseException {
        while (isRun) {
            System.out.println("\u001B[32m" + "you are logged as USER" + "\u001B[32m");
            UserCommands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommands.EXIT:
                    return;
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
                case CHANGE_STUDENTS_PHONE_NUMBER:
                    changeStudentsPhoneNumber();
                    break;
                default:
                    System.err.println("invalid command");
            }
        }

    }

    private static void adminCase() throws ParseException {
        while (isRun) {
            System.out.println("\u001B[35m" + "you are logged as ADMIN" + "\u001B[35m");
            UserCommands.printAdminCommands();
            String command = scanner.nextLine();
            switch (command) {
                case UserCommands.EXIT:
                    return;
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
                    break;
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
        if (phone != null) {
            System.out.println("enter new number");
            String newPhone = scanner.nextLine();
            student.setPhoneNumber(newPhone);
            System.out.println("Number changed !");
        } else {
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
        if (student != null) {
            studentStorage.delete(student);
            System.out.println("Student is fired");
        } else {
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
        lessonStorage.print();
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            studentStorage.printByLesson(lesson);
        } else {
            System.err.println("Lesson does not exists");
        }

    }




    private static void addStudent() throws ParseException {
        System.out.println("please input student's name,surname,age,email,phone,dateOfBirth[12/12/2021],lesson");
        String studentDataStr = scanner.nextLine();
        String[] studentData = studentDataStr.split(",");
        int age = Integer.parseInt(studentData[2]);
        Date date = DateUtil.stringToDate(studentData[5]);
        Lesson[] lessonNames = new Lesson[studentData.length];
        int index = 0;

        for (int i = 0; i < lessonNames.length; i++) {
            if (lessonStorage.getByName(studentData[i]) != null) {
                lessonNames[index++] = lessonStorage.getByName(studentData[i]);
            }
        }
        Student newStudent = new Student(studentData[0], studentData[1], age,
                studentData[3], studentData[4], date, lessonNames);

        studentStorage.add(newStudent);

        System.out.println("Thank you, student was added");
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
