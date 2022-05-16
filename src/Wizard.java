class Wizard extends Character{
    /**
     *   Wizard constructor inherits character class
     */

    Wizard(String name, int lvl, int hp, int mana){
        super(name,lvl,hp,mana);
    }

    /**
     *  Wizard's Skills method class
     *  Wizard's First Skill (Early level Skill of Wizard)
     */
    public void SuntokniManny(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Suntok ni Manny (Damage - 50)");
        int damagePoints = 50;
        int manaDecrease = 25;
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }

    /**
     * Wizard's Second Skill: Healing Galing (Health increasing Skill)
     */

    public void HealingGaling(){
        super.hp += 60;
        System.out.println(super.characterName + " used Healing Galing!\nHealth restored + 60 hp");
    }
    /**
     * Wizard's Ultimate Skill (Highest Damage among the other skills)
     */

    public void GripoSaTagiliran (Character enemyCharacter, Character name){
        int damagePoints = 150;
        int manaDecrease = 50;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Gripo sa Tagiliran (Damage - 150)");
        damageTarget(enemyCharacter,damagePoints,manaDecrease,name);
    }
}