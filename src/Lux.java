public class Lux extends Champion implements MeleeChampion, TankerChampion{

    //생성자
    public Lux(String name) {
        super(name);
    }

    //럭스만의 Q 스킬
    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 광휘의 속박(Q)!");
        target.takeDamage(getAttackDamage() + 30);
        setBattleCount();
    }

    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 광란의 질주(W)!");
        target.takeDamage(getAttackDamage() + 40);
        setBattleCount();
    }

    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 충격파(E)!");
        target.takeDamage(getAttackDamage() * 2);
        setBattleCount();
    }

    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 최후의 섬광(R)!");
        target.takeDamage(getAttackDamage() + 10);
        setBattleCount();
    }

    //근거리 + 탱커
    @Override
    public void dash(Champion target){
        System.out.println(getName() + " 돌진!");
        target.takeDamage(50);
        setBattleCount();
    }

    @Override
    public void barrage(){
        System.out.println(getName() + " 방어!");
    }
}
