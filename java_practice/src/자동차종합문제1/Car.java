package 자동차종합문제1;
//부모클래스
public class Car {
    double speed; // 스피드를 처음부터 더블로 받음! 왜?
    int oilEff; // 연비
    int tank;    // 연료탱크
    int seat;    // 좌석수
    String name;  //차 이름
    int[] distance = {0, 400, 200, 150, 300};
    // 0~4니까 0의 값 귀찮으니 넣어두고 거리 인스턴스 지정

    void sub (int a, int b) {       // a: 여행거리 ,b: 승객 수 받은 매개변수
        int pundo;  // 편도?
        if(b % seat != 0) {         // 승객수를 좌석수로 나눈 나머지가 0이 아니라면
            pundo = b / seat + 1;  // 승객수를 좌석수로 나눈 몫에 +1해줌
        } else {pundo = b / seat;}   // 그렇지 않으면(나머지가 0이면) 그냥 값만
        double oil = ((double) distance[a]) /(tank * oilEff) * pundo;  // 실수형으로 설정. 총주유 = 거리 / (오일탱크 * 연비) * 승객 수
        double time = ((double)distance[a] /speed) * pundo * 60;   //총 시간 = 거리 / 속력 * 승객수 * 60(분)

        System.out.println("=".repeat(5) + name + "=".repeat(5));
        System.out.println("총 비용 : " + (int)(((double)distance[a] / oilEff) * 2000) * pundo + "원"); //총비용은 거리 / 연비
        System.out.println("총 주유 횟수 : " + (int)Math.ceil(oil) + "회");
        System.out.println("총 이동 시간 : "+ (int)time/60 + "시간 " +  (int) time % 60 + "분"); //Math.ceil이 뭐지?? 입력받은 숫자를 올림한 정수
    }
}
class SportsCar extends Car{
    public SportsCar(int d) {
        super();
        name = "sportsCar";
        speed = 250;
        oilEff = 8;
        tank = 30;
        seat= 2;
        if(d == 1) {  // 참이라면
            speed = speed * 1.2;
        }
    }
}

class Sedan extends Car{
    public Sedan(int d) {
        super();
        name = "sedan";
        speed = 200;
        oilEff = 12;
        tank = 45;
        seat = 4;
        if(d == 1) { // 참이라면
           tank = tank + 30;
        }
    }
}

class Sedan2 extends Car{
    public Sedan2 (int d) {

        name = "sedan";
        speed = 200;
        oilEff = 12;
        tank = 45;
        seat = 4;
        if(d == 1){ //참이라면
            seat=seat + 1;
        }
    }
}
class Bus extends Car{
    public Bus(int d) {
        super();
        name = "sedan";
        speed = 150;
        oilEff = 5;
        tank = 100;
        seat = 20;
        if(d == 1) { // 참이라면
            tank = tank + 30;
        }
    }
}
