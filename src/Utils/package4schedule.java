package Utils;

import java.util.HashMap;

public class package4schedule {
    class Person {

        String name, faculty;
        int age;

        static class student  {
            int course, mainGroup, subGroup;
            char[] studID;
        }
//Надо сделать проверку, является ли человек студентом или преподавателем, и в зависимости от этого
//уже передавать опр поля
        static class lecturer {
            String department;
        }
    }
    public static class Week{
        HashMap <Integer, String> Week = new HashMap<>();
    }

   public static class Weekday {
        HashMap <Integer, String> Weekday = new HashMap<>();

}
    static void daySchedule(int classInd) {

    }

    static void subjects(int subjectCase) {
        switch (subjectCase) {
            case 1:
                System.out.println("Математический анализ");
                break;
            case 2:
                System.out.println("1");
                break;
            case 3:
                System.out.println("2");
                break;
            case 4:
                System.out.println("3");
                break;
        }
    }
}
