package src.education.storage;

import src.education.model.Lesson;
import src.education.model.Student;
import src.education.util.ArrayUtil;

import java.util.Arrays;

public class StudentStorage {
    private Student[] students = new Student[18];

    private int size;

    public void add(Student student) {
        if (size == students.length) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);
        }
    }

    public void delete(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].equals(student)) {
                ArrayUtil.deleteByIndex(students, i, size);
                size--;
                break;
            }
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }
        }
        return null;
    }


    public void printByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            for (Lesson lesson1 : students[i].getLessons()) {
                if (lesson1.equals(lesson)) {
                    System.out.println(students[i]);
                }
            }
        }
    }


    public Student getByPhone(String phone) {
        for (int i = 0; i < size; i++) {
            if (students[i].getPhoneNumber().equals(phone)) {
                return students[i];
            }
        }
        return null;
    }
}
