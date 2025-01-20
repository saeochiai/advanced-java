public class Ex06 {
    public static void main(String[] args) {

        
        Human human = new Human();

        human.setName("落合咲慧");
        human.setAge(24);
        human.setBirthplace("千葉県船橋市");
        
        System.out.println("Human[name="+human.getName()+",age"+human.getAge()+",birthplace="+human.getBirthplace()+"]");
    }

}
