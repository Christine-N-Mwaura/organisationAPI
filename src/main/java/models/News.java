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

    public String getContent() {
        return content;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }
}
