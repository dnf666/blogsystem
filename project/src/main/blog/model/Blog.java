package model;

public class Blog {
    private Integer id;

    private String title;

    private String describle;

    private String writer;

    private String context;

    public Blog(Integer id, String title, String describle, String writer, String context) {
        this.id = id;
        this.title = title;
        this.describle = describle;
        this.writer = writer;
        this.context = context;
    }

    public Blog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}