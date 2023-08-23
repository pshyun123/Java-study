package 스트링;

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");
        String n = "     자바 프로그래밍     ";
        //String time = "10:23:45";
        //String[] result = time.split((":"));
        // for(String eee : modifyTime) System.out.print(eee + " ");
        System.out.println(a.equals(b)); // false 출력
        System.out.println(a.equals(c)); // true 출력
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.indexOf("o"));//문자가 시작되는 인덱스 반환 없을시 -1
        System.out.println(a.contains("lo"));//특정문자열 포함되어있는지
        System.out.println(c.charAt(0));
        System.out.println(b.replaceAll("java","JAVA"));
        System.out.println(a.substring(2));//해당인덱스~끝까지
        System.out.println(a.toUpperCase());
        System.out.println(c.toLowerCase());
        System.out.println(n.trim());


        System.out.println(String.format("I eat %s apples.", "five"));  // "I eat five apples." 출력
        System.out.println(String.format("I eat %d apples.", 3));  // "I eat 3 apples." 출력
        System.out.printf("I eat %d apples.", 3);

        String name = "James";
        char[] chName = name.toCharArray();
        for(char eCh : chName) System.out.print(eCh + " ");


    }
}
