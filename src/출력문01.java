//모든 소스코드는 반드시 클래스 안에 작성해야한다.
//모든 소스코드는 반드시 main 매소드 안에작성해야 한다.!
//main 매소드 안의 소스코드는 위에서부터 한 줄씩 차례대로 실행된다.

import java.beans.JavaBean;
import java.net.SocketOption;

public class 출력문01 {
    public static void main(String[] args){
        //psvm후 cntl+space단축키 or main후cntl+space단축키
        System.out.println();
        //sout단축키
        System.out.println("java");
        System.out.println("123");
        //""안에 숫자가 있으면 숫자가아니라 문자로 인식한다.
        System.out.println(123);
        //""가 없어도 숫자는 출력이된다.
        //System.out.println(Java);
        // 문자는 ""없이는 출력이안되고 오류가 난다.
        System.out.println(123.45);
    }                                                           //앞에 띄어진건 들여쓰기
}