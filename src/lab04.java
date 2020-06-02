/*
C11 = 9107 % 11 = 10 => Визначити клас студент, який складається як мінімум з 5-и полів.
 */
import java.util.Arrays;
import java.util.Comparator;

public class lab04 {
    static class Student {
        String firstname;
        String lastname;
        int age;
        int course;
        String group;

        Student(String firstname,String lastname,int age,int course,String group){
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.course = course;
            this.group = group;
        }
    }

    static class SortName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            int ret = s1.firstname.compareToIgnoreCase(s2.firstname);
            if (ret == 0) {
                return s1.lastname.compareToIgnoreCase(s2.lastname);
            }
            return ret;
        }
    }

    static class SortAge implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s2.age - s1.age;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Alex", "Kep", 69, 1, "IV-91");
        students[1] = new Student("Stason", "DankaOneLove", 19, 3, "IV-91");
        students[2] = new Student("Mishark", "POLYMEME", 18, 4, "IV-91");
        students[3] = new Student("Maksimka", "Durka", 20, 1, "IV-91");
        students[4] = new Student("Valeh", "Go-V-Terariu", 21, 2, "IV-91");

        Arrays.sort(students, new SortName());
        System.out.println("Sort by name:");
        System.out.printf("%-10s%-10s%-4s%-8s%-5s\n", "Firstname", "Lastname", "Age", "Course", "Group");
        for (Student i: students) {
            System.out.printf("%-10s%-10s%-4d%-8d%-5s\n", i.firstname, i.lastname, i.age, i.course, i.group);
        }

        Arrays.sort(students, new SortAge());
        System.out.println("\nSort by age:");
        System.out.printf("%-10s%-10s%-4s%-8s%-5s\n", "Firstname", "Lastname", "Age", "Course", "Group");
        for (Student i: students) {
            System.out.printf("%-10s%-10s%-4d%-8d%-5s\n", i.firstname, i.lastname, i.age, i.course, i.group);
        }

    }
}