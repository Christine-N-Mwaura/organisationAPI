package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Users setUpUser(){
        return new Users("Fancy","Manager","govern");
    }

    @Test
    public void Users_departmentInstanceOfDepartments_true() {
        assertTrue(setUpUser() instanceof Users);
    }

}