package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램을 동작합니다.");
        printFooter();
    }

    public static void printHeader() { // [선언] 매개변수가 없는 경우: 매개변수를 비워두고 정의 [호출] 인수를 비워두고 호출
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }
    public static void printFooter() { // [선언] 반환 타입이 없는 경우: 반환 타입을 void 로 정의 [호출] 메서드만 호출, 반환 값 받지 않음.
        System.out.println("= 프로그램을 종료합니다 =");
        // void 와 return 생략: 모든 메서드는 항상 return 을 호출해야 한다.
        // 예외로 반환 타입 void 의 경우 return 을 생략해도 된다.
        // 자바 컴파일러가 반환 타입이 없는 경우에는 return 을 마지막 줄에 꼭 넣어준다.
        // 참고로 return 을 만나면 해당 메서든 종료된다.
    }
}
