package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public News setUpNews(){
        return new News("my news","Christine");
    }

    @Test
    public void News_newsInstanceOfNews_true() {
        assertTrue(setUpNews() instanceof News);
    }

//    @Test
//    public void getDeptName_departmentInstantiatesWithName_true() {
//        assertEquals("Accounts",setUpNews().getDeptName());
//    }
//
//    @Test
//    public void getDescription_departmentInstantiatesWithDeptDescription_true() {
//        assertEquals("Deals with money",setUpDept().getDescription());
//    }
//
//    @Test
//    public void getEmpNumber_departmentInstantiatesWithEmpNumber_true() {
//        assertEquals(32,setUpDept().getEmpNumber());
//    }

}