public class 출력문02 {
    public static void main(String[] args) {
        System.out.println(3+5);
        //()안의 내용이 연산 가능하면 연산결과를 출력
        System.out.println("3+5");
        //""안의숫자가 있기때문에 문자만 출력
        System.out.println("3"+"5");
        //자바애서 글자끼리의 합은 글자글을 나열한 결과와 같다.
        System.out.println("3"+" 5");
        //스페이스(빈공간도)글자로 인식
        System.out.println("3"+5);
        //문자와 숫자의 합은 문자끼리의 합과 같은 결과
        System.out.println(3+5+"2");
        System.out.println("3"+5+2);
        //문자인3과 숫자5가 합해질시 문자가된다. 따라서결과값은 352

    }
}

