public class Ashe extends Champion implements RangedChampion{

    //생성자
    public Ashe(String name, int level, int hp, int attackDamage, int defense) {
        super(name, level, hp, attackDamage, defense);
    }

    //애쉬만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 연사(Q)!");
        target.takeDamage(getAttackDamage() * 2);
    }

    @Override
    public void kite(){
        System.out.println(getName() + " 카이팅!");
    }

}
