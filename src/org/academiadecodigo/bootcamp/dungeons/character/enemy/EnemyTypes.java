package org.academiadecodigo.bootcamp.dungeons.character.enemy;

public enum EnemyTypes {
    RAT (20,5,6,1,8,0,0,6),
    TROLL(50,20,6,6,15,0,0,6),
    GOBLIN(50,25,6,6,35,0,0,6),
    ORC(70,25,7,4,35,0,0,7),
    SKELETON(65,45,7,5,43,0,0,7),
    MINOTAUR(185,160,9,15,100,0,0,9),
    HUNTER(100,150,10,8,120,0,0,10);

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

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getEvasionChance() {
        return evasionChance;
    }

    public void setEvasionChance(int evasionChance) {
        this.evasionChance = evasionChance;
    }

    public int getPhysicalResistance() {
        return physicalResistance;
    }

    public void setPhysicalResistance(int physicalResistance) {
        this.physicalResistance = physicalResistance;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMagicalResistance() {
        return magicalResistance;
    }

    public void setMagicalResistance(int magicalResistance) {
        this.magicalResistance = magicalResistance;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }
}


