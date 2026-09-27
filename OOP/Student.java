class Student {
    private String name;
    private int age;
    private int score;

    public Student(String name , int age , int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getScore() {
        return this.score;
    }

    public String displayInfo() {
        return "Name: " + this.name + "\n" +
               "Age: " + this.age + "\n" +
               "Score: " + this.score; 
    }
}