public class Cars2 {
    public static void main(String[] args) {
        Car_Cars2 car1 = new Car_Cars2("101", "Car 1", "Blue", 20);
        Car_Cars2 car2 = new Car_Cars2("R9", "Car 2", "#f2f2f2", 35);
        Car_Cars2 car3 = new Car_Cars2("AZ-204", "Car 3", "Lightly Green", 2);
        
        car1.drive(10);
        System.out.println(car1.getDistance());
        System.out.println(Car_Cars2.accumulate_distance);
        
        car2.setColor("Red");
        System.out.println(car2.getColor());
        
        System.out.println(car1.getName());
        System.out.println(car3.getDistance());
        System.out.println(car3.getVelocity());
        
        car3.setVelocity(100);
        car3.drive(20);
        car2.drive(60);
        System.out.println(Car_Cars2.accumulate_distance);
        
        car1.setName("New Name");
        car3.setId("AZ-303");
        System.out.println(car1.getName());
        System.out.println(car3.getId());
    }
}

class Car_Cars2 {
    private String id;
    private String name;
    private String color;
    private int velocity = 0;
    private int distance = 0;

    public static int accumulate_distance = 0;

    public Car_Cars2(String id, String name, String color, int velocity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.velocity = velocity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void drive(int time) {
        int current_drive = time * velocity;
        this.distance += current_drive;
        accumulate_distance += current_drive;
    }

}