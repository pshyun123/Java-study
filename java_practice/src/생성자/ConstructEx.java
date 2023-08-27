package 생성자;

public class ConstructEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();
        Car santafe = new Car("SANTAFE");

        Car avante = new Car("AVANTE", "white");

        Car grandure = new Car("GRANDURE", "Black");//?

        Car tusan = new Car("TUSAN", "RED", 210,45);

    }
}
