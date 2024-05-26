package application.program.school.data;

import application.program.school.School;
import application.program.school.model.Score;
import application.program.school.model.Student;
import application.program.school.model.Subject;
import application.program.school.util.Define;

public class MakeData {

    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;



    public void createSubject(){
        korean = new Subject("국어", Define.KOREN);
        math   = new Subject("수학", Define.MATH);


        goodSchool.addSubject(korean);
        goodSchool.addSubject(math);
    }


    public void createStudent(){
        Student st1 = new Student(1919191,"리오넬메시",korean);
        Student st2 = new Student(1818181,"g호나둘",math);
        Student st3 = new Student(1619191,"손흥민",korean);
        Student st4 = new Student(1019191,"피케",korean);
        Student st5 = new Student(1319191,"김민재",math);


        goodSchool.addStudent(st1);
        goodSchool.addStudent(st2);
        goodSchool.addStudent(st3);
        goodSchool.addStudent(st4);
        goodSchool.addStudent(st5);

        korean.register(st1);
        korean.register(st2);
        korean.register(st3);
        korean.register(st4);
        korean.register(st5);

        math.register(st1);
        math.register(st2);
        math.register(st3);
        math.register(st4);
        math.register(st5);


        addScoreForStudent(st1,korean,95);
        addScoreForStudent(st1,math,56);

        addScoreForStudent(st2,korean,95);
        addScoreForStudent(st2,math,95);

        addScoreForStudent(st3,korean,100);
        addScoreForStudent(st3,math,88);


        addScoreForStudent(st4,korean,89);
        addScoreForStudent(st4,math,95);

        addScoreForStudent(st5,korean,85);
        addScoreForStudent(st5,math,56);



    }


    public void addScoreForStudent(Student student,Subject subject, int point){

        Score score = new Score(student.getStudentId(),subject,point);
        student.addSubjectScore(score);


    }
}
