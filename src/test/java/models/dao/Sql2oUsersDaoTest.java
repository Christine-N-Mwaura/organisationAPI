package models.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import models.Users;
import static org.junit.Assert.*;

public class Sql2oUsersDaoTest {
    private Connection conn;
    private Sql2oNewsDao newsDao;
    private Sql2oUsersDao usersDao;
    private Sql2oDepartmentsDao departmentsDao;

    public Users setUpUser(){
        Users user = new Users("Fancy","Manager","govern");
        usersDao.add(user);
        return user;
    }
    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "","");
        newsDao = new Sql2oNewsDao(sql2o);
        usersDao = new Sql2oUsersDao(sql2o);
        departmentsDao = new Sql2oDepartmentsDao(sql2o);
        conn = sql2o.open();

    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingUserSetsId() throws Exception{
        Users testUser = setUpUser();
        assertNotEquals(0,testUser.getId());

    }

    @Test
    public void addedUsersAreReturnedFromAll_true() throws Exception {
        Users testUser = setUpUser();
        assertEquals(1,usersDao.all().size());

    }

    @Test
    public void noUsersReturnsEmptyList() throws Exception {
        assertEquals(0,usersDao.all().size());
    }

    @Test
    public void findByIdReturnsCorrectUser() throws Exception {
        Users testUser = setUpUser();
        Users otherUser = setUpUser();
        assertEquals(testUser, usersDao.findById(testUser.getId()));
    }

    @Test
    public void updateCorrectlyUpdatesAllFields() throws Exception {
        Users testUser = setUpUser();
        usersDao.update(testUser.getId(), "mine", "employee", "role");
        Users foundUser = usersDao.findById(testUser.getId());
        assertEquals("mine", foundUser.getName());
        assertEquals("employee", foundUser.getPosition());
        assertEquals("role", foundUser.getRoles());


    }

    @Test
    public void deleteByIdDeletesCorrectUser() throws Exception {
        Users testUser = setUpUser();
        Users otherUser = setUpUser();
        usersDao.deleteById(testUser.getId());
        assertEquals(1, usersDao.all().size());
    }

    @Test
    public void clearAll() throws Exception {
        Users testUser = setUpUser();
       Users otherUser= setUpUser();
        usersDao.clearAll();
        assertEquals(0, usersDao.all().size());
    }
}