import java.util.ArrayList;
import java.util.List;

public class Team<T extends Champion> {
    private List<T> members = new ArrayList<>();

    private String name;

    public Team(String teamName) {
        this.name = teamName;
    }

    public void addMember(T champion) {
        members.add(champion);
        System.out.println(champion.getName() + "이(가) " + name + " 팀에 합류!");
    }

    public int getTotalHp() {
        return members.stream()
                .mapToInt(Champion::getHp)
                .sum();
    }

    public List<T> getMembers() {
        return members;
    }

    //팀 이름 게터 가져오기
//private String name;
//    public String getName() {
//        return name;
//    }

    public T get(int index){
        return members.get(index);
    }

    public void printTeam(T list){
        System.out.println(list.getName());
    }

    public void printChampion(List<? extends Champion> list){
        for(Champion champion : list){
            System.out.println(champion.getName()); //챔피언 출력
        }
        //add 불가능
        //list.add(new Garen("가렌"));
    }

    public void printChampion2(List<? super Champion> list){
       //super 일때 add 가능
        list.add(new Garen("가렌"));
    }

    //와일드카드 적용해보기
    //챔피언과 상속 관계인
//    public static void printTeamMembers(List<? extends Champion> team){
//        for(Champion champion : team){
//            System.out.println("챔피언 출력: " + champion.getName());
//        }
//    }


}

