package Thread;

import java.util.ArrayList;

public class ThreadPrac extends Thread {
    int idx;
    public ThreadPrac(int idx){
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
            Thread t = new ThreadPrac(i);
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
