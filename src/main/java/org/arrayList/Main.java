package org.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(109, "Stephen", "1239 Street"));
        students.add(new Student(106, "Norah", "4562 Avenue"));
        students.add(new Student(102, "Sangha", "7563 Street"));
        students.add(new Student(107, "Noel", "4564 Avenue"));
        students.add(new Student(108, "Biden", "8565 Street"));
        students.add(new Student(103, "Betty", "4566 Avenue"));
        students.add(new Student(104, "Joel", "5567 Street"));
        students.add(new Student(105, "Grace", "4568 Avenue"));
        students.add(new Student(101, "Aji", "6569 Street"));
        students.add(new Student(110, "Beatrice", "95610 Avenue"));

        StudentSorter.sortByRollNo(students);

        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student.getRollNo() + " " + student.getName());
        }

        StudentSorter.sortByName(students);

        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollNo());
        }
    }
}

