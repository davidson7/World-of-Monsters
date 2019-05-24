public class Undead extends Monster{
  private int yearDead;

  public Undead(){
    yearDead = 0;
  }

  public Undead(int year, String n, String o){
    super(n,o);
    yearDead = year;
  }

}
