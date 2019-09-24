package models.dao;

import models.Departments;

import java.util.List;

public interface DepartmentsDao {
    //create
    void add(Departments department);


    //read
    List<Departments> all();

    Departments findById(int id);


    //delete
    void deleteById(int id);
    void clearAll();

}
