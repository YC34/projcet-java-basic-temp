package application.program.school;

import application.program.school.model.Student;
import application.program.school.model.Subject;

import java.util.ArrayList;
import java.util.List;

public class School {

    private static School instance;

    private static String SCHOOL_NAME = "KOSMO_144";
    private static List<Student> studentList = new ArrayList<Student>();
    private static List<Subject> subjectList = new ArrayList<Subject>();



    public School() {
    }


    public static School getInstance() {
        if(instance == null) {
            instance = new School();
        }
        return instance;
    }


    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void addSubject(Subject subject){
        subjectList.add(subject);
    }

    public static List<Subject> getSubjectList() {
        return subjectList;
    }

    public static void setSubjectList(List<Subject> subjectList) {
        School.subjectList = subjectList;
    }
}
