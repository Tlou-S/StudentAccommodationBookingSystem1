package za.ac.cput.repository;

import za.ac.cput.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    //Singleton Design Pattern Very important Guys
     private static IStudentRepository repository = null;
     private List<Student> studentList;
     private StudentRepository() {
         studentList = new ArrayList<>();
     }
     public static IStudentRepository getInstance() {
         if (repository == null) {
             repository = new StudentRepository();
         }
         return repository;
     }


    @Override
    public Student create(Student student) {
        boolean success  = studentList.add(student);
        if (success) {
            return student;
        }
        return null;
    }

    @Override
    public Student read(String studentNumber) {
         for (Student student : studentList) {
             if (student.getStudentNumber().equals(studentNumber)) {
                 return student;
             }
         }
         return null;
    }

    @Override
    public Student update(Student student) {
        String id = student.getStudentNumber();
        Student oldStudent = read(id);
        if (oldStudent == null) {
            return null;
        }
        boolean success  = studentList.remove(oldStudent);
        if (!success) {
            return student;
        }
        if(studentList.add(student)) {
            return student;
        }
        return null;
    }

    @Override
    public boolean delete(String studentNumber ) {
        Student studentToDelete = read(studentNumber);
        if (studentToDelete == null) {
            return false;
        }
        return (studentList.remove(studentToDelete));
    }

    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }
}
