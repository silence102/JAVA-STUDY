package variable;
// 변수 타입2 - 숫자 타입

public class Var8 {
// 기본적으로 정수 리터럴은 int 를 기본으로 사용한다. int 범위를 벗어나면 L을 붙여 long 으로 변경한다.
// 기본적으로 실수 리터럴은 double 을 기본으로 사용한다. float 은 f를 붙여서 사용하는데 표현의 길이가 짧고 정밀도가 낮아서 실무에서는 잘 사용하지 않음.
    public static void main(String[] args) {
        // 정수
        byte b  = 127; // -128 ~ 127 (1byte)
        short s = 32767; // -32,768 ~ 32,767 (2byte)
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억) (4byte)
        long l = 9223372036854775807L; // // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte)

        // 실수
        float f = 10.0f; // (4byte)
        double d = 10.0; // (8byte)

        // boolean, char = 1byte
        // String: 문자열을 표현, 위의 표현들은 고정적으로 메모리를 잡아먹지만 String 은 메모리 사용량이 문자 길이에 따라 동적으로 달라진다.
    }
}
    /*
        < 변수 타입 정리 >
        자주 사용하는 타입
        - 정수: int, long(20억이 넘을 것 같으면), 파일 전송 시에만 byte 사용.
        - 실수: double
        - 불린형: boolean
        - 문자열: String
        이외의 타입은 알아만 두고 사용할 일은 거의 없음(short, float, char...)
     */