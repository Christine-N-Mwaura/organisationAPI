package models;

public class News {
    private int id;
    private String content;
    private String writtenBy;
    private int deptid;
    private String type;

    public News(String content, String writtenBy){
        this.content = content;
        this.writtenBy = writtenBy;

    }

}
