public abstract class Champion {
    //공통된 것을 묶기//
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defense;

    public Champion(String name, int level, int hp, int attackDamage, int defense) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    //레벨업
    public void levelUp() {
        this.level += 1;
        this.hp += 10;
        this.attackDamage += 5;
        this.defense += 3;
    }

    //공격 받았을 때
    public void takeDamage(int damage){
        int actualDamage = damage - this.defense;
        if(actualDamage < 0) {
            actualDamage = 0;
        }

        hp -= actualDamage;

        System.out.println(name + "이(가) " + actualDamage + " 피해를 받았습니다!");
        System.out.println("현재 체력: " + hp);
    }

    //이름 변경
    public void changeName(String newName){
        this.name = newName;
    }

    //Q스킬
    public abstract void useQ(Champion target);

    //챔피언이 챔피언을 공격한다.
    public void basicAttack(Champion target){
        System.out.println(getName() + " → " + target.getName() + " 평타 공격!");
        target.takeDamage(attackDamage);
    }


    //게터
    public String getName(){
        return this.name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getHp() {
        return hp;
    }

    //세터
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Ashe{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", attackDamage=" + attackDamage +
                ", defense=" + defense +
                '}';
    }
}
