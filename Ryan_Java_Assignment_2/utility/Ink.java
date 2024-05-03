package utility;
import warrior.*;
import weapon.*;
import armour.*;

/*
 * Class for all of our in games prints
 */
public class Ink {
  
  public Ink() {
    // do nothing
  } // constructor

  public void welcome() {
    System.out.printf("""
      __        __             _             ____   ___ ____  _  _   
      \\ \\      / /_ _ _ __ ___(_)_ __ ___   |___ \\ / _ \\___ \\| || |  
       \\ \\ /\\ / / _` | '__/ __| | '_ ` _ \\    __) | | | |__) | || |_ 
        \\ V  V / (_| | |  \\__ \\ | | | | | |  / __/| |_| / __/|__   _|    
         \\_/\\_/ \\__,_|_|  |___/_|_| |_| |_| |_____|\\___/_____|  |_|  
        """);
  } // welcome()
  public void printWarriorMenu() {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Pick Your Warrior:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Human");
    System.out.println("2. Elf");
    System.out.println("3. Orc");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
}

public void printWeaponMenu() {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Pick Your Weapon:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Dagger");
    System.out.println("2. Sword");
    System.out.println("3. Axe");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
}

public void printArmourMenu() {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Pick Your Armour:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Leather");
    System.out.println("2. Chainmail");
    System.out.println("3. Platemail");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
}

public void printAttackMenu() {
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Choose Your Attack:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Normal");
    System.out.println("2. Heavy");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
}

public void printStats(Warrior player, Warrior enemy) {
    System.out.println("************************************");
    System.out.println("*           Battle Stats           *");
    System.out.println("************************************");
    System.out.printf("* Player   |   Health: %-10d *\n", player.getHealth());
    System.out.printf("*          |  Strength: %-10d *\n", player.getStrength());
    System.out.printf("*          | Dexterity: %-10d *\n", player.getDexterity());
    System.out.println("************************************");
    System.out.printf("* Enemy    |   Health: %-10d *\n", enemy.getHealth());
    System.out.printf("*          |  Strength: %-10d *\n", enemy.getStrength());
    System.out.printf("*          | Dexterity: %-10d *\n", enemy.getDexterity());
    System.out.println("************************************\n");
}

public void printWeaponType(Weapon playerWeapon, Weapon enemyWeapon) {
    System.out.println("************************************");
    System.out.println("*           Weapon Stats           *");
    System.out.println("************************************");
    System.out.printf("* Player   |  Type: %-15s  *\n", playerWeapon.getWeaponType());
    System.out.printf("*          | Damage: %-10d     *\n", playerWeapon.getDamageAmount());
    System.out.printf("*          | Dexterity Cost: %-5d *\n", playerWeapon.getDexterityCost());
    System.out.println("************************************");
    System.out.printf("* Enemy    |  Type: %-15s  *\n", enemyWeapon.getWeaponType());
    System.out.printf("*          | Damage: %-10d     *\n", enemyWeapon.getDamageAmount());
    System.out.printf("*          | Dexterity Cost: %-5d *\n", enemyWeapon.getDexterityCost());
    System.out.println("************************************\n");
}

public void printArmourType(Armour playerArmour, Armour enemyArmour) {
    System.out.println("************************************");
    System.out.println("*           Armour Stats           *");
    System.out.println("************************************");
    System.out.printf("* Player   |  Type: %-15s  *\n", playerArmour.getArmourType());
    System.out.printf("*          | Amount: %-10d     *\n", playerArmour.getArmourAmount());
    System.out.printf("*          | Dexterity: %-10d   *\n", playerArmour.getDexterityCost());
    System.out.println("************************************");
    System.out.printf("* Enemy    |  Type: %-15s  *\n", enemyArmour.getArmourType());
    System.out.printf("*          | Amount: %-10d     *\n", enemyArmour.getArmourAmount());
    System.out.printf("*          | Dexterity: %-10d   *\n", enemyArmour.getDexterityCost());
    System.out.println("************************************\n");
}


  public void printGameOver(String winner) {
    System.out.printf("""
       ____                         ___                 
      / ___| __ _ _ __ ___   ___   / _ \\__   _____ _ __ 
     | |  _ / _` | '_ ` _ \\ / _ \\ | | | \\ \\ / / _ \\ '__|
     | |_| | (_| | | | | | |  __/ | |_| |\\ V /  __/ |   
      \\____|\\__,_|_| |_| |_|\\___|  \\___/  \\_/ \\___|_| 
      \n %s\n\n  
      """, winner + " wins! Congrats");
        
  } // printGameOver()

} // class