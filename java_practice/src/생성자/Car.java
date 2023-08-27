package 생성자;
//생성자와 클래스 이름 같아야함
public class Car {
        String company = "현대자동차";
        String model;
        String color;
        int speed;
        int horsePower;

        Car() {}

        Car(String model) {
            this.model = model;
        }
        Car(String model, String color){
            this.model = model;
            this.color = color;
            this.speed = speed;
        }

        Car(String model, String color, int speed, int hp){
            this.model = model;
            this.color = color;
            this.speed = speed;
            this.horsePower = hp;
    }
    public void carInfo() {
            System.out.println(company);
            System.out.println(model);
            System.out.println(color);
            System.out.println(speed);
            System.out.println(horsePower);
    }
}
