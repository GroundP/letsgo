package Exception;

import java.lang.Exception;

class ProcessException extends Exception{

}

public class ThrowException {
    public void process(int idx){
        try {
            if ( idx == 2){ // 프로세스 2에서 에러 발생
                throw new ProcessException();
            }
            System.out.println("프로세스 "+idx+"실행(process)");
        }
        catch (ProcessException e){
            System.err.println("함수에서 에러가 발생했습니다.(프로세스 "+idx+")");
        }
    }

    public void process_throw(int idx) throws ProcessException{
        if ( idx == 2){ // 프로세스2 에서 에러 발생
            throw new ProcessException();
        }
        System.out.println("프로세스 "+idx+"실행(process_throw)");
    }

    public static void main(String[] args) {
        ThrowException ex = new ThrowException();
        ex.process(0);
        ex.process(1);
        ex.process(2);
        ex.process(3);  // 함수 내에서 예외처리를 할 경우 함수가 모두 호출된다.

        try {
            ex.process_throw(0);
            ex.process_throw(1);
            ex.process_throw(2);
            ex.process_throw(3); // 예외 던지기를 통해 main에서 예외처리 할 경우, Exception발생시 나머지 함수는 호출되지 않는다.
        }
        catch (ProcessException e){
            System.err.println("main에서 에러가 발생했습니다.");
            System.err.println("process를 모두 취소합니다.");
        }

        /// 트랜잭션의 경우 0,1,2,3 프로세스 중 하나라도 실패하면 모두 취소하고 이전으로 되돌아 가고 싶을 때
        /// 예외 던지기(throws)를 통해 모두 취소가 가능하다는 점 알길 바란다.
    }
}
