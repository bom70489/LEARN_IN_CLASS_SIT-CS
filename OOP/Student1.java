public class Student1 {
    public static void main(String[] args) {
       	// DO NOT MODIFY THE DRIVER CLASS
        Student boy = new Student(1133,"Thanaphon",'M',73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}

class Student {
	private int id;
    private String name;
    private char gender;
    private int score;

    public Student(int id, String name, char gender, int score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
 
    public char calGPA() {
        if(this.score >= 80) {
            return 'A';
        } else if(this.score >= 70) {
            return 'B';
        } else if(this.score >= 60) {
            return  'C';
        } else if(this.score >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
