public class Garen extends Champion implements MeleeChampion{

    //생성자
    public Garen(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage, defense);
    }

    //가렌만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 결정타(Q)!");
        target.takeDamage(getAttackDamage() + 30);
    }

    @Override
    public void dash(Champion target){
        System.out.println(getName() + " 돌진!");
        target.takeDamage(50);
    }

}
