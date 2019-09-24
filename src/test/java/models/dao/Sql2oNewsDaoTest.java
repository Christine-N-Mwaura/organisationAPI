package models.dao;

import models.Departments;
import models.News;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.assertEquals;
public class Sql2oNewsDaoTest {
    private Connection conn;
    private Sql2oDepartmentsDao departmentsDao;
    private  Sql2oNewsDao newsDao;


    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        departmentsDao = new Sql2oDepartmentsDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);
        conn = sql2o.open();


    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingNewsSetsId_1() {
        News testNews = setUpNews();
        assertEquals(1,testNews.getId());
    }

    @Test
    public void all_returnsAllNews_2() {

        News testNews = setUpNews();
        News otherNews = setUpNews();
        assertEquals(2,newsDao.all().size());
    }

    @Test
    public void getAllNewsByDepartment_2() {
        Departments testDepartment = setUpDepartment();
        Departments otherDepartment = setUpDepartment();
        News testNews = setUpNewsForDepartment(testDepartment);
        News otherNews = setUpNewsForDepartment(testDepartment);
        assertEquals(2,newsDao.all().size());

    }

    @Test
    public void deleteById_deletesCorrectly_1() {
        News testNews = setUpNews();
        News otherNews = setUpNews();
        assertEquals(2,newsDao.all().size());
        newsDao.deleteById(testNews.getId());
        assertEquals(1,newsDao.all().size());
    }

    @Test
    public void clearAll_clearsAllData_true() {
        News testNews = setUpNews();
        News otherNews = setUpNews();
        newsDao.clearAll();
        assertEquals(0,newsDao.all().size());
    }

    public News setUpNews(){
        News news = new News("Christine","my news",3);
        newsDao.add(news);
        return news;
    }

    public News setUpNewsForDepartment(Departments department){
        News news = new News("Christine","my news",department.getId());
        newsDao.add(news);
        return news;
    }

    public Departments setUpDepartment(){
       Departments department = new Departments("support","computers",46);
        departmentsDao.add(department);
        return department;
    }

}