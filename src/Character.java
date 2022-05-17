class Character {
    public String characterName;
    public int level;
    public int hp;
    public int mp;


    /**
     * two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("null");
    }
    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String name, int lvl, int health, int mana) {
        characterName = name;
        level = lvl;
        hp = health;
        mp = mana;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter, int damagePoints, int manaDecrease, Character name) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.hp -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.hp);
        name.mp = name.mp - manaDecrease;

        /**
         * Prompt Character is defeated if HP falls below 0
         */
        // + Level Up Character
        if (enemyCharacter.hp <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
        } else name.level += 1;
        System.out.println(name.characterName + " Level up!!");


    }

    /**
     * method  displaying current character details
     */

    public void displaydetails() {
        System.out.println("Player : " + characterName);
        System.out.println("Health Points : " + hp);
        System.out.println("Mana Points : " + mp);
        System.out.println("Level : " + level);
        System.out.print("\n");
    }


    public void displaywinner(){
        //Declaring the Winner
        if (hp >= 1) {
            System.out.println(characterName + " WINS!!!");
        }
    }


    }

