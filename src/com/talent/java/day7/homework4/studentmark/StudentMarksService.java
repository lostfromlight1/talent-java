package com.talent.java.day7.homework4.studentmark;

import com.talent.java.day7.homework4.customexception.StudentNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class StudentMarksService {
    public static void addStudent(HashMap<String , Integer> map, String name, int mark){
        map.put(name, mark);
        System.out.println(name+ " is added with marks: " + mark);
    }

    public static void dispalyAll(HashMap<String, Integer> map){
        if(map.isEmpty()) {
            System.out.println("There no student in the map");
            return;
        }

        System.out.println("All Student Mark\n");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Name " + entry.getKey() + ", Mark: " + entry.getValue());
        }

    }

    public static void highestMark (HashMap<String , Integer> map){
        if(map.isEmpty()) {
            System.out.println("There no student in the map");
            return;
        }
        String topStudent = null;
        int maxMarks = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxMarks){
                maxMarks = entry.getValue();
                topStudent = entry.getKey();
            }
        }
        System.out.println("\nTop Student: "+ topStudent+ " with mark"+ maxMarks);
    }

    public static void removeStudent (HashMap<String , Integer> map, String name)throws StudentNotFoundException {
        if(!map.containsKey(name)){
            throw new StudentNotFoundException(name + " is not in the student map");
        }
        map.remove(name);
        System.out.println(name + " is remove from the student map");
    }
}
