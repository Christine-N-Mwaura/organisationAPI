package models;

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
}
