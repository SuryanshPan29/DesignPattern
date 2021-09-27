package com.example.student.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentImpl implements StudentDao{
    @Autowired
    JdbcTemplate jdbcTemplate;
    @java.lang.Override
    public void create(Student student) {
        jdbcTemplate.update("insert into student values(?,?,?)",student.getName(),student.getId(),student.getMarks());
    }
    @java.lang.Override
    public void delete(Student student) {
        jdbcTemplate.update("delete from student where student_name = ?",student.getName());
    }
}
