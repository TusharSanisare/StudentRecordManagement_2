package Repositories;

import Models.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentRepo {

    private List<Student> db = new ArrayList<>();


    public String saveStudent(Student student){
        db.add(student);
        return student.getId();
    }

    public Student getStudentById(String id){
        int i = getIndexById(id);
        return db.get(i);
    }

    public String updateStudent(Student student){
        deleteStudentById(student.getId());
        return saveStudent(student);
    }

    public void deleteStudentById(String id){
        int i = getIndexById(id);
        db.remove(i);
    }

    public List<Student> getAllStudents(){
        return db;
    }

    public int getIndexById(String id){
        for(int i=0; i<db.size(); i++ ){
            if (db.get(i).getId().equals(id)){
                return i;
            }
        }

        return -1;
    }

}
