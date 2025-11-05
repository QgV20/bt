class Teacher {
    private String id;
    private String fullname;
    private String email;
    private String title;

    public Teacher(String id, String fullname, String email, String title) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getTitle() {
        return title;
    }
    public void print() {
        System.out.println("Teacher: " + fullname + ", Title: " + title + ", ID: " + id + ", Email: " + email);
    }
}