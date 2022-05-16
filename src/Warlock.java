class Warlock extends Character{
    /**
     *   Warlock constructor inherits character class
     */
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    /**
     *   Warlock's skill method class
     *   Warlock's First Skill (Early level Skill of Warlock)
     */

    public void Friendzone(Character enemyCharacter, Character name){
        int damagePoints = 50;
        int manaDecrease = 20;
        System.out.println(super.characterName + " Casts Friend Zone (-20 Mana) " + enemyCharacter.characterName + " Damage done(-50 hp)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }

    /**
     *  Warlock's Second Skill : Philhealth (Health increasing Skill)
     */
    public void Philhealth() {
        super.hp += 50;
        System.out.println(super.characterName+" Warlock cast Philhealth!\nHealth restored + 50hp");
    }

    /**
     * Warlock's Ultimate Skill (Highest Damage among the other skills)
     */

    public void EverlastingAnglit(Character enemyCharacter,Character name){
        int damagePoints = 150;
        int manaDecrease = 50;
        System.out.println(super.characterName + " Casts Everlasting Anglit (-50 Mana) " + enemyCharacter.characterName + " Damage done(-150 hp)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }
}