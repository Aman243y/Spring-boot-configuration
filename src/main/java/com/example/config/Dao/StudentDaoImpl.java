package com.example.config.Dao;

import com.example.config.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao{

    EntityManager em;

    @Autowired
    public StudentDaoImpl(EntityManager em){this.em=em;}

    @Transactional
    @Override
    public void saveStudent(Student theStudent) {
        em.persist(theStudent);



    }

    @Override
    public Student findBy(int id) {
        return em.find(Student.class,id);
    }

    @Transactional
    @Override
    public void Delete(int id) {
        Student theStudent=em.find(Student.class,id);
        em.remove(theStudent);

    }

    @Transactional
    @Override
    public void update(Student student) {
        em.merge(student);
    }

    @Override
    public List<Student> getStudent() {
        TypedQuery<Student>q =em.createQuery("from Student", Student.class);
        return q.getResultList();
    }


}
