class Advisor {
    private String fullname;
    private String email;

    public Advisor(String fullname, String email) {
        this.fullname = fullname;
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public void print() {
        System.out.println("Advisor: " + fullname + ", Email: " + email);
    }
}