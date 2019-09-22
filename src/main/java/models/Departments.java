package models;

public class Departments {
    private String deptName;
    private String description;
    private int empNumber;
    private int id;


    public Departments(String deptName, String description, int empNumber){
        this.deptName = deptName;
        this.description = description;
        this.empNumber = empNumber;

    }


    public String getDeptName() {
        return deptName;
    }

    public String getDescription() {
        return description;
    }

    public int getEmpNumber() {
        return empNumber;
    }
}
