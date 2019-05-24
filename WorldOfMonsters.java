import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorldOfMonsters{

public static void main(String[] args) {


  ArrayList <Monster> monsters = new ArrayList<Monster>();
  monsters.add(new Werewolf(10,"Mammal","Paul","Montana"));
  monsters.add(new Vampire(5,2000,"Vald","Pennsylvania"));
  monsters.add(new Zombie("A lampost",1983,"Sam","Texas"));
  monsters.add(new Vampire(0,1950,"Johnny","Kansas"));
  monsters.add(new Werewolf(5,"Mammal","Teresa","California"));
  monsters.add(new Zombie("Spiked Mace",1974,"Mary","Utah"));
  monsters.add(new Zombie("Fisticuffs",1898,"Charles","Georgia"));
  monsters.add(new Werewolf(21,"Mammal","Scarlett","Vermont"));
  monsters.add(new Werewolf(13,"Mammal","Bill Weasley","England"));
  monsters.add(new Vampire(13,1918,"Edward Cullen","Chicago, Illinois"));

  Collections.shuffle(monsters);
/*
  for(Monster m:monsters){
    System.out.println(m.getName());
    System.out.println(m.getClass());
    System.out.println(m.speak());
    System.out.println("They eat " + m.diet());
    if (m.getClass() == Vampire.class){
      System.out.println("Humans Drained: "+m.getIntSpecial());
    }else if(m.getClass() == Zombie.class){
      System.out.println("Favorite Weapon: "+m.getSpecial());
    }else if(m.getClass() == Werewolf.class){
      System.out.println("Days Til Transformation: "+m.getIntSpecial());
    }
    System.out.println();
  }
  */
  System.out.println("Monsters created: "+ Monster.getMonsterCount());

  Iterator itr = monsters.iterator();

  while(itr.hasNext()){
    Monster i = (Monster)itr.next();
    System.out.println(i);
  }
}
}
