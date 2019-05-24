public class Monster{
  private String name;
  private String origin;

  private static int monsterCount;

  public Monster(){
    name = "";
    origin = "?";
    monsterCount ++;
  }

  public Monster(String n, String o){
    name = n;
    origin = o;
  }

  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setOrigin(String o){
    origin = o;
  }
  public String getOrigin(){
    return origin;
  }
  public String speak(){
    return ("Hi");
  }
  public String diet(){
    return("Meat");
  }
  public String getSpecial(){
    return "";
  }
  public int getIntSpecial(){
    return 0;
}

  public static int getMonsterCount(){
    return monsterCount;
  }
}
