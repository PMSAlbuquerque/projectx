package org.academiadecodigo.bootcamp.dungeons.character.enemy;

public enum EnemyTypes {
    RAT (20,5,6,1,8,0,0,6),
    TROLL(50,20,6,6,15,0,0,6),
    GOBLIN(50,25,6,6,35,0,0,6),
    ORC(70,25,7,4,35,0,0,7),
    SKELETON(65,45,7,5,43,0,0,7),
    ELITE_SKELETON(97, 68, 10, 8, 65, 0, 10, 10),
    MINOTAUR(185,160,9,15,100,0,0,9),
    ELITE_MINOTAUR(285, 240, 13, 22, 150, 0, 14,14),
    HUNTER(100,150,10,8,120,0,0,10),
    ELITE_HUNTER(150,270,15,12,190,0,15,15);

    private int healthPoints;
    private int experience;
    private int evasionChance;
    private int physicalResistance;
    private int strength;
    private int intelligence;
    private int magicalResistance;
    private int criticalChance;

    EnemyTypes(int healthPoints, int experience, int evasionChance, int physicalResistance, int strength, int intelligence, int magicalResistance, int criticalChance){
        this.healthPoints = healthPoints;
        this.experience = experience;
        this.evasionChance = evasionChance;
        this.physicalResistance = physicalResistance;
        this.strength = strength;
        this.intelligence = intelligence;
        this.magicalResistance = magicalResistance;
        this.criticalChance = criticalChance;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getExperience() {
        return experience;
    }

    public int getEvasionChance() {
        return evasionChance;
    }

    public int getPhysicalResistance() {
        return physicalResistance;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }


    public int getCriticalChance() {
        return criticalChance;
    }
}


