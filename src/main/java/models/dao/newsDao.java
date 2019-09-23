package dao.dao;

import models.News;
import java.util.List;

public interface newsDao {
    //create
    void add(News news);

    //read
    List<News> all();
    List<News> getAllUsersByDepartment(int deptId);

    //delete
    void deleteById(int id);
    void clearAll();

}
