package dao.dao;

import models.Users;
import java.util.List;

public interface usersDao {

    //create
    void add (Users user);

    //read
    List<Users> all();
    Users findById(int id);

    //update
    void update (int id,String name, String position,String roles,int deptid);

    //delete
    void deleteById(int id);
    void clearAll();

}
