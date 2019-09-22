package models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id &&
                deptid == news.deptid &&
                Objects.equals(content, news.content) &&
                Objects.equals(writtenBy, news.writtenBy) &&
                Objects.equals(type, news.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, writtenBy, deptid, type);
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }
}
