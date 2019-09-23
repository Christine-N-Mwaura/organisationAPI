package models.dao;

import models.Departments;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oDepartmentsDaoTest {
    private Sql2oDepartmentsDao departmentsDao;
    private Connection conn;

    public Departments setUpDept(){
        return new Departments("Accounts","Deals with money",32);
    }


    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        departmentsDao = new Sql2oDepartmentsDao(sql2o);
        conn = sql2o.open();
    }
    @After
    public void tearDown() throws Exception {
        conn.close();
    }


    @Test
    public void addingDptSetsId() throws Exception {
        Departments testDepartment = setUpDept();
        int testId = testDepartment.getId();
        departmentsDao.add(testDepartment);
        assertNotEquals(testId,testDepartment.getId());
    }

    @Test
    public void addedDepartmentsAreReturnedFromAll() throws Exception {
        Departments testDepartment = setUpDept();
        departmentsDao.add(testDepartment);
        assertEquals(1, departmentsDao.all().size());
    }

    @Test
    public void noDepartmentReturnsEmptyList() throws Exception {
        assertEquals(0,departmentsDao.all().size());
    }

    @Test
    public void deleteByIdDeletesTheCorrectDepartment() throws Exception{
        Departments testDepartment = setUpDept();
        departmentsDao.add(testDepartment);
        departmentsDao.deleteById(testDepartment.getId());
        assertEquals(0,departmentsDao.all().size());
    }
}