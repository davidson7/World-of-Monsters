public class Werewolf extends Animal{
  private int daysTilTransform;

  public Werewolf(){
    daysTilTransform = 0;
  }
  public Werewolf(int d, String c, String n, String o){
    super(c,n,o);
    daysTilTransform = d;
}

  public int getIntSpecial(){
    return daysTilTransform;
  }

  public String speak(){
    return("Hooooooowl");
  }
  public String diet(){
    return("bloody meat");
  }
}
