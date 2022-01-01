package Thread;

import java.util.ArrayList;

// ThreadPrac와 같이 Thread 클래스를 상속받는 경우도 사용하지만
// 메소드를 강제하면서 유연한 구조를 만들 수 있는 Runnable 인터페이스를 통해 스레드를 제어하는 것이 일반적이다.
public class ThreadPrac2 implements Runnable {
    int idx;
    public ThreadPrac2(int idx){
        this.idx = idx;
    }

    public void run(){
        System.out.println(idx+" thread start");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println(idx+" thread end");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for ( int i = 0; i < 10; i++ ){     // 총 10개의 스레드 생성, 실행
            Thread t = new Thread(new ThreadPrac2(i));
            t.start();
            threads.add(t);
        }

        for (Thread a : threads ){
            try {
                a.join();   // 스레드가 종료할 때까지 기다린다.
            } catch (Exception e){
            }
        }

        System.out.println("main end");
    }
}
