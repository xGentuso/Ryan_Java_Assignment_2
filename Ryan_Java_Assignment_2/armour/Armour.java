package armour;

public abstract class Armour {
  private int armourAmount;
  private int dexterityCost;
  private String armourType = "";

  public Armour() {
    // do nothing
  }

  //================>>
  // GETTERS
  public int getArmourAmount() {
    return this.armourAmount;
  }
  public int getDexterityCost() {
    return this.dexterityCost;
  }
  public String getArmourType(){
    return this.armourType;
  }
  // takes the armour protection into account
  // reduces the overall damage based on armour typ
  public abstract int getFinalDamage(int damage);

  //================>>
  // SETTERS
  public void setArmourAmount(int armourAmount) {
    this.armourAmount = armourAmount;
  }
  public void setDexterityCost(int dexterityCost) {
    this.dexterityCost = dexterityCost;
  }
  public void setArmourType(String armourType) {
    this.armourType = armourType;
  }
} // class
