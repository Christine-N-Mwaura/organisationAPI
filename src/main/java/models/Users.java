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
}
