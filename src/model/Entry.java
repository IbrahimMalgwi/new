package model;

public class Entry {
    private int id;
    private String body;

    public int getId() {
        return id;
    }

    private String title;

    public void setId(int id){
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body){
        this.body = body;
    }
    public void setTitle(String title){
        this.title = title;
    }
}
