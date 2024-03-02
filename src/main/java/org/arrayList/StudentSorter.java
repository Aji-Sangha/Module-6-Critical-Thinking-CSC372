package org.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {
    public static void sortByRollNo(ArrayList<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getRollNo() < students.get(minIndex).getRollNo()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Collections.swap(students, i, minIndex);
            }
        }
    }

    public static void sortByName(ArrayList<Student> students) {
        Collections.sort(students, new NameComparator());
    }
}

