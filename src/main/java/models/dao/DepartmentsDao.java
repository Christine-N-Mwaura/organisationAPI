package models.dao;

import models.Departments;
import java.util.List;

public interface DepartmentsDao {
    //create
    void add(Departments department);

    //read
    List<Departments> all();

    //delete
    void deleteById(int id);
    void clearAll();

}
