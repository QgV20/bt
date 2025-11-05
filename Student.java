class Student {
    private String id;
    private String fullname;
    private String email;

    public Student(String id, String fullname, String email) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
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

    public void print() {
        System.out.println("Student: " + fullname + ",ID: " + id + ", Email: " + email);
    }
}