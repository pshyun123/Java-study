//package 제네릭;
//
//public class GenericEx {
//    public static void main(String[] args) {
//        //메인 제네틱 사용----2번
////        Person <String> p1 = new Person<> ("안유진"); //String 넣어서 문자열 넣어줌.
////        System.out.println(p1.info);
////        Person<Integer> p2 = new Person<>(21);
////        System.out.println(p2.info);
//        //막아두고 아래 값 입력---4번
//        Product<String, Integer> pr1 = new Product<>(); //왜?
//        pr1.setName("스마트티비");
//        pr1.setYear(2023);
//        System.out.println(pr1.getName()+" "+pr1.getYear());
//
//        Product<Integer, String> pr2 = new Product<>();
//        pr2.setName(123);
//        pr2.setYear("2023");
//        System.out.println(pr2.getName()+" "+pr2.getYear());
//
//    }
////get,set차이
//    class Product<T,M> { // 타입변수 여러개도 가능---3번
//        private T name;
//        private  M year;// 여기까지 입력하고 게터 세터 해줌
//
//        public T getName() {
//            return name;
//        }
//
//        public void setName(T name) {
//            this.name = name;
//        }
//
//        public M getYear() {
//            return year;
//        }
//
//        public void setYear(M year) {
//            this.year = year;
//        }
//    }
//}
////아래의 Person class의 정보 먼저 넣어줌---1번
//class Person <T> {
//    public T info;
//    // public String info;
//    // String을 넣으면 infork 스트링이 됨. 인트는 인트. 타입 자체가 변수
//    // 객체타입은 아무거나 와도 처리할 수 있음. 기본타입은 안됨. 타입에 대한 일반화
//    Person(T info){ // Person(String info)
//        this.info = info;
//    }
//
//}