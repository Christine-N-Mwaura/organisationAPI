package models;

import java.util.Objects;

public class Users {
    private String name;
    private String position;
    private String roles;
    private int id;
    private int deptid;

    public Users(String name, String position, String roles){
        this.name = name;
        this.position = position;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                deptid == users.deptid &&
                Objects.equals(name, users.name) &&
                Objects.equals(position, users.position) &&
                Objects.equals(roles, users.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, roles, id, deptid);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getId() {
        return id;
    }

    public int getDeptid() {
        return deptid;
    }
}
