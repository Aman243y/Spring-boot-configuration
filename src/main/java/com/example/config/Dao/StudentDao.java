package com.example.config.Dao;

import com.example.config.entity.Student;

import java.util.List;

public interface StudentDao {
    void saveStudent(Student theStudent);
    Student findBy(int id);

    void Delete(int id);

    void update(Student student);

    List<Student> getStudent();

}
