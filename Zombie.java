public class Zombie extends Undead{
  private String favWeapon;

public Zombie(){
  favWeapon = "";
}

public Zombie(String w, int year, String n, String o){
  super(year, n, o);
  favWeapon = w;
}

  public String getSpecial(){
    return favWeapon;
  }

  public String speak(){
    return("HNNNNnngg");
  }
  public String diet(){
    return("Brainz, of course.");
  }
}
