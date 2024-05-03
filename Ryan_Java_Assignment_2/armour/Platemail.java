package armour;

public class Platemail extends Armour {
  private int armourAmount = 250;
  private int dexterityCost = 250;

  public Platemail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
  } // contructor

  public int getFinalDamage(int damage) {
    return damage - (this.armourAmount / 2);
  }
  
} // class
