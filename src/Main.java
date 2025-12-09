//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        Champion ashe = new Ashe("애쉬", 1, 200, 80, 20);
        Champion garen = new Garen("가렌", 1, 320, 30, 40);

        System.out.println("=== 전투 시작 ===");

        ashe.basicAttack(garen);
        garen.basicAttack(ashe);

        ashe.useQ(garen);
        garen.useQ(ashe);

        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");

        System.out.println(garen);
        System.out.println(ashe);

    }
}