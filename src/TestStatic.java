//static 변수 두 개가 서로 참조할 때 초기화 순서 문제 test
public class TestStatic {
    //public static int A = B + 1;
    public static int B = 10;
    public static int A = B + 1;

    public static void main(String[] args) {
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
