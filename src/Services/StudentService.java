package Services;

import Models.Student;
import Repositories.StudentRepo;

import java.util.List;
import java.util.Scanner;

public class StudentService {

    private StudentRepo studentRepo = new StudentRepo();

    private Scanner sc = new Scanner(System.in);

    public void saveStudent(){
        System.out.println("Please enter student details:");
        System.out.print("Student id: ");
        String id = sc.next();
        sc.nextLine();
        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Student marks: ");
        String marks = sc.next();

        Student student = new Student.Builder().setId(id).setName(name).setMarks(marks).build();
        String saveId = studentRepo.saveStudent(student);

        System.out.println("Student saved to database successfully..");

    }

    public void deleteStudent(){
        System.out.println("Please enter student details:");
        System.out.print("Student id: ");
        String id = sc.next();

        studentRepo.deleteStudentById(id);

        System.out.println("Student deleted from database successfully..");

    }

    public void getAllStudent(){
        System.out.println("All Students information");
        List<Student> list = studentRepo.getAllStudents();

        int sno = 1;
        for(Student s: list){
            System.out.println(sno+". ID:"+s.getId()+" NAME:"+s.getName()+" MARKS:"+s.getMarks());
            sno++;
        }
    }


    public void updateStudent(){
        System.out.println("Please enter student details:");
        System.out.print("Student current id: ");
        String id = sc.next();
        sc.nextLine();
        System.out.print("Student updated name: ");
        String name = sc.nextLine();
        System.out.print("Student updated marks: ");
        String marks = sc.next();

        Student student = new Student.Builder().setId(id).setName(name).setMarks(marks).build();
        String saveId = studentRepo.updateStudent(student);

        System.out.println("Student updated successfully..");
    }


    public void printStudent(){
        System.out.println("Please enter student details:");
        System.out.print("\nStudent current id: ");
        String id = sc.next();

        Student s = studentRepo.getStudentById(id);

        System.out.println("1. ID:"+s.getId()+" NAME:"+s.getName()+" MARKS:"+s.getMarks());
    }

}
