package codesnippet;

import java.util.HashMap;
import java.util.Map;

public class Tryout3 {

    /*public class Student {
        int id;
        String name;
    
        Student(int i, String n) {
            id = i;
            name = n;
        }
    }*/

    public static void main(String[] args) {
        Map<Student, String> m = new HashMap<Student, String>();
        Student a1 = new Student(1, "a");
        Student a2 = new Student(2, "b");

        m.put(a1, "a1");
        m.put(a2, "a2");

        System.out.println(m.get(a1));
        System.out.println(m.get(new Student(1, "a")));
    }
}