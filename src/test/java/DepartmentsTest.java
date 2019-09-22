import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Departments setUpDept(){
        return new Departments("Accounts","Deals with money",32);
    }

    @Test
    public void Departments_departmentInstanceOfDepartments_true() {
        assertTrue(setUpDept() instanceof Departments);
    }

    @Test
    public void getDeptName_departmentInstantiatesWithName_true() {
        assertEquals("Accounts",setUpDept().getDeptName());
    }

    @Test
    public void getDeptName_departmentInstantiatesWithName_true() {
        assertEquals("Accounts",setUpDept().getDescription());
    }

    @Test
    public void getDeptName_departmentInstantiatesWithName_true() {
        assertEquals("Accounts",setUpDept().getEmpNumber());
    }
}