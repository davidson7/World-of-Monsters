public class Vampire extends Undead{
  private int humansAte;

  public Vampire(){
    humansAte = 0;
  }
  public Vampire(int humans, int year, String n, String o){
    super(year, n, o);
    humansAte = humans;
  }

  public int getIntSpecial(){
    return humansAte;
  }

  public String speak(){
    return ("I vant to suck your blood.");
  }
public String diet(){
  return ("Type A blood only");
}


}
