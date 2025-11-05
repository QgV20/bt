class KLTN<T, V> {
    private String topic;
    private T student;
    private V supervisor;

    public KLTN(String topic, T student, V supervisor) {
        this.topic = topic;
        this.student = student;
        this.supervisor = supervisor;
    }

    public String getTopicName() {
        return topic;
    }

    public void print() {
        System.out.println("Topic: " + topic);

        if (student instanceof Student) {
            ((Student) student).print();
        }

        if (supervisor instanceof Teacher) {
            ((Teacher) supervisor).print();
        } else{
            ((Advisor) supervisor).print();
        }
    }
}