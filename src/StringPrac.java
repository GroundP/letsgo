public class StringPrac {

    void equals() {
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }

    void indexOf()
    {
        String a = "Hello Java";
        System.out.println(a.indexOf("o"));
    }

    void replaceAll(){
        String a = "Hello Java";
        System.out.println(a.replaceAll("Java", "c++"));
    }

    void subString(){
        String a = "Hello Java";
        System.out.println(a.substring(1,5));
    }

    void StringBuffer()
    {
        StringBuffer buf = new StringBuffer();
        buf.append("asd");
        buf.append(" ");
        buf.append("fgh");
        String result = buf.toString();
        System.out.println(result);
    }
    public static void main(String[] args) {
        String a = "Happy Java"; // 리터럴 방식으로 대입
        String b = "123"; // 리터럴 방식으로 대입

        String a2 = new String("Happy Java");   // 객체 생성 방식으로 대입
        String b2 = new String("123");   // 객체 생성 방식으로 대입

        StringPrac prac = new StringPrac();
//        prac.equals();
//        prac.indexOf();
//        prac.replaceAll();
//        prac.subString();
        prac.StringBuffer();
    }
}
