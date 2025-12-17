import java.util.List;
import java.util.Random;

public class Battle {

    private static Random random = new Random();

    public static void oneVsOne(Team<Champion> red, Team<Champion> blue){
        Champion c1 = randompick(red.getMembers());
        Champion c2 = randompick(blue.getMembers());

        System.out.println("\n===== 1:1 전투 시작 =====");
        System.out.println(c1.getName() + " vs " + c2.getName());

        c1.basicAttack(c2);
        c2.basicAttack(c1);

        c1.useQ(c2);
        c2.useQ(c1);
    }

    private static Champion randompick(List<Champion> list){
        return list.get(random.nextInt(list.size()));
    }

}
