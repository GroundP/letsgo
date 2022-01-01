package Jungseok;

public class FinalPrac {
    final int NUMBER;
    final String KIND;
    static final int width = 100;
    final static int height = 250;

    FinalPrac(String kind, int num){
        // 매개변수로 넘겨받은 값으로 final 멤버변수를 초기화
        KIND = kind;
        NUMBER = num;
    }

    public static void main(String[] args) {
        FinalPrac f = new FinalPrac("HEART", 10);
        //f.NUMBER = 5;   // Error
        System.out.println(f.KIND);
        System.out.println(f.NUMBER);
        //height = 50;    // Error
        System.out.println(height); // 클래스 변수(static)은 클래스 이름없이 사용 가능하다
        System.out.println(width);
    }
}
