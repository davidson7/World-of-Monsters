public class Animal extends Monster{
  private String classification;

  public Animal(){
    classification = "";
  }

  public Animal(String c, String n, String o){
    super(n,o);
    classification = c;
  }
}
