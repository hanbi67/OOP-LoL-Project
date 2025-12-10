//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("==== 소환사의 협곡에 오신 것을 환영합니다. ====");

        Champion ashe = new Ashe("애쉬", 1, 200, 30, 20);
        Champion garen = new Garen("가렌", 1, 320, 30, 40);
        Champion lux = new Lux("럭스", 1, 320, 30, 40);
        Champion teemo = new Teemo("티모", 1, 320, 30, 40);
        
        
        
        System.out.println("=== 전투 시작 ===");

        ashe.basicAttack(garen);
        garen.basicAttack(ashe);
        lux.basicAttack(teemo);
        teemo.basicAttack(lux);

        ashe.useQ(garen);
        garen.useW(ashe);
        lux.useE(teemo);
        teemo.useR(lux);


        garen.levelUp();

        System.out.println("=== 전투 종료 ===");
        System.out.println("=== 전투 결과 ===");

        System.out.println(garen);
        System.out.println(ashe);
        System.out.println(lux);
        System.out.println(teemo);

    }
}