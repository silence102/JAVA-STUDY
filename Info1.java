public class Info1 {

    // Tip1.. psvm = public static void main(String[] args) {}
    // Tip2.. sout = System.out.pringln();
    // Tip3.. soutv 입력 시 가까운 변수를 가져와 값과 함께 출력해준다.
    // Tip4.. ctrl + D 키를 누르면 한 줄을 다 복사, 붙여넣기 한다
    // Tip5.. Shift + f10: 코드 실행
    // Tip6.. Ctrl + Shift + f10: 현재 코드 실행
    // Tip7. Ctrl + Shift + Enter: 현재 문장 마침. 자동으로 ; 키 작성 후 다음 줄로 이동.
    // Tip8. Alt + Enter: 클래스 이름 바로 변경할 때 단축키
    // Tip9. Ctrl + N: 파일 빨리 찾기 명령어
    // Tip10. Ctrl + E -> Enter: 바로 이전의 파일로 이동

    public static void main(String[] args) {
        String title = "관례";
        String content = "클래스 명은 시작할 때 대문자로 시작, 나머지는(변수 명 등)은 시작할 때 소문자로 시작";
        String exception = "예외 2가지 1. 상수는 모두 대문자를 사용하고 언더바로 구분한다. ex) USER_LIMIT, 2. 패키지는 모두 소문자를 사용한다. ex) org.spring.boot\n";
        System.out.println(title);
        System.out.println(content);
        System.out.println(exception);

        String camelCase = "낙타표기법(Camel Case): 프로그래밍 변수, 함수, 클래스 등의 이름을 지을 때 많이 사용하는 표기법 중 하나.\n" +
                "이름이 여러 단어로 구성되었을 때, 각 단어의 첫 글자가 대문자로 시작하고, 이 대문자들이 낙타의 등봉처럼 보이는 것에서 유래.\n" +
                "낙타표기법을 사용하면 이름에 공백을 넣지 않고도 여러 단어를 쉽게 구분할 수 있으므로, 변수의 이름을 이해하기 쉽게 만들어준다.\n" +
                "또한, 대부분의 프로그래밍 언어에서는 이름에 공백을 포함할 수 없기 때문에, 낙타표기법은 이런 제한을 우회하는 좋은 방법이다.\n" +
                "ex) start.CommentJava, OrderDetail, firstName, userAccount\n";

        String variable = "참고로 변수 명은 의미있고, 그 용도를 설명할 수 있어야 한다.\n" +
                "ex) studentCount, maxScore, userAccount, orderCount\n";
        System.out.println(camelCase);
        System.out.println(variable);

        String literal = "변수에 할당되는 문자, 글자는 리터럴(literal)이라고 한다.\n" +
                "변수의 값은 변할 수 있지만 개발자가 입력한 고정된 값인 리터럴은 변하지 않는다.\n" +
                "입력하는 변수의 타입에 따라 정수 리터럴, 실수 리터럴, 문자열 리터럴 등으로 불린다.\n";
        System.out.println(literal);
    }
}
