package armour;

public class Chainmail extends Armour {
  private int armourAmount = 150;
  private int dexterityCost = 75;

  public Chainmail() {
    super();
    super.setArmourAmount(armourAmount);
    super.setDexterityCost(dexterityCost);
  } // contructor

  public int getFinalDamage(int damage) {
    return damage - (this.armourAmount / 5);
  }
  
} // class
