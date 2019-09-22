package models;

import java.util.Objects;

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

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departments that = (Departments) o;
        return empNumber == that.empNumber &&
                id == that.id &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptName, description, empNumber, id);
    }
}
